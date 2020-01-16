package no.nav.foreldrepenger.vtp.testmodell;

import no.nav.foreldrepenger.vtp.autotest.testscenario.personopplysning.AdresseModell;
import no.nav.foreldrepenger.vtp.autotest.testscenario.personopplysning.AdresseType;
import no.nav.foreldrepenger.vtp.autotest.testscenario.personopplysning.GateadresseModell;
import no.nav.foreldrepenger.vtp.autotest.testscenario.personopplysning.brukermodell.BarnModell;
import no.nav.foreldrepenger.vtp.autotest.testscenario.personopplysning.brukermodell.FamilierelasjonModell;
import no.nav.foreldrepenger.vtp.autotest.testscenario.personopplysning.brukermodell.SøkerModell;
import no.nav.foreldrepenger.vtp.testmodell.personopplysning.Personopplysninger;
import no.nav.foreldrepenger.vtp.testmodell.repo.TestscenarioImpl;
import no.nav.foreldrepenger.vtp.testmodell.repo.TestscenarioTemplate;
import no.nav.foreldrepenger.vtp.testmodell.repo.impl.BasisdataProviderFileImpl;
import no.nav.foreldrepenger.vtp.testmodell.repo.impl.TestscenarioRepositoryImpl;
import no.nav.foreldrepenger.vtp.testmodell.repo.impl.TestscenarioTemplateRepositoryImpl;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class ScenariosTest {

    private static final String TEST_SCENARIO_NAVN = "100-mor-og-far-bosatt-i-norge";

    @Test
    public void skal_laste_scenarios() throws Exception {
        boolean avsjekketEttScenario = false;
        TestscenarioTemplateRepositoryImpl templateRepository = TestscenarioTemplateRepositoryImpl.getInstance();
        templateRepository.load();

        Collection<TestscenarioTemplate> scenarioTemplates = templateRepository.getTemplates();

        TestscenarioRepositoryImpl testScenarioRepository = TestscenarioRepositoryImpl.getInstance(BasisdataProviderFileImpl.getInstance());
        for (TestscenarioTemplate sc : scenarioTemplates) {
            TestscenarioImpl testScenario = testScenarioRepository.opprettTestscenario(sc);
            sjekkIdenterErInjisert(testScenario);
            Personopplysninger pers = testScenario.getPersonopplysninger();
            assertThat(pers).isNotNull();
            SøkerModell søker = pers.getSøker();
            assertThat(pers.getFamilierelasjoner()).isNotEmpty();
            assertThat(søker.getGeografiskTilknytning()).isNotNull();

            if (sc.getTemplateNavn().equals(TEST_SCENARIO_NAVN)) {
                avsjekketEttScenario = avsjekkSpesifiktScenario(pers, søker);
            }
        }

        assertThat(avsjekketEttScenario).as("fant aldri scenario").isTrue();
    }

    private boolean avsjekkSpesifiktScenario(Personopplysninger pers, SøkerModell søker) {
        boolean avsjekketEttScenario;
        avsjekketEttScenario = true;

        assertThat(søker.getIdent()).isNotNull();

        FamilierelasjonModell familierelasjon = pers.getFamilierelasjoner(FamilierelasjonModell.Rolle.BARN).findFirst().get();
        assertThat(familierelasjon.getTil()).isNotNull();
        assertThat(familierelasjon.getTil()).isInstanceOf(BarnModell.class);
        // sjekk variable er satt inn
        assertThat(((BarnModell) familierelasjon.getTil()).getFornavn()).isEqualTo("Dole");

        assertThat(søker.getAdresser()).hasSize(1);
        // hentet fra adressekatalog ikke fra personopplysninger.json
        Optional<AdresseModell> bostedsAdresseOpt = søker.getAdresse(AdresseType.BOSTEDSADRESSE);
        assertThat(bostedsAdresseOpt).isPresent();
        GateadresseModell gateadresse = (GateadresseModell) bostedsAdresseOpt.get();
        assertThat(gateadresse.getGatenavn()).isEqualTo("Fjordlandet");
        assertThat(gateadresse.getFom()).isEqualTo(LocalDate.now().minusYears(1));
        return avsjekketEttScenario;
    }

    private void sjekkIdenterErInjisert(TestscenarioImpl sc) {
        sc.getIdenter().getAlleIdenter().entrySet().forEach(e -> {
            System.out.println(e);
        });
        System.out.println("--------------");
    }

}
