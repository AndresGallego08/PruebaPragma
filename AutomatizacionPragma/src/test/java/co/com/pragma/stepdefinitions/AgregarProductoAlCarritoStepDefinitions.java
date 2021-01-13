package co.com.pragma.stepdefinitions;

import co.com.pragma.exceptions.ErrorAlAgregarProductoExceptions;
import co.com.pragma.interactions.Buscar;
import co.com.pragma.interactions.Seleccionar;
import co.com.pragma.questions.ElMensaje;
import co.com.pragma.questions.ElMensajeDe;
import co.com.pragma.questions.LaCantidad;
import co.com.pragma.tasks.AgregarProducto;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;

public class AgregarProductoAlCarritoStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void preparacion(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("que el usuario esta en la pagina de automation practice")
    public void queElUsuarioEstaEnLaPaginaDeAutomationPractice() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com/index.php"));
    }

    @Cuando("agrega {string} cantidad del producto {string} al carrito")
    public void agregaElProductoAlCarrito(String cantidadProducto, String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.producto(producto),
                AgregarProducto.alCarrito(producto,cantidadProducto));
    }

    @Cuando("agrega {string} {string} de la categoria {string} al carrito")
    public void agregaDeLaCategoriaAlCarrito(String cantidadProducto, String producto, String categoria) {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.categoria(categoria),
                AgregarProducto.alCarrito(producto,cantidadProducto));
    }

    @Cuando("agrega {string} unidades del producto {string} al carrito")
    public void agregaUnidadesDelProductoAlCarrito(String cantidadProducto, String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.producto(producto),
                AgregarProducto.alCarrito(producto,cantidadProducto));
    }

    @Cuando("agrega {string} cantidad del producto {string} al carrito desde home")
    public void agregaElProductoAlCarritoDesdeElHome(String cantidadProducto, String producto) {
        OnStage.theActorInTheSpotlight().
                attemptsTo(AgregarProducto.alCarrito(producto,cantidadProducto));
    }

    @Entonces("El visualizara el {string} en la cantidad de la pantalla de confirmacion")
    public void elVisualizaraElEnLaCantidadDeLaPantallaDeConfirmacion(String cantidadProducto) {
        OnStage.theActorInTheSpotlight().should(seeThat(LaCantidad.delProducto(),equalTo(cantidadProducto)).
                orComplainWith(ErrorAlAgregarProductoExceptions.class,"No se pudo visualizar la cantidad esperada"));
    }

    @Entonces("El visualizara el mensaje de error {string}")
    public void elVisualizaraElMensajeDeError(String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(ElMensajeDe.error(),equalTo(mensaje)).
                orComplainWith(ErrorAlAgregarProductoExceptions.class,"No se pudo visualizar el mensaje de error"));
    }

    @Entonces("El visualizara el mensaje {string}")
    public void elVisualizaraElMensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(ElMensaje.exitoso(), equalTo(mensaje)).
                orComplainWith(ErrorAlAgregarProductoExceptions.class,"No se pudo visualizar el mensaje de confirmación"));
    }

}
