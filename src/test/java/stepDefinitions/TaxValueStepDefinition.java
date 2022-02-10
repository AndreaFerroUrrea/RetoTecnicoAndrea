package stepDefinitions;

import com.saucedemo.questions.TaxQuestion;
import com.saucedemo.questions.TotalPriceQuestion;
import com.saucedemo.tasks.TaxTasks;
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


public class TaxValueStepDefinition {


    @Managed
    public WebDriver hisBrowser;
    Actor andrea = new Actor("andrea");


    @Before
    public void setUp(){
        andrea.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^to Andrea as a customer when making a purchase of the most expensive product$")
    public void toAndreaAsACustomerWhenMakingAPurchaseOfTheMostExpensiveProduct() {
        andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));}
    @When("^you consult the fiscal value of the purchase$")
    public void youConsultTheFiscalValueOfThePurchase() {andrea.attemptsTo(TaxTasks.info());}

    @Then("^check that the tax is \"([^\"]*)\"$")
    public void checkThatTheTaxIs(String Tax) {
        andrea.should(GivenWhenThen.seeThat(TaxQuestion.compare(), Matchers.is(Matchers.equalTo(Tax))));}
////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("^to Andrea as a client of Swag Labs$")
    public void toAndreaAsAClientOfSwagLabs() {
        andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^she buys the most expensive product$")
    public void sheBuysTheMostExpensiveProduct() {
        andrea.attemptsTo(TaxTasks.info());
    }

    @Then("^check if the total value is \"([^\"]*)\"$")
    public void checkIfTheTotalValueIs(String total) {
        andrea.should(GivenWhenThen.seeThat(TotalPriceQuestion.compare(), Matchers.is(Matchers.equalTo(total))));
    }

}