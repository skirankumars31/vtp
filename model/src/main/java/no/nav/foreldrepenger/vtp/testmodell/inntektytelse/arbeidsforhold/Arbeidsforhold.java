package no.nav.foreldrepenger.vtp.testmodell.inntektytelse.arbeidsforhold;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Arbeidsforhold {

    @JsonProperty("arbeidsavtaler")
    private List<Arbeidsavtale> arbeidsavtaler;

    @JsonProperty("permisjoner")
    private List<Permisjon> permisjoner = new ArrayList<>();

    @JsonProperty("arbeidsforholdId")
    private String arbeidsforholdId;

    @JsonProperty("arbeidsforholdIdNav")
    private Long arbeidsforholdIdnav = ArbeidsforholdIdNav.next();

    @JsonProperty("ansettelsesperiodeTom")
    private LocalDate ansettelsesperiodeTom;

    @JsonProperty("ansettelsesperiodeFom")
    private LocalDate ansettelsesperiodeFom;

    @JsonProperty("arbeidsforholdstype")
    private Arbeidsforholdstype arbeidsforholdstype;

    @JsonProperty("timeposteringer")
    private List<AntallTimerIPerioden> timeposteringer;

    @JsonProperty("arbeidsgiverOrgnr")
    private String arbeidsgiverOrgnr;

    @JsonProperty("opplyserOrgnr")
    private String opplyserOrgnr;

    @JsonProperty("arbeidsgiverAktorId")
    private String arbeidsgiverAktorId;

    public List<Arbeidsavtale> getArbeidsavtaler() {
        return arbeidsavtaler;
    }

    public void setArbeidsavtaler(List<Arbeidsavtale> arbeidsavtaler) {
        this.arbeidsavtaler = arbeidsavtaler;
    }

    public List<Permisjon> getPermisjoner() {
        return permisjoner;
    }

    public void setPermisjoner(List<Permisjon> permisjoner) {
        this.permisjoner = permisjoner;
    }

    public String getArbeidsforholdId() {
        return arbeidsforholdId;
    }

    public void setArbeidsforholdId(String arbeidsforholdId) {
        this.arbeidsforholdId = arbeidsforholdId;
    }

    public Long getArbeidsforholdIdnav() {
        return this.arbeidsforholdIdnav;
    }

    public void setArbeidsforholdIdnav(Long arbeidsforholdIdnav) {
        this.arbeidsforholdIdnav = arbeidsforholdIdnav;
    }

    public LocalDate getAnsettelsesperiodeTom() {
        return ansettelsesperiodeTom;
    }

    public void setAnsettelsesperiodeTom(LocalDate ansettelsesperiodeTom) {
        this.ansettelsesperiodeTom = ansettelsesperiodeTom;
    }

    public LocalDate getAnsettelsesperiodeFom() {
        return ansettelsesperiodeFom;
    }

    public void setAnsettelsesperiodeFom(LocalDate ansettelsesperiodeFom) {
        this.ansettelsesperiodeFom = ansettelsesperiodeFom;
    }

    public Arbeidsforholdstype getArbeidsforholdstype() {
        return arbeidsforholdstype;
    }

    public void setArbeidsforholdstype(Arbeidsforholdstype arbeidsforholdstype) {
        this.arbeidsforholdstype = arbeidsforholdstype;
    }

    public List<AntallTimerIPerioden> getTimeposteringer() {
        return timeposteringer;
    }

    public void setTimeposteringer(List<AntallTimerIPerioden> timeposteringer) {
        this.timeposteringer = timeposteringer;
    }

    public String getArbeidsgiverAktorId() {
        return arbeidsgiverAktorId;
    }

    public void setArbeidsgiverAktorId(String arbeidsgiverAktorId) {
        this.arbeidsgiverAktorId = arbeidsgiverAktorId;
    }

    public String getArbeidsgiverOrgnr() {
        return arbeidsgiverOrgnr;
    }

    public void setArbeidsgiverOrgnr(String arbeidsgiverOrgnr) {
        this.arbeidsgiverOrgnr = arbeidsgiverOrgnr;
    }

    public String getOpplyserOrgnr() {
        return opplyserOrgnr;
    }

    public void setOpplyserOrgnr(String opplyserOrgnr) {
        this.opplyserOrgnr = opplyserOrgnr;
    }
}
