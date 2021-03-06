package no.nav.tps.proxy.api.v1.innsyn.dto;

/*
 * TPS-PROXY API
 * <h4>Api for Tps-Proxy</h4><a href=\"https://confluence.adeo.no/display/FEL/TPS+-+Tjeneste+MQ+S301+-+Hent+Innsynsopplysninger+for+en+person\">Confluence for tps innsyn</a>
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

/**
 * Objekt retunert fra person-endepunktet
 */
@ApiModel(description = "Objekt retunert fra person-endepunktet")
@Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-11-26T18:30:44.418+01:00")
public class Personinfo   {
    @JsonProperty("adresseinfo")
    private Adresseinfo adresseinfo = null;

    @JsonProperty("alder")
    private Integer alder = null;

    @JsonProperty("antallBarn")
    private Integer antallBarn = null;

    @JsonProperty("antallLevendeBarnUnder18")
    private Integer antallLevendeBarnUnder18 = null;

    @JsonProperty("brukerbehovListe")
    private List<KodeMedDatoOgKilde> brukerbehovListe = null;

    @JsonProperty("datoFraOgMed")
    private String datoFraOgMed = null;

    @JsonProperty("doedsdato")
    private Doedsdato doedsdato = null;

    @JsonProperty("egenansatt")
    private Egenansatt egenansatt = null;

    @JsonProperty("foedselsdato")
    private String foedselsdato = null;

    @JsonProperty("foedtIKommune")
    private Kode foedtIKommune = null;

    @JsonProperty("foedtILand")
    private Kode foedtILand = null;

    @JsonProperty("foreldreansvar")
    private KodeMedDatoOgKilde foreldreansvar = null;

    @JsonProperty("ident")
    private String ident = null;

    @JsonProperty("identtype")
    private Kode identtype = null;

    @JsonProperty("innvandringUtvandring")
    private InnvandringUtvandring innvandringUtvandring = null;

    @JsonProperty("kilde")
    private String kilde = null;

    @JsonProperty("kjonn")
    private String kjonn = null;

    @JsonProperty("kontonummer")
    private Kontonummer kontonummer = null;

    @JsonProperty("navn")
    private Navn navn = null;

    @JsonProperty("oppholdstillatelse")
    private KodeMedDatoOgKilde oppholdstillatelse = null;

    @JsonProperty("relasjonFinnes")
    private Boolean relasjonFinnes = null;

    @JsonProperty("sivilstand")
    private KodeMedDatoOgKilde sivilstand = null;

    @JsonProperty("spesiellOpplysning")
    private KodeMedDatoOgKilde spesiellOpplysning = null;

    @JsonProperty("spraak")
    private KodeMedDatoOgKilde spraak = null;

    @JsonProperty("statsborgerskap")
    private KodeMedDatoOgKilde statsborgerskap = null;

    @JsonProperty("status")
    private KodeMedDatoOgKilde status = null;

    @JsonProperty("telefon")
    private Telefoninfo telefon = null;

    @JsonProperty("tiltak")
    private Tiltak tiltak = null;

    @JsonProperty("utenlandsinfoList")
    private List<InformasjonOmPersonUtland> utenlandsinfoList = null;

    @JsonProperty("utenlandskBank")
    private UtenlandskBank utenlandskBank = null;

    @JsonProperty("vergemaalListe")
    private List<Vergemaal> vergemaalListe = null;

