package bdd.steps.smoke;

import bdd.pages.PlansPage;
import bdd.utilities.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class PlansStep extends SeleniumUtilities {

    @When("click on plans page")
    public void click_on_plans_page() {
       clickOnElement(PlansPage.PLANS_BTN);
    }
    @Then("Validate four row of data is present")
    public void validate_row_of_data_is_present( ) {
      getRowNumber(PlansPage.ROW_NUMBER);
    }

    @Then ("validate create date")
    public void validate_create_date(){
        String createdDate=getCreatedDate();
        String actualCreateDate = getTextElement(PlansPage.CREATE_DATE);
        Assert.assertEquals( createdDate, actualCreateDate);
    }

    @Then("validate expire date")
    public void validate_expire_date(){
        String expiredDate = getExpiredDate();
      String actualExpireDate = getTextElement(PlansPage.EXPIRE_DATE);
      Assert.assertEquals(expiredDate , actualExpireDate);
    }
    }
