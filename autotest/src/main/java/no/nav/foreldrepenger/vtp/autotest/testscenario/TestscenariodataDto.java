package no.nav.foreldrepenger.vtp.autotest.testscenario;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import no.nav.foreldrepenger.vtp.autotest.testscenario.inntektytelse.arbeidsforhold.ArbeidsforholdModell;
import no.nav.foreldrepenger.vtp.autotest.testscenario.inntektytelse.inntektkomponent.InntektskomponentModell;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TestscenariodataDto {

    @JsonProperty("inntektskomponent")
    private InntektskomponentModell inntektskomponentModell;

    @JsonProperty("aareg")
    private ArbeidsforholdModell arbeidsforholdModell;

    public TestscenariodataDto() {
    }

    public TestscenariodataDto(InntektskomponentModell inntektskomponentModell, ArbeidsforholdModell arbeidsforholdModell) {
        this.inntektskomponentModell = inntektskomponentModell;
        this.arbeidsforholdModell = arbeidsforholdModell;
    }

    public InntektskomponentModell getInntektskomponentModell() {
        return inntektskomponentModell;
    }

    public ArbeidsforholdModell getArbeidsforholdModell() {
        return arbeidsforholdModell;
    }
}
