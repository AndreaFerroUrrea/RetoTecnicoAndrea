package stepDefinitions;

import com.saucedemo.models.DataUser;
import com.saucedemo.tasks.LoginTasks;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

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

    @When("^she wants to try the different roles with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void sheWantsToTryTheDifferentRolesWithAnd(String username, String password) {

        DataUser dataUser = new DataUser();
        dataUser.setUsername(username);
        dataUser.setPassword(password);

    }

    @Then("^she should see the appropriate result for each role$")
    public void sheShouldSeeTheAppropriateResultForEachRole() {
    }
}
