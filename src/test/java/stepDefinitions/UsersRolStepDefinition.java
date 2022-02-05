package stepDefinitions;

import com.saucedemo.tasks.LoginRolTasks;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class UsersRolStepDefinition {
    @Managed
    public WebDriver hisBrowser;
    Actor andrea = new Actor("Andrea");


    @Before
    public void setUp(){
        andrea.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Andrea is a client who needs to log in$")
    public void andreaIsAClientWhoNeedsToLogIn() {
andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }


    @When("^she wants to try the different roles with$")
    public void sheWantsToTryTheDifferentRolesWith(Map<String, String> userData)  {
        andrea.attemptsTo(LoginRolTasks.info(userData));
    }

    @Then("^she should see the appropriate result for each role$")
    public void sheShouldSeeTheAppropriateResultForEachRole() {

    }
}
