package steps;


import page.CrearPedido;
import net.thucydides.core.annotations.Step;


public class CrearPedidoSteps {


    CrearPedido creacionPOM = new CrearPedido();

    @Step
    public void abrirCMPQR() {
        creacionPOM.open();
    }

    @Step
    public void escribirUsuario(String usuario) {
        creacionPOM.ingresarUsuario(usuario);
    }

    @Step
    public void escribirContrasena(String clave) {
        creacionPOM.ingresarContrasena(clave);
    }

    @Step
    public void clicIngresar() {
        creacionPOM.clicIngresar();
    }

    @Step
    public void clicPrincipal() {
        creacionPOM.clicPrincipal();
    }

    @Step
    public void clicTeleventas() {
        creacionPOM.clicTeleventas();
    }

    @Step
    public void ingresarIframe() {
        creacionPOM.ingresarFrame();
    }

    @Step
    public void clicCrear() {
        creacionPOM.clicCrear();
    }

    @Step
    public void selectUnidadVenta(String unidadventa) {
        creacionPOM.unidadVenta(unidadventa);
    }

    @Step
    public void selectFacturacionAutomatica(String facturacionelectronica) {
        creacionPOM.factElec(facturacionelectronica);
    }

    @Step
    public void selectTipoDocumento(String tipodocumento) {
        creacionPOM.tipoDocumento(tipodocumento);
    }

    @Step
    public void ingresarDocumento(String numerodocumento) {
        creacionPOM.numeroDocumento(numerodocumento);
    }

    @Step
    public void buscarDocumento() {
        creacionPOM.btnBuscar();
    }

    @Step
    public void ingresarPrimerNombre(String primernombre) {
        creacionPOM.primerNombre(primernombre);
    }

    @Step
    public void ingresarSegundoNombre(String segundonombre) {
        creacionPOM.segundoNombre(segundonombre);
    }

    @Step
    public void ingresarPrimerApellido(String primerapellido) {
        creacionPOM.primerApellido(primerapellido);
    }

    @Step
    public void ingresarSegundoApellido(String segundoapellido) {
        creacionPOM.segundoApellido(segundoapellido);
    }

    @Step
    public void selectCiudad(String ciudad) {
        creacionPOM.ciudad(ciudad);
    }

    @Step
    public void ingresarDireccion(String direccion) {
        creacionPOM.direccion(direccion);
    }

    @Step
    public void clicGeorreferenciar() {
        creacionPOM.georreferenciar();
    }

    @Step
    public void ingresarNumeroCelular(String telefonocelular) {
        creacionPOM.celular(telefonocelular);
    }

    @Step
    public void ingresarTelefonoFijo(String telefonofijo) {
        creacionPOM.telefonoFijo(telefonofijo);
    }

    @Step
    public void ingresarEmail(String email) {
        creacionPOM.email(email);
    }

    @Step
    public void selectGenero(String genero) {
        creacionPOM.genero(genero);
    }

    @Step
    public void selectTratamientoDatos(String autorizotratamientodatos) {
        creacionPOM.tratamientoDatos(autorizotratamientodatos);
    }

    @Step
    public void clicSiguienteFC() {
        creacionPOM.siguienteCF();
    }

    @Step
    public void cerrarChrome() {
        creacionPOM.salirChrome();
    }
}
