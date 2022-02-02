package stepDefinitions;

import com.saucedemo.questions.PurchaseProductQuestion;
import com.saucedemo.tasks.LoginTasks;
import com.saucedemo.tasks.PurchaseProductTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


public class PurchaseProductStepDefinition {

    @Managed
    private WebDriver hisBrowser;
    Actor andrea = new Actor("andrea");

    @Before
    public void setUp(){
        andrea.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Andrea as a customer wants to make a purchase$")
    public void andreaAsACustomerWantsToMakeAPurchase() {
        andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));
        andrea.attemptsTo(LoginTasks.info());
    }

    @When("^she completes the purchase process correctly$")
    public void sheCompletesThePurchaseProcessCorrectly() {
        andrea.attemptsTo(PurchaseProductTasks.info());
    }

    @Then("^she validates that the purchase has been made$")
    public void sheValidatesThatThePurchaseHasBeenMade() {
        andrea.should(GivenWhenThen.seeThat(PurchaseProductQuestion.compare(),
                Matchers.is(Matchers.equalTo("CHECKOUT: COMPLETE!"))));
    }
}
