package no.nav.foreldrepenger.vtp.testmodell.repo.impl;

import no.nav.foreldrepenger.vtp.testmodell.inntektytelse.InntektYtelseModell;
import no.nav.foreldrepenger.vtp.testmodell.organisasjon.OrganisasjonModell;
import no.nav.foreldrepenger.vtp.testmodell.personopplysning.Personopplysninger;
import no.nav.foreldrepenger.vtp.testmodell.repo.TemplateVariable;
import no.nav.foreldrepenger.vtp.testmodell.repo.TestscenarioTemplate;
import no.nav.foreldrepenger.vtp.testmodell.util.FindTemplateVariables;
import no.nav.foreldrepenger.vtp.testmodell.util.VariabelContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Set;

public class FileTestscenarioTemplate implements TestscenarioTemplate {

    private static final Logger LOG = LoggerFactory.getLogger(FileTestscenarioTemplate.class);

    public static final String PERSONOPPLYSNING_JSON_FILE = "personopplysning.json";
    public static final String ORGANISASJON_JSON_FILE = "organisasjon.json";
    public static final String VARS_JSON_FILE = "vars.json";

    private VariabelContainer vars = new VariabelContainer();
    private File templateDir;

    public FileTestscenarioTemplate(File templateDir, VariabelContainer vars) {
        this.templateDir = templateDir;
        this.vars.putAll(vars);
    }

    @Override
    public String getTemplateNavn() {
        return templateDir.getName();
    }

    @Override
    public VariabelContainer getDefaultVars() {
        return vars;
    }

    @Override
    public Set<TemplateVariable> getExpectedVars() {
        try (Reader personopplysningReader = personopplysningReader();
                Reader søkerInntektopplysningReader = inntektopplysningReader("søker");
                Reader annenpartInntektopplysningReader = inntektopplysningReader("annenpart");
                Reader organisasjonsReader = organisasjonReader()) {
            FindTemplateVariables finder = new FindTemplateVariables();

            finder.scanForVariables(Personopplysninger.class, personopplysningReader);
            finder.scanForVariables(InntektYtelseModell.class, søkerInntektopplysningReader);
            finder.scanForVariables(InntektYtelseModell.class, annenpartInntektopplysningReader);
            finder.scanForVariables(OrganisasjonModell.class, organisasjonsReader);

            return finder.getDiscoveredVariables();

        } catch (IOException e) {
            throw new IllegalStateException("Kunne ikke parse json", e);
        }
    }

    @Override
    public Reader personopplysningReader() throws FileNotFoundException {
        LOG.info("Leser personopplysninger fra mappe " + templateDir + ", fil: " + PERSONOPPLYSNING_JSON_FILE);
        File file = new File(templateDir, PERSONOPPLYSNING_JSON_FILE);
        return file.exists() ? new FileReader(file) : null;
    }

    @Override
    public Reader inntektopplysningReader(String rolle) throws FileNotFoundException {
        File file = new File(templateDir, String.format("inntektytelse-%s.json", rolle));
        return file.exists() ? new FileReader(file) : null;
    }

    @Override
    public Reader organisasjonReader() throws FileNotFoundException {
        return new FileReader(new File(templateDir, ORGANISASJON_JSON_FILE));
    }
}
