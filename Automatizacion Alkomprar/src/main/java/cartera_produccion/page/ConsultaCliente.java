package cartera_produccion.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://10.181.3.183:8085/cmpqr_cartera/")

public class ConsultaCliente extends PageObject {

    By textusuario = By.name("usuario");
    By textpassword = By.name("password");
    By btningresar = By.id("ingresa");



    public void ingresarUsuario(String usuario) {
        getDriver().findElement(textusuario).sendKeys(usuario);
    }

    public void ingresarClave(String clave) {
        getDriver().findElement(textpassword).sendKeys(clave);
    }

    public void clicIngresar() {
        getDriver().findElement(btningresar).click();
    }

    public void salirChrome(){
        getDriver().close();
    }
}
