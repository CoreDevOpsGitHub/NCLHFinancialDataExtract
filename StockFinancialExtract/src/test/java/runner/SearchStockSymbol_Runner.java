package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)


@CucumberOptions(features = "src/test/resources/features/2_SearchStockSymbol.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class SearchStockSymbol_Runner {
}
