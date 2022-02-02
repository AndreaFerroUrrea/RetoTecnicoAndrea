package stepDefinitions;

import com.saucedemo.tasks.LoginTasks;
import com.saucedemo.tasks.PurchaseProductTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class TaxValueStepDefinition {


    @Managed
    Actor andrea = new Actor("andrea");
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        andrea.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Andrea as a customer when making a purchase$")
    public void andreaAsACustomerWhenMakingAPurchase() {
        andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));
        andrea.attemptsTo(LoginTasks.info());
        andrea.attemptsTo(PurchaseProductTasks.info());
    }

    @When("^she consults the tax value of the purchase$")
    public void sheConsultsTheTaxValueOfThePurchase() {

    }

    @Then("^she checks that the tax is (\\d+)%$")
    public void sheChecksThatTheTaxIs(int arg1) {

    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    @Given("^Andrea as Swag Labs customer$")
    public void andreaAsSwagLabsCustomer() {
        andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));
        andrea.attemptsTo(LoginTasks.info());

    }

    @When("^she buys a product$")
    public void sheBuysAProduct() {

    }

    @Then("^she checks if the value is correct$")
    public void sheChecksIfTheValueIsCorrect() {

    }

}
