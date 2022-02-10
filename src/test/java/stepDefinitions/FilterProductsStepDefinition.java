package stepDefinitions;

import com.saucedemo.questions.AddProductQuestion;
import com.saucedemo.questions.FilterQuestion;
import com.saucedemo.tasks.FilterTasks;
import com.saucedemo.tasks.LoginTasks;
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

    }

    @When("^she wants to filter the products from highest to lowest price$")
    public void sheWantsToFilterTheProductsFromHighestToLowestPrice() {
        andrea.attemptsTo(FilterTasks.info());
    }


    @Then("^she sees the product with a value of \"([^\"]*)\" as the first in the list$")
    public void sheSeesTheProductWithAValueOfAsTheFirstInTheList(String priceMax) {
        andrea.should(GivenWhenThen.seeThat(FilterQuestion.compare(),
                Matchers.equalTo(priceMax)));
    }
}
