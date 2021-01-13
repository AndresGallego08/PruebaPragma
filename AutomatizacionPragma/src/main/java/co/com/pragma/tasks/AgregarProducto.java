package co.com.pragma.tasks;

import co.com.pragma.userinterface.DetalleDelProductoPage;
import co.com.pragma.userinterface.ResultadoDeBusquedaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.pragma.userinterface.DetalleDelProductoPage.*;
import static co.com.pragma.userinterface.ResultadoDeBusquedaPage.*;

public class AgregarProducto implements Task{

    String producto;
    String cantidadProducto;

    public AgregarProducto(String producto, String cantidadProducto) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
    }



    public static AgregarProducto alCarrito (String producto, String cantidadProducto){
        return Tasks.instrumented(AgregarProducto.class,producto, cantidadProducto);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECCIONAR_PRODUCTO.of(producto)),
                Enter.theValue(cantidadProducto).into(CAMPO_CANTIDAD),
                Click.on(BTN_AGREGAR_AL_CARRITO));
    }
}

