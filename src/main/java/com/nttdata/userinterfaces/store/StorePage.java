package com.nttdata.userinterfaces.store;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
@DefaultUrl("https://www.demoblaze.com")
public class StorePage extends PageObject {

    public static final Target LNK_PRODUCTS = Target.the("Tipo producto").locatedBy("//a[text()='{0}']");
    public static final Target BTN_ITEMS = Target.the("Items").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target BTN_ADD_CAR = Target.the("Agregar al carro").locatedBy("//a[text()='Add to cart']");
    public static final Target LNK_SHOW_CART = Target.the("Ir al carro").locatedBy("//a[text()='Cart']");
    public static final Target BTN_ORDER = Target.the("Comprar").locatedBy("//button[text()='Place Order']");
    public static final Target TXT_NAME = Target.the("Nombre").located(By.id("name"));
    public static final Target TXT_PAIS = Target.the("Pais").located(By.id("country"));
    public static final Target TXT_CIUDAD = Target.the("Pais").located(By.id("city"));
    public static final Target TXT_TARJETA = Target.the("Pais").located(By.id("card"));
    public static final Target TXT_MES = Target.the("Pais").located(By.id("month"));
    public static final Target TXT_ANIO = Target.the("Pais").located(By.id("year"));
    public static final Target BTN_PURCHACE = Target.the("Comprar").locatedBy("//button[text()='Purchase']");

    public static final Target MSG_RESULTADO = Target.the("Resultado").locatedBy("//h2[text()='{0}']");
}
