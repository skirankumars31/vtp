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

/**
 * Informasjon om adresse
 */
@ApiModel(description = "Informasjon om adresse")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-11-27T10:31:32.432+01:00")
public class Adresseinfo   {
    @JsonProperty("boadresse")
    private Boadresse boadresse = null;

    @JsonProperty("geografiskTilknytning")
    private GeografiskTilknytning geografiskTilknytning = null;

    @JsonProperty("postadresse")
    private Postadresse postadresse = null;

    @JsonProperty("prioritertAdresse")
    private KodeMedDatoOgKilde prioritertAdresse = null;

    @JsonProperty("tilleggsadresse")
    private Tilleggsadresse tilleggsadresse = null;

    @JsonProperty("utenlandskAdresse")
    private UtenlandskAdresse utenlandskAdresse = null;

    public Adresseinfo boadresse(Boadresse boadresse) {
        this.boadresse = boadresse;
        return this;
    }

    /**
     * Get boadresse
     * @return boadresse
     **/
    @JsonProperty("boadresse")
    @ApiModelProperty(value = "")
    public Boadresse getBoadresse() {
        return boadresse;
    }

    public void setBoadresse(Boadresse boadresse) {
        this.boadresse = boadresse;
    }

    public Adresseinfo geografiskTilknytning(GeografiskTilknytning geografiskTilknytning) {
        this.geografiskTilknytning = geografiskTilknytning;
        return this;
    }

    /**
     * Get geografiskTilknytning
     * @return geografiskTilknytning
     **/
    @JsonProperty("geografiskTilknytning")
    @ApiModelProperty(value = "")
    public GeografiskTilknytning getGeografiskTilknytning() {
        return geografiskTilknytning;
    }

    public void setGeografiskTilknytning(GeografiskTilknytning geografiskTilknytning) {
        this.geografiskTilknytning = geografiskTilknytning;
    }

    public Adresseinfo postadresse(Postadresse postadresse) {
        this.postadresse = postadresse;
        return this;
    }

    /**
     * Get postadresse
     * @return postadresse
     **/
    @JsonProperty("postadresse")
    @ApiModelProperty(value = "")
    public Postadresse getPostadresse() {
        return postadresse;
    }

    public void setPostadresse(Postadresse postadresse) {
        this.postadresse = postadresse;
    }

    public Adresseinfo prioritertAdresse(KodeMedDatoOgKilde prioritertAdresse) {
        this.prioritertAdresse = prioritertAdresse;
        return this;
    }

    /**
     * Get prioritertAdresse
     * @return prioritertAdresse
     **/
    @JsonProperty("prioritertAdresse")
    @ApiModelProperty(value = "")
    public KodeMedDatoOgKilde getPrioritertAdresse() {
        return prioritertAdresse;
    }

    public void setPrioritertAdresse(KodeMedDatoOgKilde prioritertAdresse) {
        this.prioritertAdresse = prioritertAdresse;
    }

    public Adresseinfo tilleggsadresse(Tilleggsadresse tilleggsadresse) {
        this.tilleggsadresse = tilleggsadresse;
        return this;
    }

    /**
     * Get tilleggsadresse
     * @return tilleggsadresse
     **/
    @JsonProperty("tilleggsadresse")
    @ApiModelProperty(value = "")
    public Tilleggsadresse getTilleggsadresse() {
        return tilleggsadresse;
    }

    public void setTilleggsadresse(Tilleggsadresse tilleggsadresse) {
        this.tilleggsadresse = tilleggsadresse;
    }

    public Adresseinfo utenlandskAdresse(UtenlandskAdresse utenlandskAdresse) {
        this.utenlandskAdresse = utenlandskAdresse;
        return this;
    }

    /**
     * Get utenlandskAdresse
     * @return utenlandskAdresse
     **/
    @JsonProperty("utenlandskAdresse")
    @ApiModelProperty(value = "")
    public UtenlandskAdresse getUtenlandskAdresse() {
        return utenlandskAdresse;
    }

    public void setUtenlandskAdresse(UtenlandskAdresse utenlandskAdresse) {
        this.utenlandskAdresse = utenlandskAdresse;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Adresseinfo adresseinfo = (Adresseinfo) o;
        return Objects.equals(this.boadresse, adresseinfo.boadresse) &&
                Objects.equals(this.geografiskTilknytning, adresseinfo.geografiskTilknytning) &&
                Objects.equals(this.postadresse, adresseinfo.postadresse) &&
                Objects.equals(this.prioritertAdresse, adresseinfo.prioritertAdresse) &&
                Objects.equals(this.tilleggsadresse, adresseinfo.tilleggsadresse) &&
                Objects.equals(this.utenlandskAdresse, adresseinfo.utenlandskAdresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boadresse, geografiskTilknytning, postadresse, prioritertAdresse, tilleggsadresse, utenlandskAdresse);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Adresseinfo {\n");

        sb.append("    boadresse: ").append(toIndentedString(boadresse)).append("\n");
        sb.append("    geografiskTilknytning: ").append(toIndentedString(geografiskTilknytning)).append("\n");
        sb.append("    postadresse: ").append(toIndentedString(postadresse)).append("\n");
        sb.append("    prioritertAdresse: ").append(toIndentedString(prioritertAdresse)).append("\n");
        sb.append("    tilleggsadresse: ").append(toIndentedString(tilleggsadresse)).append("\n");
        sb.append("    utenlandskAdresse: ").append(toIndentedString(utenlandskAdresse)).append("\n");
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
