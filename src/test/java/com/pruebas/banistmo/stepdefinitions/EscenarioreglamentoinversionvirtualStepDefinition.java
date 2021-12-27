package com.pruebas.banistmo.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.banistmo.ui.Navegacion.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class EscenarioreglamentoinversionvirtualStepDefinition {


    @Before
    public  void configactor () {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Actor");
    }

    @Cuando("^se ingresa a la seccion de solicitud de productos$")
    public void seIngresaALaSeccionDeSolicitudDeProductos() throws InterruptedException {
       OnStage.theActorInTheSpotlight().attemptsTo(
               Open.url("http://www.grupobancolombia.com"),
               WaitUntil.the(SOLICITAR_PRODUCTOS,isVisible()),
               Click.on(SOLICITAR_PRODUCTOS)
       );
    }

    @Cuando("^a la ruta de Inversiones con un monto de menos 500k$")
    public void aLaRutaDeInversionesConUnMontoDe() {


        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(INVERSIONES),
                Click.on(OPCIONES_MONTO),
                WaitUntil.the(MONTO, isVisible()),
                Scroll.to(CONOCE_MAS)


        );
    }

    @Entonces("^se puede validar que el documento adjunto es el correcto$")
    public void sePuedeValidarQueElDocumentoAdjuntoEsElCorrecto() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(the(MONTO),isVisible())

        );
    }



}
