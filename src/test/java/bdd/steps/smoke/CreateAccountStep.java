package bdd.steps.smoke;

import bdd.pages.CreateAccountPage;
import bdd.pages.HomePage;
import bdd.utilities.SeleniumUtilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.Map;

public class CreateAccountStep extends SeleniumUtilities {
  private static String email;
    @When("click on create primary account button")
    public void click_on_create_primary_account_button() {
        clickOnElement(HomePage.PRIMARI_BTN);
    }
    @Then("validate form title is {string}")
    public void validate_form_title_is(String text) {
    String actualTitle = getTextElement(CreateAccountPage.CPAH);
        Assert.assertEquals( text,actualTitle);
    }

        @When("fill Create Primary Account Holder form")
    public void fill_out_the_form(DataTable dataTable  ) {
        email =randomEmail();
        Map<String , String> data = dataTable.asMap();
        senKeys(CreateAccountPage.EMAIL,email);
        senKeys(CreateAccountPage.FIRST_NAME, data.get("firstName"));
        selectElement(CreateAccountPage.GENDER,data.get("gender"));
        senKeys(CreateAccountPage.EMP_STATUS, data.get("employmentStatus"));
        selectElement(CreateAccountPage.TITLE, data.get("title"));
        senKeys(CreateAccountPage.LAST_NAME, data.get("lastName"));
        selectElement(CreateAccountPage.MARTIAL_STATUS,data.get("martialStatus"));
        senKeys(CreateAccountPage.DATE_OF_BIRTH, data.get("dateOfBirth"));
    }
        @Then("click on Create Account button")
        public void click_on_Create_Account_button() {
            clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BTN);
        }
    @Then("Validate user navigate to {string} page")
    public void Validate_user_navigate_to_Sing_up_your_Account_page(String expectedText){
     String actualText = getTextElement(CreateAccountPage.SIGN_IN_PAGE_TEXT);
     Assert.assertEquals(expectedText , actualText);
    }
        @Then("validate email address displays as expected")
        public void validate_email_address(){
        String actualEmail = getTextElement(CreateAccountPage.EXPECTED_EMAIL);
        Assert.assertEquals( email,actualEmail);
        }
   @When("fill up Create Primary Account Holder form")
   public void fill_up_Create_Primary_Account_Holder_form(DataTable dataTable){
       Map<String , String> data = dataTable.asMap();
       senKeys(CreateAccountPage.EMAIL, data.get("emailAddress"));
       senKeys(CreateAccountPage.FIRST_NAME, data.get("firstName"));
       selectElement(CreateAccountPage.GENDER,data.get("gender"));
       senKeys(CreateAccountPage.EMP_STATUS, data.get("employmentStatus"));
       selectElement(CreateAccountPage.TITLE, data.get("title"));
       senKeys(CreateAccountPage.LAST_NAME, data.get("lastName"));
       selectElement(CreateAccountPage.MARTIAL_STATUS,data.get("martialStatus"));
       senKeys(CreateAccountPage.DATE_OF_BIRTH, data.get("dateOfBirth"));
   }

    @Then ("validate error message is {string}")
    public void validate_error_message2(String expectedError){
        String actualError = getTextElement(CreateAccountPage.ERROR_MESSAGE);
        String error = actualError.replaceAll("ERROR\n" , "");
        Assert.assertEquals(expectedError , error);
    }
}