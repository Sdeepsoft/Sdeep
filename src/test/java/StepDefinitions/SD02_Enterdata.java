package StepDefinitions;

import CreateAccount.AT02_CreateAccount;
import HomePage.AT01_Navigate;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD02_Enterdata {
    @Then("Enter Firstname as {string}")
    public void enter_firstname_as(String string) {
        AT02_CreateAccount.enterfirstname();

    }

    @Then("Enter lastname as {string}")
    public void enter_lastname_as(String string) {
         AT02_CreateAccount.enterlastname();
    }

    @Then("Enter Emailaddress as {string}")
    public void enter_emailaddress_as(String string) {
        AT02_CreateAccount.enteremail();
    }

    @Then("Enter Password as {string}")
    public void enter_password_as(String string) {
       AT02_CreateAccount.enterpswd();
    }

    @Then("Enter RePassword as {string}")
    public void enter_re_password_as(String string) {
       AT02_CreateAccount.enterrepswd();
    }


    }

