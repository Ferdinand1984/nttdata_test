package com.nttdata.tasks;

import com.nttdata.interactions.commons.SelectItems;
import com.nttdata.interactions.commons.SelectProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyProducts implements Task {

    private String productType;
    private String items;
    public BuyProducts(String productType,String items){
        this.productType = productType;
        this.items = items;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectProduct.type(productType));
        actor.attemptsTo(SelectItems.toBuy(items));
    }

    public static BuyProducts inStore(String productType,String items){
        return instrumented(BuyProducts.class,productType,items);
    }
}
