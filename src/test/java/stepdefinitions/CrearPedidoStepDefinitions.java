package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataTeleventas;
import net.thucydides.core.annotations.Steps;
import steps.CrearPedidoSteps;

import java.util.List;

public class CrearPedidoStepDefinitions {

    @Steps
    CrearPedidoSteps pedido;

    @Given("^Se despliega la pagina cmpqr_cartera e ingresan las credenciales$")
    public void se_despliega_la_pagina_cmpqr_cartera_e_ingresan_las_credenciales(List<DataTeleventas> listadatos) {
        pedido.abrirCMPQR();
        pedido.escribirUsuario(listadatos.get(0).getUsuario());
        pedido.escribirContrasena(listadatos.get(0).getPassword());
        pedido.clicIngresar();
    }

    @When("^Se ingresa al modulo principal y luego a televentas$")
    public void se_ingresa_al_modulo_principal_y_luego_a_televentas() {
        pedido.clicPrincipal();
        pedido.clicTeleventas();

    }

    @Then("^Se hace clic en el boton Crear y registran los datos del formulario cliente factura$")
    public void se_hace_clic_en_el_boton_Crear_y_registran_los_datos_del_formulario_cliente_factura(List<DataTeleventas> listadatos) {
        pedido.ingresarIframe();
        pedido.clicCrear();
        pedido.selectUnidadVenta(listadatos.get(0).getUnidadventa());
        pedido.selectFacturacionAutomatica(listadatos.get(0).getFacturacionelectronica());
        pedido.selectTipoDocumento(listadatos.get(0).getTipodocumento());
        pedido.ingresarDocumento(listadatos.get(0).getNumerodocumento());
        pedido.buscarDocumento();
        pedido.ingresarPrimerNombre(listadatos.get(0).getPrimernombre());
        pedido.ingresarSegundoNombre(listadatos.get(0).getSegundonombre());
        pedido.ingresarPrimerApellido(listadatos.get(0).getPrimerapellido());
        pedido.ingresarSegundoApellido(listadatos.get(0).getSegundoapellido());
        pedido.selectCiudad(listadatos.get(0).getCiudad());
        pedido.ingresarDireccion(listadatos.get(0).getDireccion());
        pedido.clicGeorreferenciar();
        pedido.ingresarNumeroCelular(listadatos.get(0).getTelefonocelular());
        pedido.ingresarTelefonoFijo(listadatos.get(0).getTelefonofijo());
        pedido.ingresarEmail(listadatos.get(0).getEmail());
        pedido.selectGenero(listadatos.get(0).getGenero());
        pedido.selectTratamientoDatos(listadatos.get(0).getAutorizotratamientodatos());
        //pedido.clicSiguienteFC();

        pedido.cerrarChrome();
    }
/*
    @Then("^Se registran los datos del formulario cliente envio$")
    public void se_registran_los_datos_del_formulario_cliente_envio() {

    }

    @Then("^Se agregan productos al pedido$")
    public void se_agregan_productos_al_pedido() {

    }

    @Then("^Se registran los datos del medio de pago$")
    public void se_registran_los_datos_del_medio_de_pago() {

    }

    @Then("^Se crea el pedido quedando en estado confirmacion pago$")
    public void se_crea_el_pedido_quedando_en_estado_confirmacion_pago() {

    }



 */
}
