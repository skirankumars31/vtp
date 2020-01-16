package no.nav.tjeneste.virksomhet.person.v3;

import no.nav.foreldrepenger.vtp.testmodell.personopplysning.FamilierelasjonModell;
import no.nav.tjeneste.virksomhet.person.v3.informasjon.Familierelasjon;
import no.nav.tjeneste.virksomhet.person.v3.informasjon.Familierelasjoner;
import no.nav.tjeneste.virksomhet.person.v3.informasjon.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FamilierelasjonAdapter {

    public List<Familierelasjon> tilFamilerelasjon(Collection<FamilierelasjonModell> relasjoner){

        List<Familierelasjon> resultat = new ArrayList<>();
        for(FamilierelasjonModell rel: relasjoner) {
            Familierelasjon familierelasjon = new Familierelasjon();
            familierelasjon.setHarSammeBosted(true);
            Familierelasjoner familierelasjoner = new Familierelasjoner();
            familierelasjoner.setValue(rel.getRolleKode());
            familierelasjon.setTilRolle(familierelasjoner);

            Person tilBruker = new PersonAdapter().mapTilPerson(rel.getTil());
            familierelasjon.setTilPerson(tilBruker);
            resultat.add(familierelasjon);

        }
        return resultat;
    }
}
