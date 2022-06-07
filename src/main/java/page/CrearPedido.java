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
    By listfacturacionaut = By.name("facturacion_electronica");
    By listtipodoc = By.name("cliente[cod_tipo_identificacion]");
    By textnumdoc = By.name("cliente[numero_documento]");
    By btnbuscar = By.id("buscar-cliente");
    By poupclientenoexiste = By.xpath("//*[contains(text(),'El cliente no existe')]");
    By btnaceptar = By.xpath("//*[contains(text(),'El cliente no existe')]");
    By txtprimernombre = By.name("cliente[primer_nombre]");
    By txtsegundonombre = By.name("cliente[segundo_nombre]");
    By txtprimerapellido = By.name("cliente[primer_apellido]");
    By txtsegundoapellido = By.name("cliente[segundo_apellido]");
    By selectciudad = By.id("ciudad");
    By txtdireccion = By.name("cliente[direccion]");
    By btngeorreferenciar = By.id("georeferenciar");
    By txtbarrio = By.name("cliente[barrio]");
    By txtcelular = By.name("cliente[telefono_celular]");
    By txtfijo = By.name("cliente[telefono_fijo]");
    By txtemail = By.name("cliente[email]");
    By selectgenero = By.id("genero");
    By selecthabeasdata = By.name("cliente[sms_habeas]");
    By btnsiguiente = By.id("siguiente");

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

    public void unidadVenta(String unidadventa) {
        getDriver().findElement(listunidadventa).sendKeys(unidadventa);
    }

    public void factElec(String facturacionelectronica) {
        getDriver().findElement(listfacturacionaut).sendKeys(facturacionelectronica);
    }

    public void tipoDocumento(String tipodocumento) {
        getDriver().findElement(listtipodoc).sendKeys(tipodocumento);
    }

    public void numeroDocumento(String numerodocumento) {
        getDriver().findElement(textnumdoc).sendKeys(numerodocumento);
    }

    public void btnBuscar() {
        getDriver().findElement(btnbuscar).click();
        if (isElementVisible(poupclientenoexiste)) {
            getDriver().findElement(btnaceptar).click();
        } else {
            getDriver().findElement(txtprimernombre).clear();
        }
    }

    public void primerNombre(String primernombre) {
        getDriver().findElement(txtprimernombre).sendKeys(primernombre);
    }

    public void segundoNombre(String segundonombre) {
        getDriver().findElement(txtsegundonombre).clear();
        getDriver().findElement(txtsegundonombre).sendKeys(segundonombre);
    }

    public void primerApellido(String primerapellido) {
        getDriver().findElement(txtprimerapellido).clear();
        getDriver().findElement(txtprimerapellido).sendKeys(primerapellido);
    }

    public void segundoApellido(String segundoapellido) {
        getDriver().findElement(txtsegundoapellido).clear();
        getDriver().findElement(txtsegundoapellido).sendKeys(segundoapellido);
    }

    public void ciudad(String ciudad) {
        getDriver().findElement(selectciudad).sendKeys(ciudad);
    }

    public void direccion(String direccion) {
        getDriver().findElement(txtdireccion).clear();
        getDriver().findElement(txtdireccion).sendKeys(direccion);
    }

    public void georreferenciar() {
        getDriver().findElement(btngeorreferenciar).click();
    }

    public void celular(String telefonocelular) {
        getDriver().findElement(txtcelular).clear();
        getDriver().findElement(txtcelular).sendKeys(telefonocelular);
    }

    public void telefonoFijo(String telefonofijo) {
        getDriver().findElement(txtfijo).clear();
        getDriver().findElement(txtfijo).sendKeys(telefonofijo);
    }

    public void email(String email) {
        getDriver().findElement(txtemail).clear();
        getDriver().findElement(txtemail).sendKeys(email);
    }

    public void genero(String genero) {
        getDriver().findElement(selectgenero).sendKeys(genero);
    }

    public void tratamientoDatos(String autorizotratamientodatos) {
        getDriver().findElement(selecthabeasdata).sendKeys(autorizotratamientodatos);
    }

    public void siguienteCF(){
        getDriver().findElement(btnsiguiente).click();
    }

    public void salirChrome() {
        getDriver().close();
    }
}
