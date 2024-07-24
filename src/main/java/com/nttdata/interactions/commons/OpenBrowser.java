package com.nttdata.interactions.commons;

import com.nttdata.userinterfaces.store.StorePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Interaction {

    private StorePage storePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(storePage));
    }

    public static OpenBrowser inPage(){
        return instrumented(OpenBrowser.class);
    }

}
