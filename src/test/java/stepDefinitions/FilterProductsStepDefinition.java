package stepDefinitions;

import com.saucedemo.tasks.FilterTasks;
import com.saucedemo.tasks.LoginTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class FilterProductsStepDefinition {

    @Managed
    public WebDriver hisBrowser;
    Actor andrea = new Actor("andrea");

    @Before
    public void setUp(){
        andrea.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Andrea as a customer sees the products$")
    public void andreaAsACustomerSeesTheProducts() {
        andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));
        andrea.attemptsTo(LoginTasks.info());
    }

    @When("^she wants to filter the products from highest to lowest price$")
    public void sheWantsToFilterTheProductsFromHighestToLowestPrice() {
        andrea.attemptsTo(FilterTasks.info());

    }

    @Then("^she sees the products from highest to lowest price$")
    public void sheSeesTheProductsFromHighestToLowestPrice() {

    }
}
