package no.nav.tjeneste.virksomhet.person.v3;

import no.nav.foreldrepenger.vtp.autotest.testscenario.personopplysning.BrukerModell;
import no.nav.foreldrepenger.vtp.autotest.testscenario.personopplysning.GeografiskTilknytningModell;
import no.nav.foreldrepenger.vtp.autotest.testscenario.personopplysning.PersonModell;
import no.nav.foreldrepenger.vtp.felles.ConversionUtils;
import no.nav.tjeneste.virksomhet.person.v3.informasjon.*;

import javax.xml.datatype.XMLGregorianCalendar;

public class PersonAdapter {

    public Bruker fra(BrukerModell bruker) {
        if (bruker instanceof PersonModell) {
            return fra((PersonModell) bruker);
        } else {
            return mapFraBruker(bruker);
        }
    }


    public Bruker fra(PersonModell person) {
        Bruker bruker = mapFraBruker(person);

        // Kjønn
        Kjoenn kjonn = new Kjoenn();
        Kjoennstyper kjonnstype = new Kjoennstyper();
        kjonnstype.setValue(person.getKjønnKode());
        kjonn.setKjoenn(kjonnstype);
        bruker.setKjoenn(kjonn);

        // Fødselsdato
        Foedselsdato fodselsdato = new Foedselsdato();
        XMLGregorianCalendar xcal = ConversionUtils.convertToXMLGregorianCalendar(person.getFødselsdato());
        fodselsdato.setFoedselsdato(xcal);
        bruker.setFoedselsdato(fodselsdato);

        // Navn
        Personnavn personnavn = new Personnavn();
        personnavn.setEtternavn(person.getEtternavn().toUpperCase());
        personnavn.setFornavn(person.getFornavn().toUpperCase());
        personnavn.setSammensattNavn(person.getEtternavn().toUpperCase() + " " + person.getFornavn().toUpperCase());
        bruker.setPersonnavn(personnavn);

        // PersonstatusModell
        Personstatus personstatus = new Personstatus();
        Personstatuser personstatuser = new Personstatuser();
        personstatuser.setValue(person.getPersonstatus().getStatus());
        personstatus.setPersonstatus(personstatuser);
        bruker.setPersonstatus(personstatus);

        // Målform
        Spraak spraak = new Spraak();
        spraak.setValue(person.getSpråk2Bokstaver());
        bruker.setMaalform(spraak);

        // Geografisk tilknytning
        bruker.setGeografiskTilknytning(tilGeografiskTilknytning(person));

        // SivilstandModell
        Sivilstand sivilstand = new Sivilstand();
        Sivilstander sivilstander = new Sivilstander();
        sivilstander.setValue(person.getSivilstand().getKode());
        sivilstand.setSivilstand(sivilstander);
        bruker.setSivilstand(sivilstand);

        // Diskresjonskode
        bruker.setDiskresjonskode(tilDiskresjonskode(person));

        // statsborgerskap

        bruker.setStatsborgerskap(new StatsborgerskapAdapter().fra(person.getStatsborgerskap()));

        new AdresseAdapter().setAdresser(bruker, person);

        return bruker;
    }

    public Person mapTilPerson(BrukerModell modell) {
        Person person = new Person();
        NorskIdent norskIdent = new NorskIdent();
        norskIdent.setIdent(modell.getIdent());
        PersonIdent personIdent = new PersonIdent();
        personIdent.setIdent(norskIdent);
        person.setAktoer(personIdent);

        return person;
    }

    private Bruker mapFraBruker(BrukerModell person) {
        Bruker bruker = new Bruker();

        // Ident
        NorskIdent norskIdent = new NorskIdent();
        norskIdent.setIdent(person.getIdent());
        Personidenter personidenter = new Personidenter();
        personidenter.setValue("fnr");
        norskIdent.setType(personidenter);

        PersonIdent personIdent = new PersonIdent();
        personIdent.setIdent(norskIdent);
        bruker.setAktoer(personIdent);
        return bruker;
    }

    public Diskresjonskoder tilDiskresjonskode(PersonModell bruker) {
        String kode = bruker.getDiskresjonskode();
        if (kode == null) {
            return null;
        }
        Diskresjonskoder diskresjonskoder = new Diskresjonskoder();
        diskresjonskoder.withKodeverksRef("Diskresjonskoder");
        diskresjonskoder.withKodeRef(kode);
        diskresjonskoder.withValue(kode);
        return diskresjonskoder;
    }

    public GeografiskTilknytning tilGeografiskTilknytning(PersonModell bruker) {
        GeografiskTilknytningModell tilknytning = bruker.getGeografiskTilknytning();
        if (tilknytning == null) {
            return null;
        } else {
            GeografiskTilknytning geo;
            switch (tilknytning.getGeografiskTilknytningType()) {
                case Land:
                    geo = new Land();
                    break;
                case Kommune:
                    geo = new Kommune();
                    break;
                case Bydel:
                    geo = new Bydel();
                    break;
                default:
                    return null;
            }
            geo.setGeografiskTilknytning(tilknytning.getKode());

            return geo;
        }
    }

}
