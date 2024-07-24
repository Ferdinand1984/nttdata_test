package com.nttdata.stepdefinitions.store;

import com.nttdata.interactions.commons.OpenBrowser;
import com.nttdata.questions.VerificarCompra;
import com.nttdata.tasks.BuyProducts;
import com.nttdata.tasks.InputCustomer;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StoreStepDefinition {

    @Before
    public void initialSetup(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) visita la pagina de compras$")
    public void visitarPaginaCompras(String actor){
        theActorCalled(actor).wasAbleTo(OpenBrowser.inPage());
    }

    @Cuando("^selecciona los articulos y realiza la compra con los datos (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void comprar(String tipoArticulo,String listaArticulos,String nombre,String pais, String ciudad,String tarjeta, String mes, String anio){
        theActorInTheSpotlight().attemptsTo(
                BuyProducts.inStore(tipoArticulo,listaArticulos),
                InputCustomer.data(nombre,pais,ciudad,tarjeta,mes,anio));
    }

    @Entonces("^revisa que se realize la compra exitosamente (.*)$")
    public void revisarCompra(String resultado){
        theActorInTheSpotlight().should(seeThat(VerificarCompra.exitosa(resultado)));
    }
}
