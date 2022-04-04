package runners.steps;


import runners.page.ConsultaCliente;
import net.thucydides.core.annotations.Step;


public class ConsultaClienteSteps {


    ConsultaCliente consultaPOM = new ConsultaCliente();

    @Step
    public void abrirCRMCartera() {
        consultaPOM.open();
    }

    @Step
    public void escribirUsuario(String usuario) {
        consultaPOM.ingresarUsuario(usuario);
    }

    @Step
    public void escribirClave(String clave) {
        consultaPOM.ingresarClave(clave);
    }

    @Step
    public void clicIngresar() {
        consultaPOM.clicIngresar();
    }

    @Step
    public void clicPrincipal() {
        consultaPOM.clicPrincipal();
    }

    @Step
    public void clicPrincipalPanelNuevo() {
        consultaPOM.clicPrincipalPanelCliente();
    }

    @Step
    public void ingresarIframe() {
        consultaPOM.ingresarFrame();
    }

    @Step
    public void ingresarDocumento(String documento) {
        consultaPOM.ingresarDocumento(documento);
    }

    @Step
    public void clicBuscar() {
        consultaPOM.clicBuscar();
    }

    @Step
    public void verDatosCliente() {
        consultaPOM.vistaDatosCliente();
    }

    @Step
    public void cerrarChrome() {
        consultaPOM.salirChrome();
    }
}
