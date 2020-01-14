package no.nav.foreldrepenger.vtp.testmodell.tjenestepensjon;

import no.nav.foreldrepenger.vtp.testmodell.inntektytelse.InntektYtelseModell;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class TjenestepensjonIndeks {


    private Map<String, TjenestepensjonModell> byFnr = new ConcurrentHashMap<>();

    public Optional<TjenestepensjonModell> getModellForIdent(String ident) {
        return Optional.ofNullable(byFnr.get(ident));
    }

    public void leggTil(String ident, TjenestepensjonModell iy) {
        if(ident != null && iy != null){
            byFnr.put(ident, iy);
        }
    }

}
