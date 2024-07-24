package com.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.nttdata.userinterfaces.store.StorePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InputCustomer implements Task {
    private String nombre;
    private String pais;
    private String ciudad;
    private String tarjeta;
    private String mes;
    private String anio;

    public InputCustomer(String nombre,String pais, String ciudad,String tarjeta, String mes, String anio){
        this.nombre=nombre;
        this.pais= pais;
        this.ciudad = ciudad;
        this.tarjeta = tarjeta;
        this.mes = mes;
        this.anio= anio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(TXT_NAME),
                Enter.theValue(pais).into(TXT_PAIS),
                Enter.theValue(ciudad).into(TXT_CIUDAD),
                Enter.theValue(tarjeta).into(TXT_TARJETA),
                Enter.theValue(mes).into(TXT_MES),
                Enter.theValue(anio).into(TXT_ANIO),
                Click.on(BTN_PURCHACE)
        );

    }

    public static InputCustomer data(String nombre,String pais, String ciudad,String tarjeta, String mes, String anio){
        return instrumented(InputCustomer.class,nombre,pais,ciudad,tarjeta,mes,anio);
    }
}
