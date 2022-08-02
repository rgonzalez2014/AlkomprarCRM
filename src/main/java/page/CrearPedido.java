package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("http://10.181.3.183:8085/cmpqr_cartera/index.php")

public class CrearPedido extends PageObject {

    /*Login*/
    By textusuario = By.name("usuario");
    By textpassword = By.name("password");
    By btningresar = By.id("ingresa");

    /*Ruta Modulo Televentas*/
    By btnprincipal = By.xpath("//*[@id='marco']/ul/li[2]/a/span");
    By btnteleventas = By.xpath("//*[contains(text(),'Televentas')]");
    By btncrear = By.xpath("/html/body/div[1]/div[2]/a");

    /*Formulario Cliente Factura*/
    By listunidadventa = By.name("unidad_venta");
    By listfacturacionaut = By.name("facturacion_electronica");
    By listtipodoc = By.name("cliente[cod_tipo_identificacion]");
    By textnumdoc = By.name("cliente[numero_documento]");
    By btnbuscar = By.id("buscar-cliente");
    By poupclientenoexiste = By.xpath("//*[contains(text(),'El cliente no existe')]");
    By btnaceptar = By.xpath("/html/body/div[5]/div/div[4]/div/button");
    By txtprimernombre = By.name("cliente[primer_nombre]");
    By txtsegundonombre = By.name("cliente[segundo_nombre]");
    By txtprimerapellido = By.name("cliente[primer_apellido]");
    By txtsegundoapellido = By.name("cliente[segundo_apellido]");
    By listciudad = By.id("ciudad");
    By txtdireccion = By.name("cliente[direccion]");
    By btngeorreferenciar = By.id("georeferenciar");
    By txtcelular = By.name("cliente[telefono_celular]");
    By txtfijo = By.name("cliente[telefono_fijo]");
    By txtemail = By.name("cliente[email]");
    By listgenero = By.id("genero");
    By listhabeasdata = By.name("cliente[sms_habeas]");
    By btnsiguiente = By.id("siguiente");

    /*Formulario Cliente Envio*/

    By formularioclienteenvio = By.xpath("//*[contains(text(),'Tipo Cliente')]");
    By listtipodocce = By.name("cliente[cod_tipo_identificacion");
    By textnumdocce = By.name("cliente[numero_documento]");
    By btnbuscarce = By.id("buscar-cliente");
    By poupclientenoexistece = By.xpath("//*[contains(text(),'El cliente no existe')]");
    By btnaceptarce = By.xpath("/html/body/div[4]/div/div[4]/div/button");
    By txtprimernombrece = By.id("primer-nombre");
    By txtsegundonombrece = By.name("cliente[segundo_nombre]");
    By txtprimerapellidoce = By.name("cliente[primer_apellido]");
    By txtsegundoapellidoce = By.name("cliente[segundo_apellido]");
    By listciudadce = By.id("ciudad");
    By txtdireccionce = By.name("cliente[direccion]");
    By btngeorreferenciarce = By.id("georeferenciar");
    By txtcelularce = By.name("cliente[telefono_celular]");
    By txtfijoce = By.name(" cliente[telefono_fijo]");
    By txtemailce = By.name(" cliente[email]");
    By selectgeneroce = By.id("genero");
    By btnsiguientece = By.id("siguiente");

    /*Formulario Cliente Recoge*/

    By listrecogeen = By.name("unidad_recoge");

    /*Formulario Productos*/

    By formularioproductos = By.xpath("//*[contains(text(),'Pedido N°')]");
    By txtean = By.name("ean");
    By btnbuscarean = By.id("buscar-ean");
    By popupeansincobertura = By.xpath("//*[contains(text(),'Actualmente no se cuenta con cobertura de este producto para la ciudad seleccionada')]");
    By popupsinprecio = By.xpath("//*[contains(text(),'el servicio de precios no responde')]");
    By popupsininventario = By.xpath("//*[contains(text(),'No se encontró inventario del producto')]");
    By txtcantidad = By.xpath("//*[@id='tabla-unidades']/tbody/tr/td[3]/input");
    By btncarro = By.xpath("//*[@id='tabla-unidades']/tbody/tr/td[5]/button/span");
    By popupproductoagregado = By.xpath("//*[contains(text(),'Producto agregado')]");
    By btnaceptarcarro = By.xpath("/html/body/div[2]/div/div[4]/div/button");
    By btnsiguienteprod = By.id("confirmacion-productos");
    By btnaceptarproducto = By.xpath("/html/body/div[2]/div/div[4]/div/button");
    By pupupproductosagregados = By.xpath("//*[contains(text(),'Los productos han sido agregados al pedido')]");

