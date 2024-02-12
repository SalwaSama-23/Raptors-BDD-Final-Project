package bdd.steps.smoke;
import bdd.pages.AccountPage;
import bdd.utilities.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountsStep extends SeleniumUtilities {
    @When("click on Account button")
    public void click_on_account_btn(){
        clickOnElement(AccountPage.ACCOUNT_BTN);
    }
    @Then("validate {int} row is exist")
    public void validate_row(int expectedRowNum){
      int actualRowNum =  getRowNumber(AccountPage.ROW_NUMBER);
        Assert.assertEquals(expectedRowNum,actualRowNum);
    }
    @Then("validate table records change per page according to selected show per {string}")
    public void table_record_per_page(String num){
        selectElement2(AccountPage.DROP_DOWN, num);
        getRowNumber(AccountPage.ROW_NUMBER);
}
    }


