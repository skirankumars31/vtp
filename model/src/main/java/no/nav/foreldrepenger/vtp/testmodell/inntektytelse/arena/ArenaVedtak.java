package no.nav.foreldrepenger.vtp.testmodell.inntektytelse.arena;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArenaVedtak {

    @JsonProperty("kravMottattDato")
    private LocalDate kravMottattDato;

    @JsonProperty("fom")
    private LocalDate fom;

    @JsonProperty("tom")
    private LocalDate tom;

    @JsonProperty("vedtakDato")
    private LocalDate vedtakDato;

    @JsonProperty("status")
    private VedtakStatus status;

    @JsonProperty("dagsats")
    private BigDecimal dagsats;

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("meldekort")
    private List<ArenaMeldekort> meldekort = new ArrayList<>();

    public BigDecimal getDagsats() {
        return dagsats;
    }

    public void setDagsats(BigDecimal dagsats) {
        this.dagsats = dagsats;
    }

    public LocalDate getKravMottattDato() {
        return kravMottattDato;
    }

    public void setKravMottattDato(LocalDate kravMottattDato) {
        this.kravMottattDato = kravMottattDato;
    }

    public LocalDate getFom() {
        return fom;
    }

    public void setFom(LocalDate fom) {
        this.fom = fom;
    }

    public LocalDate getTom() {
        return tom;
    }

    public void setTom(LocalDate tom) {
        this.tom = tom;
    }

    public LocalDate getVedtakDato() {
        return vedtakDato;
    }

    public void setVedtakDato(LocalDate vedtakDato) {
        this.vedtakDato = vedtakDato;
    }

    public VedtakStatus getStatus() {
        return status;
    }

    public void setStatus(VedtakStatus status) {
        this.status = status;
    }

    public List<ArenaMeldekort> getMeldekort() {
        return Collections.unmodifiableList(meldekort);
    }

    public void leggTil(ArenaMeldekort meldekort) {
        this.meldekort.add(meldekort);
    }
}
