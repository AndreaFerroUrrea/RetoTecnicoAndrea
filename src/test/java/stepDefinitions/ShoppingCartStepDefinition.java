package stepDefinitions;

import com.saucedemo.questions.AddProductQuestions;
import com.saucedemo.questions.PurchaseProductQuestion;
import com.saucedemo.tasks.AddProductTasks;
import com.saucedemo.tasks.LoginTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class ShoppingCartStepDefinition {

    @Managed
    public WebDriver hisBrowser;
    Actor andrea = new Actor("andrea");

    @Before
    public void setUp(){
        andrea.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Andrea correctly enters the login data$")
    public void andreaCorrectlyEntersTheLoginData() {
        andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));
        andrea.attemptsTo(LoginTasks.info());
    }
    @When("^she wants to check the operation of the cart$")
    public void sheWantsToCheckTheOperationOfTheCart() {
andrea.attemptsTo(AddProductTasks.info());
    }
    @Then("^she should validate the cart product$")
    public void sheShouldValidateTheCartProduct() {
        andrea.should(GivenWhenThen.seeThat(AddProductQuestions.compare(),
                Matchers.equalTo("1")));
    }
}
