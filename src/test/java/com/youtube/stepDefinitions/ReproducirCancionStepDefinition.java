package com.youtube.stepDefinitions;

import com.youtube.tasks.BusquedaCancion;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReproducirCancionStepDefinition {

    @Before
    public void configuracion(){
        setTheStage(new OnlineCast());
    }

    @Given("que el usuario se encuentre en la pagina de youtube")
    public void queElUsuarioSeEncuentreEnLaPaginaDeYoutube() {
        theActorCalled("Sol").wasAbleTo(Open.url("https://www.youtube.com/"));

    }
    @When("el busque una cancion para reproducirla")
    public void elBusqueUnaCancionParaReproducirla() {
        theActorInTheSpotlight().attemptsTo(BusquedaCancion.busqueda());

    }
    @Then("el usuario podra visualizar que la cancion que se reproduce es la cancion que busco")
    public void elUsuarioPodraVisualizarQueLaCancionQueSeReproduceEsLaCancionQueBusco() {

    }
}
