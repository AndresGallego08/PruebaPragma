package co.com.pragma.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.pragma.userinterface.DetalleDelProductoPage.MENSAJE_DE_ERROR;
import static co.com.pragma.userinterface.DetalleDelProductoPage.MENSAJE_EXITOSO;

public class ElMensajeDe implements Question<String> {
    public static ElMensajeDe error(){
        return new ElMensajeDe();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_DE_ERROR).viewedBy(actor).asString();
    }
}
