package no.nav.foreldrepenger.vtp.testmodell.dokument.modell.koder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonValue;
//TODO (OL): Redundant med koder to ganger? Refaktorer.
public class Behandlingstema {

    private static List<String> VALID_KODER;
    static {
        List<String> koder = new ArrayList<>();
        koder.add("ab0027");
        koder.add("ab0050");
        koder.add("ab0047");
        koder.add("ab0072");
        koder.add("ab0326");
        koder.add("ab0126");

        VALID_KODER = Collections.unmodifiableList(koder);
    }

    public static Behandlingstema ENGANGSSTONAD_ADOPSJON = new Behandlingstema("ab0027");
    public static Behandlingstema ENGANGSSTONAD_FOEDSEL = new Behandlingstema("ab0050");
    public static Behandlingstema FORELDREPENGER_FOEDSEL = new Behandlingstema("ab0047");
    public static Behandlingstema FORELDREPENGER_ADOPSJON = new Behandlingstema("ab0072");
    public static Behandlingstema FORELDREPENGER = new Behandlingstema("ab0326");
    public static Behandlingstema SVANGERSKAPSPENGER = new Behandlingstema("ab0126");

    private String kode;

    public Behandlingstema(String kode) {
        this.kode = kode == null ? this.kode : kode;
        if(kode != null && !VALID_KODER.contains(kode)){
            throw new IllegalArgumentException("Kode er ikke implementert i Joark dokumentstatus: " + kode);
        }
    }

    @JsonValue
    public String getKode() {return kode;}

    public void setKode(String kode){this.kode = kode;}


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }
        return Objects.equals(getKode(), ((Dokumentstatus) obj).getKode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKode());
    }
}