    private Personinfo(Builder builder) {
        setAdresseinfo(builder.adresseinfo);
        setAlder(builder.alder);
        setAntallBarn(builder.antallBarn);
        setAntallLevendeBarnUnder18(builder.antallLevendeBarnUnder18);
        setBrukerbehovListe(builder.brukerbehovListe);
        setDatoFraOgMed(builder.datoFraOgMed);
        setDoedsdato(builder.doedsdato);
        setEgenansatt(builder.egenansatt);
        setFoedselsdato(builder.foedselsdato);
        setFoedtIKommune(builder.foedtIKommune);
        setFoedtILand(builder.foedtILand);
        setForeldreansvar(builder.foreldreansvar);
        setIdent(builder.ident);
        setIdenttype(builder.identtype);
        setInnvandringUtvandring(builder.innvandringUtvandring);
        setKilde(builder.kilde);
        setKjonn(builder.kjonn);
        setKontonummer(builder.kontonummer);
        setNavn(builder.navn);
        setOppholdstillatelse(builder.oppholdstillatelse);
        setRelasjonFinnes(builder.relasjonFinnes);
        setSivilstand(builder.sivilstand);
        setSpesiellOpplysning(builder.spesiellOpplysning);
        setSpraak(builder.spraak);
        setStatsborgerskap(builder.statsborgerskap);
        setStatus(builder.status);
        setTelefon(builder.telefon);
        setTiltak(builder.tiltak);
        setUtenlandsinfoList(builder.utenlandsinfoList);
        setUtenlandskBank(builder.utenlandskBank);
        setVergemaalListe(builder.vergemaalListe);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Personinfo copy) {
        Builder builder = new Builder();
        builder.adresseinfo = copy.getAdresseinfo();
        builder.alder = copy.getAlder();
        builder.antallBarn = copy.getAntallBarn();
        builder.antallLevendeBarnUnder18 = copy.getAntallLevendeBarnUnder18();
        builder.brukerbehovListe = copy.getBrukerbehovListe();
        builder.datoFraOgMed = copy.getDatoFraOgMed();
        builder.doedsdato = copy.getDoedsdato();
        builder.egenansatt = copy.getEgenansatt();
        builder.foedselsdato = copy.getFoedselsdato();
        builder.foedtIKommune = copy.getFoedtIKommune();
        builder.foedtILand = copy.getFoedtILand();
        builder.foreldreansvar = copy.getForeldreansvar();
        builder.ident = copy.getIdent();
        builder.identtype = copy.getIdenttype();
        builder.innvandringUtvandring = copy.getInnvandringUtvandring();
        builder.kilde = copy.getKilde();
        builder.kjonn = copy.getKjonn();
        builder.kontonummer = copy.getKontonummer();
        builder.navn = copy.getNavn();
        builder.oppholdstillatelse = copy.getOppholdstillatelse();
        builder.relasjonFinnes = copy.isRelasjonFinnes();
        builder.sivilstand = copy.getSivilstand();
        builder.spesiellOpplysning = copy.getSpesiellOpplysning();
        builder.spraak = copy.getSpraak();
        builder.statsborgerskap = copy.getStatsborgerskap();
        builder.status = copy.getStatus();
        builder.telefon = copy.getTelefon();
        builder.tiltak = copy.getTiltak();
        builder.utenlandsinfoList = copy.getUtenlandsinfoList();
        builder.utenlandskBank = copy.getUtenlandskBank();
        builder.vergemaalListe = copy.getVergemaalListe();
        return builder;
    }

    public Personinfo() {
    }

    public Personinfo adresseinfo(Adresseinfo adresseinfo) {
        this.adresseinfo = adresseinfo;
        return this;
    }

    /**
     * Get adresseinfo
     * @return adresseinfo
     **/
    @JsonProperty("adresseinfo")
    @ApiModelProperty(value = "")
    public Adresseinfo getAdresseinfo() {
        return adresseinfo;
    }

    public void setAdresseinfo(Adresseinfo adresseinfo) {
        this.adresseinfo = adresseinfo;
    }

    public Personinfo alder(Integer alder) {
        this.alder = alder;
        return this;
    }

    /**
     * Alder
     * @return alder
     **/
    @JsonProperty("alder")
    @ApiModelProperty(example = "29", value = "Alder")
    public Integer getAlder() {
        return alder;
    }

    public void setAlder(Integer alder) {
        this.alder = alder;
    }

    public Personinfo antallBarn(Integer antallBarn) {
        this.antallBarn = antallBarn;
        return this;
    }

    /**
     * Antall barn
     * @return antallBarn
     **/
    @JsonProperty("antallBarn")
    @ApiModelProperty(example = "2", value = "Antall barn")
    public Integer getAntallBarn() {
        return antallBarn;
    }

    public void setAntallBarn(Integer antallBarn) {
        this.antallBarn = antallBarn;
    }

    public Personinfo antallLevendeBarnUnder18(Integer antallLevendeBarnUnder18) {
        this.antallLevendeBarnUnder18 = antallLevendeBarnUnder18;
        return this;
    }

    /**
     * Antall levende barn under 18
     * @return antallLevendeBarnUnder18
     **/
    @JsonProperty("antallLevendeBarnUnder18")
    @ApiModelProperty(example = "1", value = "Antall levende barn under 18")
    public Integer getAntallLevendeBarnUnder18() {
        return antallLevendeBarnUnder18;
    }

