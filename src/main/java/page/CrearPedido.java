package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("http://10.181.3.183:8085/cmpqr_cartera/index.php")

public class CrearPedido extends PageObject {

    By textusuario = By.name("usuario");
    By textpassword = By.name("password");
    By btningresar = By.id("ingresa");
    By btnprincipal = By.xpath("//*[@id='marco']/ul/li[2]/a/span");
    By btnteleventas = By.xpath("//*[contains(text(),'Televentas')]");
    By btncrear = By.xpath("/html/body/div[1]/div[2]/a");
    By listunidadventa = By.name("unidad_venta");


    public void ingresarUsuario(String usuario) {
        getDriver().findElement(textusuario).sendKeys(usuario);
    }

    public void ingresarContrasena(String contrasena) {
        getDriver().findElement(textpassword).sendKeys(contrasena);
    }

    public void clicIngresar() {
        getDriver().findElement(btningresar).click();
    }

    public void clicPrincipal() {
        getDriver().findElement(btnprincipal).click();
    }

    public void clicTeleventas() {
        getDriver().findElement(btnteleventas).click();
    }

    public void ingresarFrame() {
        WebElement frame = getDriver().findElement(By.tagName("object"));
        getDriver().switchTo().frame(frame);
    }

    public void clicCrear() {
        getDriver().findElement(btncrear).click();
    }

    public void registrarClienteFactura(String unidadventa){
        getDriver().findElement(listunidadventa).sendKeys(unidadventa);
    }

    public void salirChrome() {
        getDriver().close();
    }
}
