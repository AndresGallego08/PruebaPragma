package co.com.pragma.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.pragma.userinterface.PaginaDeInicioPage.*;

public class Buscar implements Task {

    String producto;

    public Buscar(String producto) {
        this.producto = producto;
    }
    public static Buscar producto(String producto){
        return Tasks.instrumented(Buscar.class,producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(producto).into(CAMPO_BUSCAR).thenHit(Keys.ENTER));
    }
}
