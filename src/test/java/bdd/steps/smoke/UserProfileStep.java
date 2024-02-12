package bdd.steps.smoke;

import bdd.pages.UserProfilePage;
import bdd.utilities.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserProfileStep extends SeleniumUtilities {
    @When("click on profile button")
    public void click_on_profile_button(){
        clickOnElement(UserProfilePage.USER_PROFILE_BTN);
    }
    @Then ("validate profile information is correct")
    public void profile_info_is_correct() {
        String actualUserType = getTextElement(UserProfilePage.USER_TYPE);
        Assert.assertEquals("CSR" , actualUserType);
        String actualFullName = getTextElement(UserProfilePage.FULL_NAME);
        Assert.assertEquals("Supervisor", actualFullName);
        String actualUserName = getTextElement(UserProfilePage.USER_NAME);
        Assert.assertEquals("supervisor", actualUserName);
        String actualAuthorities = getTextElement(UserProfilePage.AUTHORITIES);
        Assert.assertEquals("admin" , actualAuthorities);
    }
    @When("click on logout button")
    public void click_on_logout_button() {
       clickOnElement(UserProfilePage.LOGOUT_BTN);
    }
    @Then("validate user navigate to home page")
    public void validate_user_navigate_to_home_page() {
       String homeText = getTextElement(UserProfilePage.HOME_PAGE_TEXT);
       Assert.assertEquals("TEK Insurance App" , homeText);
    }
    }
