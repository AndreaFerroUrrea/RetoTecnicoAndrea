package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithDriver;
import org.openqa.selenium.WebDriver;

public class UsersRolStepDefinitions {
    @Managed
    private WebDriver hisBrowser;
    Actor andrea = new Actor("andrea");
    @Before
    public void setUp(){andrea.can(BrowseTheWeb.with(hisBrowser));}


    @Given("^Andrea is a client who needs to log in$")
    public void andreaIsAClientWhoNeedsToLogIn() {
        andrea.wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^she wants to try the different roles$")
    public void sheWantsToTryTheDifferentRoles(DataTable user) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).

    }

    @Then("^she should see the appropriate result for each role$")
    public void sheShouldSeeTheAppropriateResultForEachRole() {
        // Write code here that turns the phrase above into concrete actions

    }
}