    /*Formulario Medios Pago*/
    By selectfecha = By.name("fecha_entrega");
    By listcalendario = By.xpath("//*[@id='ui-datepicker-div']/table//tbody//td[@data-event='click']");
    By btnsiguientemes = By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span");
    By formulariomediospago = By.xpath("//*[contains(text(),'Fechas de entrega')]");
    By btnguardarfecha = By.xpath("//*[@id='form-fechas']/div[4]/button");
    By popupfechaguardada = By.xpath("//*[contains(text(),'Información guardada correctamente')]");
    By listmetodopago = By.name("cod_metodo_pago");
    By listtipopago = By.id("tipo-pago");
    By listlink = By.id("metodo-link-pago");
    By txtobservaciones = By.name("observaciones");
    By btnsiguientemp = By.id("siguiente");

    /*Login*/
    public void ingresarUsuario(String usuario) {
        getDriver().findElement(textusuario).sendKeys(usuario);
    }

    public void ingresarContrasena(String contrasena) {
        getDriver().findElement(textpassword).sendKeys(contrasena);
    }

    public void clicIngresar() {
        getDriver().findElement(btningresar).click();
    }

    /*Ruta Modulo Televentas*/
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

    /*Formulario Cliente Factura*/
    public void unidadVenta(String unidadventa) {
        Select unidad = new Select(getDriver().findElement(listunidadventa));
        unidad.selectByVisibleText(unidadventa);
    }

    public void factElec(String facturacionelectronica) {
        getDriver().findElement(listfacturacionaut).sendKeys(facturacionelectronica);
    }

    public void tipoDocumento(String tipodocumento) {
        Select identificacion = new Select(getDriver().findElement(listtipodoc));
        identificacion.selectByVisibleText(tipodocumento);
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
        Select Ciudad = new Select(getDriver().findElement(listciudad));
        Ciudad.selectByVisibleText(ciudad);
    }

    public void direccion(String direccion) {
        getDriver().findElement(txtdireccion).clear();
        getDriver().findElement(txtdireccion).sendKeys(direccion);
    }

    public void georreferenciar() {
        getDriver().findElement(btngeorreferenciar).click();
    }

    public void celular(String telefonocelular) throws InterruptedException {
        Thread.sleep(3000);
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
        Select Genero = new Select(getDriver().findElement(listgenero));
        Genero.selectByVisibleText(genero);
    }

    public void tratamientoDatos(String autorizotratamientodatos) {
        getDriver().findElement(listhabeasdata).sendKeys(autorizotratamientodatos);
    }

    public void siguientecf() {
        getDriver().findElement(btnsiguiente).click();
    }

    /*Formulario Cliente Envio*/

