package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsersRolStepDefinition {
    @Given("^Andrea is a client who needs to log in$")
    public void andreaIsAClientWhoNeedsToLogIn() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^she wants to try the different roles$")
    public void sheWantsToTryTheDifferentRoles(DataTable arg1) {
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