    public void setAntallLevendeBarnUnder18(Integer antallLevendeBarnUnder18) {
        this.antallLevendeBarnUnder18 = antallLevendeBarnUnder18;
    }

    public Personinfo brukerbehovListe(List<KodeMedDatoOgKilde> brukerbehovListe) {
        this.brukerbehovListe = brukerbehovListe;
        return this;
    }

    public Personinfo addBrukerbehovListeItem(KodeMedDatoOgKilde brukerbehovListeItem) {
        if (this.brukerbehovListe == null) {
            this.brukerbehovListe = new ArrayList<>();
        }
        this.brukerbehovListe.add(brukerbehovListeItem);
        return this;
    }

    /**
     * Get brukerbehovListe
     * @return brukerbehovListe
     **/
    @JsonProperty("brukerbehovListe")
    @ApiModelProperty(value = "")
    public List<KodeMedDatoOgKilde> getBrukerbehovListe() {
        return brukerbehovListe;
    }

    public void setBrukerbehovListe(List<KodeMedDatoOgKilde> brukerbehovListe) {
        this.brukerbehovListe = brukerbehovListe;
    }

    public Personinfo datoFraOgMed(String datoFraOgMed) {
        this.datoFraOgMed = datoFraOgMed;
        return this;
    }

    /**
     * Get datoFraOgMed
     * @return datoFraOgMed
     **/
    @JsonProperty("datoFraOgMed")
    @ApiModelProperty(value = "")
    public String getDatoFraOgMed() {
        return datoFraOgMed;
    }

    public void setDatoFraOgMed(String datoFraOgMed) {
        this.datoFraOgMed = datoFraOgMed;
    }

    public Personinfo doedsdato(Doedsdato doedsdato) {
        this.doedsdato = doedsdato;
        return this;
    }

    /**
     * Get doedsdato
     * @return doedsdato
     **/
    @JsonProperty("doedsdato")
    @ApiModelProperty(value = "")
    public Doedsdato getDoedsdato() {
        return doedsdato;
    }

    public void setDoedsdato(Doedsdato doedsdato) {
        this.doedsdato = doedsdato;
    }

    public Personinfo egenansatt(Egenansatt egenansatt) {
        this.egenansatt = egenansatt;
        return this;
    }

    /**
     * Get egenansatt
     * @return egenansatt
     **/
    @JsonProperty("egenansatt")
    @ApiModelProperty(value = "")
    public Egenansatt getEgenansatt() {
        return egenansatt;
    }

    public void setEgenansatt(Egenansatt egenansatt) {
        this.egenansatt = egenansatt;
    }

    public Personinfo foedselsdato(String foedselsdato) {
        this.foedselsdato = foedselsdato;
        return this;
    }

    /**
     * Dato født, format (ISO-8601): yyyy-MM-dd
     * @return foedselsdato
     **/
    @JsonProperty("foedselsdato")
    @ApiModelProperty(example = "1999-05-30", value = "Dato født, format (ISO-8601): yyyy-MM-dd")
    public String getFoedselsdato() {
        return foedselsdato;
    }

    public void setFoedselsdato(String foedselsdato) {
        this.foedselsdato = foedselsdato;
    }

    public Personinfo foedtIKommune(Kode foedtIKommune) {
        this.foedtIKommune = foedtIKommune;
        return this;
    }

    /**
     * Get foedtIKommune
     * @return foedtIKommune
     **/
    @JsonProperty("foedtIKommune")
    @ApiModelProperty(value = "")
    public Kode getFoedtIKommune() {
        return foedtIKommune;
    }

    public void setFoedtIKommune(Kode foedtIKommune) {
        this.foedtIKommune = foedtIKommune;
    }

    public Personinfo foedtILand(Kode foedtILand) {
        this.foedtILand = foedtILand;
        return this;
    }

    /**
     * Get foedtILand
     * @return foedtILand
     **/
    @JsonProperty("foedtILand")
    @ApiModelProperty(value = "")
    public Kode getFoedtILand() {
        return foedtILand;
    }

    public void setFoedtILand(Kode foedtILand) {
        this.foedtILand = foedtILand;
    }

    public Personinfo foreldreansvar(KodeMedDatoOgKilde foreldreansvar) {
        this.foreldreansvar = foreldreansvar;
        return this;
    }

