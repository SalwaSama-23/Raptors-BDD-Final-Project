package bdd.steps.smoke;

import bdd.pages.HomePage;
import bdd.utilities.SeleniumUtilities;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageStep extends SeleniumUtilities {
    @Then("validate home page title is {string}")
    public void validate_home_page_title_is(String title) {
  String actualTitle = getPageTitle(HomePage.PAGE_TITLE);
        Assert.assertEquals(title,actualTitle);
    }
    @Then("validate create Primary Account is exist")
    public void validate_create_Primary_Account_is_exist() {
   boolean btnIsDisplay = isDisplayed(HomePage.PRIMARI_BTN);
   Assert.assertTrue(btnIsDisplay);
    }

}
