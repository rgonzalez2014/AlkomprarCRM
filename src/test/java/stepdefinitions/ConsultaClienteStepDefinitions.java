package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataPanelCliente;
import net.thucydides.core.annotations.Steps;
import step.ConsultaClienteSteps;

import java.util.List;

public class ConsultaClienteStepDefinitions {

    @Steps
    ConsultaClienteSteps consultacliente;

    @Given("^Se despliega la pagina crm cartera colcomercio e ingresan las credenciales$")
    public void se_despliega_la_pagina_crm_cartera_colcomercio_e_ingresan_las_credenciales(List<DataPanelCliente> DatosCliente) {
        consultacliente.abrirCRMCartera();
        consultacliente.escribirUsuario(DatosCliente.get(0).getUsuario());
        consultacliente.escribirClave(DatosCliente.get(0).getPassword());
        consultacliente.clicIngresar();

    }

    @When("^Se ingresa al modulo de panel cliente$")
    public void se_ingresa_al_modulo_de_panel_cliente() {
        consultacliente.clicPrincipal();
        consultacliente.clicPrincipalPanelNuevo();
    }

    @When("^Se consulta un documento$")
    public void se_consulta_un_documento(List<DataPanelCliente> DatosCliente) {
        consultacliente.ingresarIframe();
        consultacliente.ingresarDocumento(DatosCliente.get(0).getDocumento());
        consultacliente.clicBuscar();
    }

    @Then("^Se visualizan los datos del cliente$")
    public void se_visualizan_los_datos_del_cliente() {
        consultacliente.verDatosCliente();
        consultacliente.cerrarChrome();
    }
}