    /**
     * Get foreldreansvar
     * @return foreldreansvar
     **/
    @JsonProperty("foreldreansvar")
    @ApiModelProperty(value = "")
    public KodeMedDatoOgKilde getForeldreansvar() {
        return foreldreansvar;
    }

    public void setForeldreansvar(KodeMedDatoOgKilde foreldreansvar) {
        this.foreldreansvar = foreldreansvar;
    }

    public Personinfo ident(String ident) {
        this.ident = ident;
        return this;
    }

    /**
     * Personidentifikator
     * @return ident
     **/
    @JsonProperty("ident")
    @ApiModelProperty(example = "19189103843", value = "Personidentifikator")
    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public Personinfo identtype(Kode identtype) {
        this.identtype = identtype;
        return this;
    }

    /**
     * Get identtype
     * @return identtype
     **/
    @JsonProperty("identtype")
    @ApiModelProperty(value = "")
    public Kode getIdenttype() {
        return identtype;
    }

    public void setIdenttype(Kode identtype) {
        this.identtype = identtype;
    }

    public Personinfo innvandringUtvandring(InnvandringUtvandring innvandringUtvandring) {
        this.innvandringUtvandring = innvandringUtvandring;
        return this;
    }

    /**
     * Get innvandringUtvandring
     * @return innvandringUtvandring
     **/
    @JsonProperty("innvandringUtvandring")
    @ApiModelProperty(value = "")
    public InnvandringUtvandring getInnvandringUtvandring() {
        return innvandringUtvandring;
    }

    public void setInnvandringUtvandring(InnvandringUtvandring innvandringUtvandring) {
        this.innvandringUtvandring = innvandringUtvandring;
    }

    public Personinfo kilde(String kilde) {
        this.kilde = kilde;
        return this;
    }

    /**
     * Fra hvor informasjonen er oppgitt
     * @return kilde
     **/
    @JsonProperty("kilde")
    @ApiModelProperty(example = "SKD", value = "Fra hvor informasjonen er oppgitt")
    public String getKilde() {
        return kilde;
    }

    public void setKilde(String kilde) {
        this.kilde = kilde;
    }

    public Personinfo kjonn(String kjonn) {
        this.kjonn = kjonn;
        return this;
    }

    /**
     * Kjonn
     * @return kjonn
     **/
    @JsonProperty("kjonn")
    @ApiModelProperty(example = "M", value = "Kjonn")
    public String getKjonn() {
        return kjonn;
    }

    public void setKjonn(String kjonn) {
        this.kjonn = kjonn;
    }

    public Personinfo kontonummer(Kontonummer kontonummer) {
        this.kontonummer = kontonummer;
        return this;
    }

    /**
     * Get kontonummer
     * @return kontonummer
     **/
    @JsonProperty("kontonummer")
    @ApiModelProperty(value = "")
    public Kontonummer getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(Kontonummer kontonummer) {
        this.kontonummer = kontonummer;
    }

    public Personinfo navn(Navn navn) {
        this.navn = navn;
        return this;
    }

    /**
     * Get navn
     * @return navn
     **/
    @JsonProperty("navn")
    @ApiModelProperty(value = "")
    public Navn getNavn() {
        return navn;
    }

    public void setNavn(Navn navn) {
        this.navn = navn;
    }

    public Personinfo oppholdstillatelse(KodeMedDatoOgKilde oppholdstillatelse) {
        this.oppholdstillatelse = oppholdstillatelse;
        return this;
    }

    /**
     * Get oppholdstillatelse
     * @return oppholdstillatelse
     **/
    @JsonProperty("oppholdstillatelse")
    @ApiModelProperty(value = "")
    public KodeMedDatoOgKilde getOppholdstillatelse() {
        return oppholdstillatelse;
    }

    public void setOppholdstillatelse(KodeMedDatoOgKilde oppholdstillatelse) {
        this.oppholdstillatelse = oppholdstillatelse;
    }

    public Personinfo relasjonFinnes(Boolean relasjonFinnes) {
        this.relasjonFinnes = relasjonFinnes;
        return this;
    }

    /**
     * Om personen har en relasjon(ektefelle)
     * @return relasjonFinnes
     **/
    @JsonProperty("relasjonFinnes")
    @ApiModelProperty(example = "false", value = "Om personen har en relasjon(ektefelle)")
    public Boolean isRelasjonFinnes() {
        return relasjonFinnes;
    }

