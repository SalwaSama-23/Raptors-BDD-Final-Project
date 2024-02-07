package bdd.steps.smoke;

import bdd.pages.HomePage;
import bdd.pages.LoginPage;
import bdd.utilities.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep extends SeleniumUtilities {
    @When("click on login button")
    public void click_on_login_button() {
        clickOnElement(HomePage.LOGIN_BTN);
    }

    @When("enter username as {string}")
    public void enter_username_as(String userName) {
        senKeys(LoginPage.USER_NAME, userName);
    }

    @When("enter password as {string}")
    public void enter_password_as(String password) {
        senKeys(LoginPage.PASSWORD, password);
    }

    @When("click on sign in button")
    public void click_on_sign_in_button() {
        clickOnElement(LoginPage.SIGN_IN_BTN);
        waitTime(3000);
    }

    @Then("validate page text is {string}")
    public void validate_page_text_is(String text) {
        String actualText = getTextElement(LoginPage.PAGE_TEXT);
        Assert.assertEquals(text, actualText);
    }

    @Then("validate error message {string}")
    public void validate_error_message(String expectedMessage) {
        String error = getTextElement(LoginPage.ERROR_MESSAGE);
        String actualError = error.replaceAll("ERROR\n", "");
        Assert.assertEquals(expectedMessage , actualError);
    }
}
