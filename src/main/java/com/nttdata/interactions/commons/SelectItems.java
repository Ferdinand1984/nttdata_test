package com.nttdata.interactions.commons;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.nttdata.userinterfaces.store.StorePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SelectItems implements Interaction {

    private String items;

    public SelectItems(String items){
        this.items=items;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] lista = items.split(";");
        for(String itemLista : lista){
            actor.attemptsTo(
                    Click.on(BTN_ITEMS.of(itemLista)),
                    WaitUntil.the(BTN_ADD_CAR,isClickable()),
                    Scroll.to(BTN_ADD_CAR),
                    Click.on(BTN_ADD_CAR));
            WebDriverWait wait = new WebDriverWait(getDriver(), 3);
            wait.until(ExpectedConditions.alertIsPresent());
            getDriver().switchTo().alert().accept();
            getDriver().navigate().back();
            getDriver().navigate().back();
        }
        actor.attemptsTo(
                Click.on(LNK_SHOW_CART),
                WaitUntil.the(BTN_ORDER,isClickable()),
                Click.on(BTN_ORDER));
    }


    public static SelectItems toBuy(String items){
        return instrumented(SelectItems.class,items);
    }
}
