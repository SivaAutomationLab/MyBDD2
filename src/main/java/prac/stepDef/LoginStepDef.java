package prac.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import prac.initialization.Initialization;

import java.io.FileNotFoundException;
import java.io.IOException;
import static prac.initialization.Initialization.*;
public class LoginStepDef {
    @Given("User launches the web browser")
    public void userLaunchesTheWebBrowser() throws IOException, InterruptedException {
        Initialization.openBrowser();

    }

    @When("User enters the valid {string} and {string}")
    public void userEntersTheValidAnd(String arg0, String arg1) {
    }

    @Then("User clicks on submit button")
    public void userClicksOnSubmitButton() {
    }

    @And("User validates the login screen")
    public void userValidatesTheLoginScreen() {
    }


}