    public void setRelasjonFinnes(Boolean relasjonFinnes) {
        this.relasjonFinnes = relasjonFinnes;
    }

    public Personinfo sivilstand(KodeMedDatoOgKilde sivilstand) {
        this.sivilstand = sivilstand;
        return this;
    }

    /**
     * Get sivilstand
     * @return sivilstand
     **/
    @JsonProperty("sivilstand")
    @ApiModelProperty(value = "")
    public KodeMedDatoOgKilde getSivilstand() {
        return sivilstand;
    }

    public void setSivilstand(KodeMedDatoOgKilde sivilstand) {
        this.sivilstand = sivilstand;
    }

    public Personinfo spesiellOpplysning(KodeMedDatoOgKilde spesiellOpplysning) {
        this.spesiellOpplysning = spesiellOpplysning;
        return this;
    }

    /**
     * Get spesiellOpplysning
     * @return spesiellOpplysning
     **/
    @JsonProperty("spesiellOpplysning")
    @ApiModelProperty(value = "")
    public KodeMedDatoOgKilde getSpesiellOpplysning() {
        return spesiellOpplysning;
    }

    public void setSpesiellOpplysning(KodeMedDatoOgKilde spesiellOpplysning) {
        this.spesiellOpplysning = spesiellOpplysning;
    }

    public Personinfo spraak(KodeMedDatoOgKilde spraak) {
        this.spraak = spraak;
        return this;
    }

    /**
     * Get spraak
     * @return spraak
     **/
    @JsonProperty("spraak")
    @ApiModelProperty(value = "")
    public KodeMedDatoOgKilde getSpraak() {
        return spraak;
    }

    public void setSpraak(KodeMedDatoOgKilde spraak) {
        this.spraak = spraak;
    }

    public Personinfo statsborgerskap(KodeMedDatoOgKilde statsborgerskap) {
        this.statsborgerskap = statsborgerskap;
        return this;
    }

    /**
     * Get statsborgerskap
     * @return statsborgerskap
     **/
    @JsonProperty("statsborgerskap")
    @ApiModelProperty(value = "")
    public KodeMedDatoOgKilde getStatsborgerskap() {
        return statsborgerskap;
    }

    public void setStatsborgerskap(KodeMedDatoOgKilde statsborgerskap) {
        this.statsborgerskap = statsborgerskap;
    }

