package com.nttdata.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.nttdata.userinterfaces.store.StorePage.MSG_RESULTADO;

public class VerificarCompra implements Question<Boolean> {

    private String resultado;

    public VerificarCompra(String resultado){
        this.resultado= resultado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return MSG_RESULTADO.of(resultado).resolveFor(actor).isVisible();
    }

    public static VerificarCompra exitosa(String resultado){
        return new VerificarCompra(resultado);
    }
}
