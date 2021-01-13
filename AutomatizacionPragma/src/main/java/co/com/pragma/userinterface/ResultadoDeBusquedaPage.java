package co.com.pragma.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadoDeBusquedaPage {

    public static Target SELECCIONAR_PRODUCTO = Target.the("Seleccionar el producto").
            locatedBy("//ul[@id='homefeatured' or @class='product_list grid row']/child::li//a[contains(text(),'{0}')]");

}
