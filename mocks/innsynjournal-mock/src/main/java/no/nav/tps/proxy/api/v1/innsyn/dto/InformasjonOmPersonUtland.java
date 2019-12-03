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

import io.swagger.annotations.ApiModelProperty;

/**
 * InformasjonOmPersonUtland
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-11-27T10:31:32.432+01:00")
public class InformasjonOmPersonUtland   {
    @JsonProperty("datoFraOgMed")
    private String datoFraOgMed = null;

    @JsonProperty("familienavnFodt")
    private String familienavnFodt = null;

    @JsonProperty("farsFamilenavn")
    private String farsFamilenavn = null;

    @JsonProperty("farsFornavn")
    private String farsFornavn = null;

    @JsonProperty("foedested")
    private String foedested = null;

    @JsonProperty("fornavnFodt")
    private String fornavnFodt = null;

    @JsonProperty("idOff")
    private String idOff = null;

    @JsonProperty("institusjon")
    private String institusjon = null;

    @JsonProperty("institusjonNavn")
    private String institusjonNavn = null;

    @JsonProperty("kilde")
    private String kilde = null;

    @JsonProperty("kildePin")
    private String kildePin = null;

    @JsonProperty("land")
    private Kode land = null;

    @JsonProperty("morsFamilenavn")
    private String morsFamilenavn = null;

    @JsonProperty("morsFornavn")
    private String morsFornavn = null;

    @JsonProperty("nasjonalId")
    private String nasjonalId = null;

    @JsonProperty("nasjonalitet")
    private Kode nasjonalitet = null;

    @JsonProperty("sedRef")
    private String sedRef = null;

    @JsonProperty("sektor")
    private Kode sektor = null;

    public InformasjonOmPersonUtland datoFraOgMed(String datoFraOgMed) {
        this.datoFraOgMed = datoFraOgMed;
        return this;
    }

    /**
     * Dato gyldig, format (ISO-8601): yyyy-MM-dd
     * @return datoFraOgMed
     **/
    @JsonProperty("datoFraOgMed")
    @ApiModelProperty(example = "2015-12-15", value = "Dato gyldig, format (ISO-8601): yyyy-MM-dd")
    public String getDatoFraOgMed() {
        return datoFraOgMed;
    }

    public void setDatoFraOgMed(String datoFraOgMed) {
        this.datoFraOgMed = datoFraOgMed;
    }

    public InformasjonOmPersonUtland familienavnFodt(String familienavnFodt) {
        this.familienavnFodt = familienavnFodt;
        return this;
    }

    /**
     * Familienavn
     * @return familienavnFodt
     **/
    @JsonProperty("familienavnFodt")
    @ApiModelProperty(value = "Familienavn")
    public String getFamilienavnFodt() {
        return familienavnFodt;
    }

    public void setFamilienavnFodt(String familienavnFodt) {
        this.familienavnFodt = familienavnFodt;
    }

    public InformasjonOmPersonUtland farsFamilenavn(String farsFamilenavn) {
        this.farsFamilenavn = farsFamilenavn;
        return this;
    }

    /**
     * Etternavn far
     * @return farsFamilenavn
     **/
    @JsonProperty("farsFamilenavn")
    @ApiModelProperty(value = "Etternavn far")
    public String getFarsFamilenavn() {
        return farsFamilenavn;
    }

    public void setFarsFamilenavn(String farsFamilenavn) {
        this.farsFamilenavn = farsFamilenavn;
    }

    public InformasjonOmPersonUtland farsFornavn(String farsFornavn) {
        this.farsFornavn = farsFornavn;
        return this;
    }

    /**
     * Fornavn far
     * @return farsFornavn
     **/
    @JsonProperty("farsFornavn")
    @ApiModelProperty(value = "Fornavn far")
    public String getFarsFornavn() {
        return farsFornavn;
    }

    public void setFarsFornavn(String farsFornavn) {
        this.farsFornavn = farsFornavn;
    }

    public InformasjonOmPersonUtland foedested(String foedested) {
        this.foedested = foedested;
        return this;
    }

    /**
     * Fødested
     * @return foedested
     **/
    @JsonProperty("foedested")
    @ApiModelProperty(value = "Fødested")
    public String getFoedested() {
        return foedested;
    }

    public void setFoedested(String foedested) {
        this.foedested = foedested;
    }

    public InformasjonOmPersonUtland fornavnFodt(String fornavnFodt) {
        this.fornavnFodt = fornavnFodt;
        return this;
    }

    /**
     * Fornavn
     * @return fornavnFodt
     **/
    @JsonProperty("fornavnFodt")
    @ApiModelProperty(value = "Fornavn")
    public String getFornavnFodt() {
        return fornavnFodt;
    }

    public void setFornavnFodt(String fornavnFodt) {
        this.fornavnFodt = fornavnFodt;
    }

    public InformasjonOmPersonUtland idOff(String idOff) {
        this.idOff = idOff;
        return this;
    }

    /**
     * Utenlandsk id
     * @return idOff
     **/
    @JsonProperty("idOff")
    @ApiModelProperty(example = "123-12343-123", value = "Utenlandsk id")
    public String getIdOff() {
        return idOff;
    }

    public void setIdOff(String idOff) {
        this.idOff = idOff;
    }

    public InformasjonOmPersonUtland institusjon(String institusjon) {
        this.institusjon = institusjon;
        return this;
    }

    /**
     * Instutisjon
     * @return institusjon
     **/
    @JsonProperty("institusjon")
    @ApiModelProperty(value = "Instutisjon")
    public String getInstitusjon() {
        return institusjon;
    }

    public void setInstitusjon(String institusjon) {
        this.institusjon = institusjon;
    }

    public InformasjonOmPersonUtland institusjonNavn(String institusjonNavn) {
        this.institusjonNavn = institusjonNavn;
        return this;
    }

    /**
     * InstutisjonNavn
     * @return institusjonNavn
     **/
    @JsonProperty("institusjonNavn")
    @ApiModelProperty(value = "InstutisjonNavn")
    public String getInstitusjonNavn() {
        return institusjonNavn;
    }

    public void setInstitusjonNavn(String institusjonNavn) {
        this.institusjonNavn = institusjonNavn;
    }

    public InformasjonOmPersonUtland kilde(String kilde) {
        this.kilde = kilde;
        return this;
    }

    /**
     * Get kilde
     * @return kilde
     **/
    @JsonProperty("kilde")
    @ApiModelProperty(value = "")
    public String getKilde() {
        return kilde;
    }

    public void setKilde(String kilde) {
        this.kilde = kilde;
    }

    public InformasjonOmPersonUtland kildePin(String kildePin) {
        this.kildePin = kildePin;
        return this;
    }

    /**
     * Kilde pinnummer
     * @return kildePin
     **/
    @JsonProperty("kildePin")
    @ApiModelProperty(example = "E501", value = "Kilde pinnummer")
    public String getKildePin() {
        return kildePin;
    }

    public void setKildePin(String kildePin) {
        this.kildePin = kildePin;
    }

    public InformasjonOmPersonUtland land(Kode land) {
        this.land = land;
        return this;
    }

    /**
     * Get land
     * @return land
     **/
    @JsonProperty("land")
    @ApiModelProperty(value = "")
    public Kode getLand() {
        return land;
    }

    public void setLand(Kode land) {
        this.land = land;
    }

    public InformasjonOmPersonUtland morsFamilenavn(String morsFamilenavn) {
        this.morsFamilenavn = morsFamilenavn;
        return this;
    }

    /**
     * Etternavn mor
     * @return morsFamilenavn
     **/
    @JsonProperty("morsFamilenavn")
    @ApiModelProperty(value = "Etternavn mor")
    public String getMorsFamilenavn() {
        return morsFamilenavn;
    }

    public void setMorsFamilenavn(String morsFamilenavn) {
        this.morsFamilenavn = morsFamilenavn;
    }

    public InformasjonOmPersonUtland morsFornavn(String morsFornavn) {
        this.morsFornavn = morsFornavn;
        return this;
    }

    /**
     * Fornavn mor
     * @return morsFornavn
     **/
    @JsonProperty("morsFornavn")
    @ApiModelProperty(value = "Fornavn mor")
    public String getMorsFornavn() {
        return morsFornavn;
    }

    public void setMorsFornavn(String morsFornavn) {
        this.morsFornavn = morsFornavn;
    }

    public InformasjonOmPersonUtland nasjonalId(String nasjonalId) {
        this.nasjonalId = nasjonalId;
        return this;
    }

    /**
     * Nasjonal id
     * @return nasjonalId
     **/
    @JsonProperty("nasjonalId")
    @ApiModelProperty(value = "Nasjonal id")
    public String getNasjonalId() {
        return nasjonalId;
    }

    public void setNasjonalId(String nasjonalId) {
        this.nasjonalId = nasjonalId;
    }

    public InformasjonOmPersonUtland nasjonalitet(Kode nasjonalitet) {
        this.nasjonalitet = nasjonalitet;
        return this;
    }

    /**
     * Nasjonalitet
     * @return nasjonalitet
     **/
    @JsonProperty("nasjonalitet")
    @ApiModelProperty(value = "Nasjonalitet")
    public Kode getNasjonalitet() {
        return nasjonalitet;
    }

    public void setNasjonalitet(Kode nasjonalitet) {
        this.nasjonalitet = nasjonalitet;
    }

    public InformasjonOmPersonUtland sedRef(String sedRef) {
        this.sedRef = sedRef;
        return this;
    }

    /**
     * Get sedRef
     * @return sedRef
     **/
    @JsonProperty("sedRef")
    @ApiModelProperty(value = "")
    public String getSedRef() {
        return sedRef;
    }

    public void setSedRef(String sedRef) {
        this.sedRef = sedRef;
    }

    public InformasjonOmPersonUtland sektor(Kode sektor) {
        this.sektor = sektor;
        return this;
    }

    /**
     * Get sektor
     * @return sektor
     **/
    @JsonProperty("sektor")
    @ApiModelProperty(value = "")
    public Kode getSektor() {
        return sektor;
    }

    public void setSektor(Kode sektor) {
        this.sektor = sektor;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InformasjonOmPersonUtland informasjonOmPersonUtland = (InformasjonOmPersonUtland) o;
        return Objects.equals(this.datoFraOgMed, informasjonOmPersonUtland.datoFraOgMed) &&
                Objects.equals(this.familienavnFodt, informasjonOmPersonUtland.familienavnFodt) &&
                Objects.equals(this.farsFamilenavn, informasjonOmPersonUtland.farsFamilenavn) &&
                Objects.equals(this.farsFornavn, informasjonOmPersonUtland.farsFornavn) &&
                Objects.equals(this.foedested, informasjonOmPersonUtland.foedested) &&
                Objects.equals(this.fornavnFodt, informasjonOmPersonUtland.fornavnFodt) &&
                Objects.equals(this.idOff, informasjonOmPersonUtland.idOff) &&
                Objects.equals(this.institusjon, informasjonOmPersonUtland.institusjon) &&
                Objects.equals(this.institusjonNavn, informasjonOmPersonUtland.institusjonNavn) &&
                Objects.equals(this.kilde, informasjonOmPersonUtland.kilde) &&
                Objects.equals(this.kildePin, informasjonOmPersonUtland.kildePin) &&
                Objects.equals(this.land, informasjonOmPersonUtland.land) &&
                Objects.equals(this.morsFamilenavn, informasjonOmPersonUtland.morsFamilenavn) &&
                Objects.equals(this.morsFornavn, informasjonOmPersonUtland.morsFornavn) &&
                Objects.equals(this.nasjonalId, informasjonOmPersonUtland.nasjonalId) &&
                Objects.equals(this.nasjonalitet, informasjonOmPersonUtland.nasjonalitet) &&
                Objects.equals(this.sedRef, informasjonOmPersonUtland.sedRef) &&
                Objects.equals(this.sektor, informasjonOmPersonUtland.sektor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datoFraOgMed, familienavnFodt, farsFamilenavn, farsFornavn, foedested, fornavnFodt, idOff, institusjon, institusjonNavn, kilde, kildePin, land, morsFamilenavn, morsFornavn, nasjonalId, nasjonalitet, sedRef, sektor);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InformasjonOmPersonUtland {\n");

        sb.append("    datoFraOgMed: ").append(toIndentedString(datoFraOgMed)).append("\n");
        sb.append("    familienavnFodt: ").append(toIndentedString(familienavnFodt)).append("\n");
        sb.append("    farsFamilenavn: ").append(toIndentedString(farsFamilenavn)).append("\n");
        sb.append("    farsFornavn: ").append(toIndentedString(farsFornavn)).append("\n");
        sb.append("    foedested: ").append(toIndentedString(foedested)).append("\n");
        sb.append("    fornavnFodt: ").append(toIndentedString(fornavnFodt)).append("\n");
        sb.append("    idOff: ").append(toIndentedString(idOff)).append("\n");
        sb.append("    institusjon: ").append(toIndentedString(institusjon)).append("\n");
        sb.append("    institusjonNavn: ").append(toIndentedString(institusjonNavn)).append("\n");
        sb.append("    kilde: ").append(toIndentedString(kilde)).append("\n");
        sb.append("    kildePin: ").append(toIndentedString(kildePin)).append("\n");
        sb.append("    land: ").append(toIndentedString(land)).append("\n");
        sb.append("    morsFamilenavn: ").append(toIndentedString(morsFamilenavn)).append("\n");
        sb.append("    morsFornavn: ").append(toIndentedString(morsFornavn)).append("\n");
        sb.append("    nasjonalId: ").append(toIndentedString(nasjonalId)).append("\n");
        sb.append("    nasjonalitet: ").append(toIndentedString(nasjonalitet)).append("\n");
        sb.append("    sedRef: ").append(toIndentedString(sedRef)).append("\n");
        sb.append("    sektor: ").append(toIndentedString(sektor)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
