package co.com.pragma.questions;

import co.com.pragma.userinterface.DetalleDelProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.pragma.userinterface.DetalleDelProductoPage.*;

public class ElMensaje implements Question <String>{

    public static ElMensaje exitoso(){
        return new ElMensaje();
    }
    @Override

    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_EXITOSO).viewedBy(actor).asString();
    }
}