    public void verFormularioClienteEnvio() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(formularioclienteenvio));
    }

    public void tipoDocumento_ce(String tipodocumento_ce) {
        Select identificacion = new Select(getDriver().findElement(listtipodocce));
        identificacion.selectByVisibleText(tipodocumento_ce);
    }

    public void numeroDocumento_ce(String numerodocumento_ce) {
        getDriver().findElement(textnumdocce).sendKeys(numerodocumento_ce);
    }

    public void btnBuscar_ce() {
        getDriver().findElement(btnbuscarce).click();
        if (isElementVisible(poupclientenoexistece)) {
            getDriver().findElement(btnaceptarce).click();
        } else {
            getDriver().findElement(txtprimernombrece).clear();
        }
    }

    public void primerNombre_ce(String primernombre_ce) {
        getDriver().findElement(txtprimernombrece).sendKeys(primernombre_ce);
    }

    public void segundoNombre_ce(String segundonombre_ce) {
        getDriver().findElement(txtsegundonombrece).clear();
        getDriver().findElement(txtsegundonombrece).sendKeys(segundonombre_ce);
    }

    public void primerApellido_ce(String primerapellido_ce) {
        getDriver().findElement(txtprimerapellidoce).clear();
        getDriver().findElement(txtprimerapellidoce).sendKeys(primerapellido_ce);
    }

    public void segundoApellido_ce(String segundoapellido_ce) {
        getDriver().findElement(txtsegundoapellidoce).clear();
        getDriver().findElement(txtsegundoapellidoce).sendKeys(segundoapellido_ce);
    }

    public void ciudad_ce(String ciudad_ce) {
        Select Ciudad = new Select(getDriver().findElement(listciudadce));
        Ciudad.selectByVisibleText(ciudad_ce);
    }

    public void direccion_ce(String direccion_ce) {
        getDriver().findElement(txtdireccionce).clear();
        getDriver().findElement(txtdireccionce).sendKeys(direccion_ce);
    }

    public void georreferenciar_ce() {
        getDriver().findElement(btngeorreferenciarce).click();
    }

    public void celular_ce(String telefonocelular_ce) throws InterruptedException {
        Thread.sleep(3000);
        getDriver().findElement(txtcelularce).clear();
        getDriver().findElement(txtcelularce).sendKeys(telefonocelular_ce);
    }

    public void telefonoFijo_ce(String telefonofijo_ce) {
        getDriver().findElement(txtfijoce).clear();
        getDriver().findElement(txtfijoce).sendKeys(telefonofijo_ce);
    }

    public void email_ce(String email_ce) {
        getDriver().findElement(txtemailce).clear();
        getDriver().findElement(txtemailce).sendKeys(email_ce);
    }

    public void genero_ce(String genero_ce) {
        Select Genero = new Select(getDriver().findElement(selectgeneroce));
        Genero.selectByVisibleText(genero_ce);
    }

    public void siguientece() {
        getDriver().findElement(btnsiguientece).click();
    }

    /*Formulario Productos*/
    public void productos(String ean) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(txtean));
        getDriver().findElement(txtean).sendKeys(ean);
    }

    public void buscarEan() {
        getDriver().findElement(btnbuscarean).click();
        if (isElementVisible(popupeansincobertura)) {
            getDriver().findElement(btnaceptar).click();
            System.out.println("El ean ingresado no tiene cobertura para la unidad de despacho seleccionada");
            getDriver().close();
            if (isElementVisible(popupsinprecio))
                getDriver().findElement(btnaceptar).click();
            System.out.println("El ean ingresado no tiene precio");
            getDriver().close();
            if (isElementVisible(popupsininventario))
                getDriver().findElement(btnaceptar).click();
            System.out.println("El ean ingresado no tiene inventario");
            getDriver().close();
        } else
            System.out.println("El ean ingresado tiene inventario disponible");
    }

    public void agregarCantidad(String cantidad) {
        getDriver().findElement(txtcantidad).sendKeys(cantidad);
        getDriver().findElement(btncarro).click();
        if (isElementVisible(popupproductoagregado))
            getDriver().findElement(btnaceptarcarro).click();
    }

    public void siguienteprod() {
        getDriver().findElement(btnsiguienteprod).click();
        if (isElementVisible(pupupproductosagregados))
            getDriver().findElement(btnaceptarproducto).click();
    }


    /*Formulario Cliente Recoge*/


    /*Calendario*/
    public void calendarioFechaPactadaEntrega() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(formulariomediospago));
        boolean CambiarMes = true;
        getDriver().findElement(selectfecha).click();
        while (CambiarMes) {
            List<WebElement> listcalendariodia = getDriver().findElements(listcalendario);
            System.out.println(listcalendariodia.size());
            if (listcalendariodia.size() == 0) {
                getDriver().findElement(btnsiguientemes).click();
            } else {
                listcalendariodia.get(0).click();
                CambiarMes = false;
            }
        }
    }
    /*Formulario Medios Pago*/
    public void clicGuardarFecha() {
    getDriver().findElement(btnguardarfecha).click();
    getDriver().findElement(popupfechaguardada).click();
    }



    public void salirChrome() {
        getDriver().close();
    }
}
