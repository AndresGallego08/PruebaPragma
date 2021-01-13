package co.com.pragma.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeInicioPage {

    public static Target CAMPO_BUSCAR = Target.the("Campo Buscar").
            located(By.id("search_query_top"));

    public static Target SELECCIONAR_CATEGORIA = Target.the("Seleccionar la categoria").
            locatedBy("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[text()='{0}']");
}
