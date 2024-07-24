package com.nttdata.interactions.commons;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.nttdata.userinterfaces.store.StorePage.LNK_PRODUCTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SelectProduct implements Interaction {

    private String product;

    public SelectProduct(String product){
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LNK_PRODUCTS.of(product),isEnabled()).forNoMoreThan(10).seconds(),
                MoveMouse.to(LNK_PRODUCTS.of(product)),
                Click.on(LNK_PRODUCTS.of(product)));
    }

    public static SelectProduct type(String product){
        return instrumented(SelectProduct.class,product);
    }
}
