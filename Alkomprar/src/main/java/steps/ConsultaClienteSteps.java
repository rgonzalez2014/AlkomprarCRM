package steps;


import net.thucydides.core.annotations.Step;
import page.ConsultaCliente;


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
    public void cerrarChrome() {
        consultaPOM.salirChrome();
    }
}
