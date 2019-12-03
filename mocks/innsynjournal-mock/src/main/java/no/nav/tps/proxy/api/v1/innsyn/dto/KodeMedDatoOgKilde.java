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
 * Informasjon om kode, verdi, dato og opprinnelse
 */
@ApiModel(description = "Informasjon om kode, verdi, dato og opprinnelse")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-11-27T10:31:32.432+01:00")
public class KodeMedDatoOgKilde   {
    @JsonProperty("datoFraOgMed")
    private String datoFraOgMed = null;

    @JsonProperty("kilde")
    private String kilde = null;

    @JsonProperty("kode")
    private Kode kode = null;

    public KodeMedDatoOgKilde datoFraOgMed(String datoFraOgMed) {
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

    public KodeMedDatoOgKilde kilde(String kilde) {
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

    public KodeMedDatoOgKilde kode(Kode kode) {
        this.kode = kode;
        return this;
    }

    /**
     * Get kode
     * @return kode
     **/
    @JsonProperty("kode")
    @ApiModelProperty(value = "")
    public Kode getKode() {
        return kode;
    }

    public void setKode(Kode kode) {
        this.kode = kode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KodeMedDatoOgKilde kodeMedDatoOgKilde = (KodeMedDatoOgKilde) o;
        return Objects.equals(this.datoFraOgMed, kodeMedDatoOgKilde.datoFraOgMed) &&
                Objects.equals(this.kilde, kodeMedDatoOgKilde.kilde) &&
                Objects.equals(this.kode, kodeMedDatoOgKilde.kode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datoFraOgMed, kilde, kode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KodeMedDatoOgKilde {\n");

        sb.append("    datoFraOgMed: ").append(toIndentedString(datoFraOgMed)).append("\n");
        sb.append("    kilde: ").append(toIndentedString(kilde)).append("\n");
        sb.append("    kode: ").append(toIndentedString(kode)).append("\n");
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
