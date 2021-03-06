package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/shoppingCart.feature",
glue = "stepDefinitions",
snippets = SnippetType.CAMELCASE,
dryRun = false)

public class ShoppingCartRunner {
}
