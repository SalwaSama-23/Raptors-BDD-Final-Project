package bdd.pages;

import org.openqa.selenium.By;

public class UserProfilePage {
    public static final By USER_PROFILE_BTN = By.xpath("//button[@type='button']");
    public static final By USER_TYPE = By.xpath("//p[contains(text() ,'CSR')]");
    public static final By FULL_NAME = By.xpath("//p[contains(text() ,'Supervisor')]");
    public static final By USER_NAME =By.xpath("//p[contains(text() ,'supervisor')]");
    public static final By AUTHORITIES = By.xpath("//li[contains(text() ,'admin')]");
    public static final By LOGOUT_BTN =By.xpath("//button[contains(text(),'Logout')] ");
    public static final By HOME_PAGE_TEXT =By.xpath("//h2[contains(text(),'TEK Insurance App')]");


}
