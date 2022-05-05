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

    public void clicCrear(){
        creacionPOM.clicCrear();
    }

    public void registarClienteFactura(String unidadventa){
        creacionPOM.registrarClienteFactura(unidadventa);
    }
    @Step
    public void cerrarChrome() {
        creacionPOM.salirChrome();
    }
}
