package StepDefinitions;

import HomePage.AT01_Navigate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_RegistertoHNwebsite {
    @Given("Open the browser and enter url and press enter key")
    public void open_the_browser_and_enter_url_and_press_enter_key() throws IOException {
        AT01_Navigate.nav();
    }

    @Then("System should navigate to Create Account screen of HN website")
    public void system_should_navigate_to_create_account_screen_of_hn_website() {
        AT01_Navigate.asserttitle();
    }

}
