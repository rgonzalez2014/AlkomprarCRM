package runners.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("http://crm.colcomercio.com.co/cartera/index.php")

public class ConsultaCliente extends PageObject {

    By textusuario = By.name("usuario");
    By textpassword = By.name("password");
    By btningresar = By.id("ingresa");
    By btnprincipal = By.xpath("//*[@id='acolapsar']/ul/li[3]");
    By btnprincipalpanelnuevo = By.xpath("//*[contains(text(),'Principal Panel Nuevo')]");
    By textdocumento = By.id("mat-input-2");
    By btnbuscar = By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/div/app-buscar-clientes/mat-card/mat-card-content/form/button");
    By titlecontact = By.xpath("//*[contains(text(),'Contact Manager Alkomprar')]");
    By btncartera = By.id("mat-tab-label-0-2");

    public void ingresarUsuario(String usuario) {
        getDriver().findElement(textusuario).sendKeys(usuario);
    }

    public void ingresarClave(String clave) {
        getDriver().findElement(textpassword).sendKeys(clave);
    }

    public void clicIngresar() {
        getDriver().findElement(btningresar).click();
    }

    public void clicPrincipal() {
        getDriver().findElement(btnprincipal).click();
    }

    public void clicPrincipalPanelCliente() {
        getDriver().findElement(btnprincipalpanelnuevo).click();
    }

    public void ingresarFrame() {
        WebElement frame = getDriver().findElement(By.tagName("object"));
        getDriver().switchTo().frame(frame);
    }

    public void ingresarDocumento(String documento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(textdocumento));
        getDriver().findElement(textdocumento).sendKeys(documento);
    }

    public void clicBuscar() {
        getDriver().findElement(btnbuscar).click();
    }

    public void vistaDatosCliente() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(titlecontact));
        getDriver().findElement(btncartera).click();
    }

    public void salirChrome() {
        getDriver().close();
    }
}
