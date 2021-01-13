package co.com.pragma.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleDelProductoPage {

    public static Target BTN_AGREGAR_AL_CARRITO = Target.the("Boton agregar al carrito").
            located(By.id("add_to_cart"));

    public static Target MENSAJE_EXITOSO = Target.the("Mensaje de confirmación").
            located(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2"));

    public static Target CAMPO_CANTIDAD = Target.the("Cantidad de producto").
            located(By.id("quantity_wanted"));

    public static Target CANTIDAD_PRODUCTO = Target.the("Cantidad de producto").
            located(By.id("layer_cart_product_quantity"));

    public static Target MENSAJE_DE_ERROR = Target.the("Mensaje de error").
            located(By.xpath("//p[@class = 'fancybox-error']"));
}
