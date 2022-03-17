package panelcliente.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/consultacliente.feature"},
        glue = {"panelcliente.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)


public class ConsultaClienteRunner {
}
