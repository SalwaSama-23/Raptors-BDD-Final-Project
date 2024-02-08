package bdd.utilities;

import bdd.Base.BaseSetup;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;


public class SeleniumUtilities extends BaseSetup {

    private By locator;

    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }
    public WebElement waitForVisibility(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public String getPageTitle(By locator){
        return getDriver().getTitle();
    }
    public boolean isDisplayed(By locator){
       return waitForVisibility(locator).isDisplayed();
    }
    public void clickOnElement(By locator){
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public String getTextElement(By locator){
      return waitForVisibility(locator).getText();
    }
    public void senKeys(By locator , String text){
        waitForVisibility(locator).sendKeys(text);
    }
    public void selectElement(By locator ,String text){
        WebElement element1 = waitForVisibility(locator);
        Select select = new Select(element1);
        select.selectByVisibleText(text);
    }
    public void selectElement2(By locator ,String text){
        WebElement element1 = waitForVisibility(locator);
        Select select = new Select(element1);
        select.selectByValue(text);
    }



    public void getRowNumber(By locator){
        List<WebElement> row = getDriver().findElements(locator);
        System.out.println(row.size());
    }

    public static String randomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
    public static String getCreatedDate() {
            DateFormat dateFormat = new SimpleDateFormat("MMMMM d, yyyy");
            dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));
            Date date = new Date();
            return dateFormat.format(date);
            }
    public static String getExpiredDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d, yyyy");
        dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));
         return dateFormat.format(tomorrow);
    }


    public static void waitTime(int wait){
      try {
          Thread.sleep(wait);

      }catch (InterruptedException e){
          throw new RuntimeException(e);
      }
    }
}
