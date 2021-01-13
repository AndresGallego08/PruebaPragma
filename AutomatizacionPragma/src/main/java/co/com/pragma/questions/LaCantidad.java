package co.com.pragma.questions;

import co.com.pragma.userinterface.DetalleDelProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.pragma.userinterface.DetalleDelProductoPage.*;
import static co.com.pragma.userinterface.DetalleDelProductoPage.MENSAJE_EXITOSO;

public class LaCantidad implements Question <String> {

    public static LaCantidad delProducto(){
        return new LaCantidad();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CANTIDAD_PRODUCTO).viewedBy(actor).asString();
    }
}
