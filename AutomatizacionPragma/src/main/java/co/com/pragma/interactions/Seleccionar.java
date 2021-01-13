package co.com.pragma.interactions;

import co.com.pragma.userinterface.PaginaDeInicioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.pragma.userinterface.PaginaDeInicioPage.*;

public class Seleccionar implements Task {
    String categoria;

    public Seleccionar(String categoria) {
        this.categoria = categoria;
    }

    public static Seleccionar categoria(String categoria){
        return Tasks.instrumented(Seleccionar.class,categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECCIONAR_CATEGORIA.of(categoria)));

    }
}