    public Personinfo status(KodeMedDatoOgKilde status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @JsonProperty("status")
    @ApiModelProperty(value = "")
    public KodeMedDatoOgKilde getStatus() {
        return status;
    }

    public void setStatus(KodeMedDatoOgKilde status) {
        this.status = status;
    }

    public Personinfo telefon(Telefoninfo telefon) {
        this.telefon = telefon;
        return this;
    }

    /**
     * Get telefon
     * @return telefon
     **/
    @JsonProperty("telefon")
    @ApiModelProperty(value = "")
    public Telefoninfo getTelefon() {
        return telefon;
    }

    public void setTelefon(Telefoninfo telefon) {
        this.telefon = telefon;
    }

    public Personinfo tiltak(Tiltak tiltak) {
        this.tiltak = tiltak;
        return this;
    }

    /**
     * Get tiltak
     * @return tiltak
     **/
    @JsonProperty("tiltak")
    @ApiModelProperty(value = "")
    public Tiltak getTiltak() {
        return tiltak;
    }

    public void setTiltak(Tiltak tiltak) {
        this.tiltak = tiltak;
    }

    public Personinfo utenlandsinfoList(List<InformasjonOmPersonUtland> utenlandsinfoList) {
        this.utenlandsinfoList = utenlandsinfoList;
        return this;
    }

    public Personinfo addUtenlandsinfoListItem(InformasjonOmPersonUtland utenlandsinfoListItem) {
        if (this.utenlandsinfoList == null) {
            this.utenlandsinfoList = new ArrayList<>();
        }
        this.utenlandsinfoList.add(utenlandsinfoListItem);
        return this;
    }

    /**
     * Get utenlandsinfoList
     * @return utenlandsinfoList
     **/
    @JsonProperty("utenlandsinfoList")
    @ApiModelProperty(value = "")
    public List<InformasjonOmPersonUtland> getUtenlandsinfoList() {
        return utenlandsinfoList;
    }

    public void setUtenlandsinfoList(List<InformasjonOmPersonUtland> utenlandsinfoList) {
        this.utenlandsinfoList = utenlandsinfoList;
    }

    public Personinfo utenlandskBank(UtenlandskBank utenlandskBank) {
        this.utenlandskBank = utenlandskBank;
        return this;
    }

    /**
     * Get utenlandskBank
     * @return utenlandskBank
     **/
    @JsonProperty("utenlandskBank")
    @ApiModelProperty(value = "")
    public UtenlandskBank getUtenlandskBank() {
        return utenlandskBank;
    }

    public void setUtenlandskBank(UtenlandskBank utenlandskBank) {
        this.utenlandskBank = utenlandskBank;
    }

    public Personinfo vergemaalListe(List<Vergemaal> vergemaalListe) {
        this.vergemaalListe = vergemaalListe;
        return this;
    }

    public Personinfo addVergemaalListeItem(Vergemaal vergemaalListeItem) {
        if (this.vergemaalListe == null) {
            this.vergemaalListe = new ArrayList<>();
        }
        this.vergemaalListe.add(vergemaalListeItem);
        return this;
    }

    /**
     * Get vergemaalListe
     * @return vergemaalListe
     **/
    @JsonProperty("vergemaalListe")
    @ApiModelProperty(value = "")
    public List<Vergemaal> getVergemaalListe() {
        return vergemaalListe;
    }

    public void setVergemaalListe(List<Vergemaal> vergemaalListe) {
        this.vergemaalListe = vergemaalListe;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Personinfo personinfo = (Personinfo) o;
        return Objects.equals(this.adresseinfo, personinfo.adresseinfo) &&
                Objects.equals(this.alder, personinfo.alder) &&
                Objects.equals(this.antallBarn, personinfo.antallBarn) &&
                Objects.equals(this.antallLevendeBarnUnder18, personinfo.antallLevendeBarnUnder18) &&
                Objects.equals(this.brukerbehovListe, personinfo.brukerbehovListe) &&
                Objects.equals(this.datoFraOgMed, personinfo.datoFraOgMed) &&
                Objects.equals(this.doedsdato, personinfo.doedsdato) &&
                Objects.equals(this.egenansatt, personinfo.egenansatt) &&
                Objects.equals(this.foedselsdato, personinfo.foedselsdato) &&
                Objects.equals(this.foedtIKommune, personinfo.foedtIKommune) &&
                Objects.equals(this.foedtILand, personinfo.foedtILand) &&
                Objects.equals(this.foreldreansvar, personinfo.foreldreansvar) &&
                Objects.equals(this.ident, personinfo.ident) &&
                Objects.equals(this.identtype, personinfo.identtype) &&
                Objects.equals(this.innvandringUtvandring, personinfo.innvandringUtvandring) &&
                Objects.equals(this.kilde, personinfo.kilde) &&
                Objects.equals(this.kjonn, personinfo.kjonn) &&
                Objects.equals(this.kontonummer, personinfo.kontonummer) &&
                Objects.equals(this.navn, personinfo.navn) &&
                Objects.equals(this.oppholdstillatelse, personinfo.oppholdstillatelse) &&
                Objects.equals(this.relasjonFinnes, personinfo.relasjonFinnes) &&
                Objects.equals(this.sivilstand, personinfo.sivilstand) &&
                Objects.equals(this.spesiellOpplysning, personinfo.spesiellOpplysning) &&
                Objects.equals(this.spraak, personinfo.spraak) &&
                Objects.equals(this.statsborgerskap, personinfo.statsborgerskap) &&
                Objects.equals(this.status, personinfo.status) &&
                Objects.equals(this.telefon, personinfo.telefon) &&
                Objects.equals(this.tiltak, personinfo.tiltak) &&
                Objects.equals(this.utenlandsinfoList, personinfo.utenlandsinfoList) &&
                Objects.equals(this.utenlandskBank, personinfo.utenlandskBank) &&
                Objects.equals(this.vergemaalListe, personinfo.vergemaalListe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adresseinfo, alder, antallBarn, antallLevendeBarnUnder18, brukerbehovListe, datoFraOgMed, doedsdato, egenansatt, foedselsdato, foedtIKommune, foedtILand, foreldreansvar, ident, identtype, innvandringUtvandring, kilde, kjonn, kontonummer, navn, oppholdstillatelse, relasjonFinnes, sivilstand, spesiellOpplysning, spraak, statsborgerskap, status, telefon, tiltak, utenlandsinfoList, utenlandskBank, vergemaalListe);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Personinfo {\n");

        sb.append("    adresseinfo: ").append(toIndentedString(adresseinfo)).append("\n");
        sb.append("    alder: ").append(toIndentedString(alder)).append("\n");
        sb.append("    antallBarn: ").append(toIndentedString(antallBarn)).append("\n");
        sb.append("    antallLevendeBarnUnder18: ").append(toIndentedString(antallLevendeBarnUnder18)).append("\n");
        sb.append("    brukerbehovListe: ").append(toIndentedString(brukerbehovListe)).append("\n");
        sb.append("    datoFraOgMed: ").append(toIndentedString(datoFraOgMed)).append("\n");
        sb.append("    doedsdato: ").append(toIndentedString(doedsdato)).append("\n");
        sb.append("    egenansatt: ").append(toIndentedString(egenansatt)).append("\n");
        sb.append("    foedselsdato: ").append(toIndentedString(foedselsdato)).append("\n");
        sb.append("    foedtIKommune: ").append(toIndentedString(foedtIKommune)).append("\n");
        sb.append("    foedtILand: ").append(toIndentedString(foedtILand)).append("\n");
        sb.append("    foreldreansvar: ").append(toIndentedString(foreldreansvar)).append("\n");
        sb.append("    ident: ").append(toIndentedString(ident)).append("\n");
        sb.append("    identtype: ").append(toIndentedString(identtype)).append("\n");
        sb.append("    innvandringUtvandring: ").append(toIndentedString(innvandringUtvandring)).append("\n");
        sb.append("    kilde: ").append(toIndentedString(kilde)).append("\n");
        sb.append("    kjonn: ").append(toIndentedString(kjonn)).append("\n");
        sb.append("    kontonummer: ").append(toIndentedString(kontonummer)).append("\n");
        sb.append("    navn: ").append(toIndentedString(navn)).append("\n");
        sb.append("    oppholdstillatelse: ").append(toIndentedString(oppholdstillatelse)).append("\n");
        sb.append("    relasjonFinnes: ").append(toIndentedString(relasjonFinnes)).append("\n");
        sb.append("    sivilstand: ").append(toIndentedString(sivilstand)).append("\n");
        sb.append("    spesiellOpplysning: ").append(toIndentedString(spesiellOpplysning)).append("\n");
        sb.append("    spraak: ").append(toIndentedString(spraak)).append("\n");
        sb.append("    statsborgerskap: ").append(toIndentedString(statsborgerskap)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    telefon: ").append(toIndentedString(telefon)).append("\n");
        sb.append("    tiltak: ").append(toIndentedString(tiltak)).append("\n");
        sb.append("    utenlandsinfoList: ").append(toIndentedString(utenlandsinfoList)).append("\n");
        sb.append("    utenlandskBank: ").append(toIndentedString(utenlandskBank)).append("\n");
        sb.append("    vergemaalListe: ").append(toIndentedString(vergemaalListe)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static final class Builder {
        private Adresseinfo adresseinfo;
        private Integer alder;
        private Integer antallBarn;
        private Integer antallLevendeBarnUnder18;
        private List<KodeMedDatoOgKilde> brukerbehovListe;
        private String datoFraOgMed;
        private Doedsdato doedsdato;
        private Egenansatt egenansatt;
        private String foedselsdato;
        private Kode foedtIKommune;
        private Kode foedtILand;
        private KodeMedDatoOgKilde foreldreansvar;
        private String ident;
        private Kode identtype;
        private InnvandringUtvandring innvandringUtvandring;
        private String kilde;
        private String kjonn;
        private Kontonummer kontonummer;
        private Navn navn;
        private KodeMedDatoOgKilde oppholdstillatelse;
        private Boolean relasjonFinnes;
        private KodeMedDatoOgKilde sivilstand;
        private KodeMedDatoOgKilde spesiellOpplysning;
        private KodeMedDatoOgKilde spraak;
        private KodeMedDatoOgKilde statsborgerskap;
        private KodeMedDatoOgKilde status;
        private Telefoninfo telefon;
        private Tiltak tiltak;
        private List<InformasjonOmPersonUtland> utenlandsinfoList;
        private UtenlandskBank utenlandskBank;
        private List<Vergemaal> vergemaalListe;

        private Builder() {
        }

        public Builder withAdresseinfo(Adresseinfo adresseinfo) {
            this.adresseinfo = adresseinfo;
            return this;
        }

        public Builder withAlder(Integer alder) {
            this.alder = alder;
            return this;
        }

        public Builder withAntallBarn(Integer antallBarn) {
            this.antallBarn = antallBarn;
            return this;
        }

        public Builder withAntallLevendeBarnUnder18(Integer antallLevendeBarnUnder18) {
            this.antallLevendeBarnUnder18 = antallLevendeBarnUnder18;
            return this;
        }

        public Builder withBrukerbehovListe(List<KodeMedDatoOgKilde> brukerbehovListe) {
            this.brukerbehovListe = brukerbehovListe;
            return this;
        }

        public Builder withDatoFraOgMed(String datoFraOgMed) {
            this.datoFraOgMed = datoFraOgMed;
            return this;
        }

        public Builder withDoedsdato(Doedsdato doedsdato) {
            this.doedsdato = doedsdato;
            return this;
        }

        public Builder withEgenansatt(Egenansatt egenansatt) {
            this.egenansatt = egenansatt;
            return this;
        }

        public Builder withFoedselsdato(String foedselsdato) {
            this.foedselsdato = foedselsdato;
            return this;
        }

        public Builder withFoedtIKommune(Kode foedtIKommune) {
            this.foedtIKommune = foedtIKommune;
            return this;
        }

        public Builder withFoedtILand(Kode foedtILand) {
            this.foedtILand = foedtILand;
            return this;
        }

        public Builder withForeldreansvar(KodeMedDatoOgKilde foreldreansvar) {
            this.foreldreansvar = foreldreansvar;
            return this;
        }

        public Builder withIdent(String ident) {
            this.ident = ident;
            return this;
        }

        public Builder withIdenttype(Kode identtype) {
            this.identtype = identtype;
            return this;
        }

        public Builder withInnvandringUtvandring(InnvandringUtvandring innvandringUtvandring) {
            this.innvandringUtvandring = innvandringUtvandring;
            return this;
        }

        public Builder withKilde(String kilde) {
            this.kilde = kilde;
            return this;
        }

        public Builder withKjonn(String kjonn) {
            this.kjonn = kjonn;
            return this;
        }

        public Builder withKontonummer(Kontonummer kontonummer) {
            this.kontonummer = kontonummer;
            return this;
        }

        public Builder withNavn(Navn navn) {
            this.navn = navn;
            return this;
        }

        public Builder withOppholdstillatelse(KodeMedDatoOgKilde oppholdstillatelse) {
            this.oppholdstillatelse = oppholdstillatelse;
            return this;
        }

        public Builder withRelasjonFinnes(Boolean relasjonFinnes) {
            this.relasjonFinnes = relasjonFinnes;
            return this;
        }

        public Builder withSivilstand(KodeMedDatoOgKilde sivilstand) {
            this.sivilstand = sivilstand;
            return this;
        }

        public Builder withSpesiellOpplysning(KodeMedDatoOgKilde spesiellOpplysning) {
            this.spesiellOpplysning = spesiellOpplysning;
            return this;
        }

        public Builder withSpraak(KodeMedDatoOgKilde spraak) {
            this.spraak = spraak;
            return this;
        }

        public Builder withStatsborgerskap(KodeMedDatoOgKilde statsborgerskap) {
            this.statsborgerskap = statsborgerskap;
            return this;
        }

        public Builder withStatus(KodeMedDatoOgKilde status) {
            this.status = status;
            return this;
        }

        public Builder withTelefon(Telefoninfo telefon) {
            this.telefon = telefon;
            return this;
        }

        public Builder withTiltak(Tiltak tiltak) {
            this.tiltak = tiltak;
            return this;
        }

        public Builder withUtenlandsinfoList(List<InformasjonOmPersonUtland> utenlandsinfoList) {
            this.utenlandsinfoList = utenlandsinfoList;
            return this;
        }

        public Builder withUtenlandskBank(UtenlandskBank utenlandskBank) {
            this.utenlandskBank = utenlandskBank;
            return this;
        }

        public Builder withVergemaalListe(List<Vergemaal> vergemaalListe) {
            this.vergemaalListe = vergemaalListe;
            return this;
        }

        public Personinfo build() {
            return new Personinfo(this);
        }
    }
}

