package stepDefinitions;

import com.saucedemo.questions.AddProductQuestion;
import com.saucedemo.tasks.AddProductTasks;
import com.saucedemo.tasks.LoginTasks;
import com.saucedemo.tasks.MenuTasks;
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


public class MenuStepDefinition {

    @Managed
    public WebDriver hisBrowser;
    Actor andrea = new Actor("Andrea");

    @Before
    public void setUp(){
        andrea.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Andrea as a client wishes to reset the state of the application$")
    public void andreaAsAClientWishesToResetTheStateOfTheApplication() {
        andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));
        andrea.attemptsTo(LoginTasks.info());
        andrea.attemptsTo(AddProductTasks.info());
    }

    @When("^she chooses the option in the menu$")
    public void sheChoosesTheOptionInTheMenu() {
        andrea.attemptsTo(MenuTasks.info());

    }

    @Then("^she watches the reset app$")
    public void sheWatchesTheResetApp() {
        andrea.should(GivenWhenThen.seeThat(AddProductQuestion.compare(),
                Matchers.equalTo("0")));
    }
}
