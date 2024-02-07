package bdd.pages;

import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final By CPAH = By.xpath("//h2[@class='chakra-heading css-1jb3vzl']");
    public static final By EMAIL = By.name("email");
    public static final By FIRST_NAME = By.name("firstName");
    public static final By GENDER = By.name("gender");
    public static final By EMP_STATUS = By.name("employmentStatus");
    public static final By TITLE = By.name("title");
    public static final By LAST_NAME = By.name("lastName");
    public static final By MARTIAL_STATUS = By.name("maritalStatus");
    public static final By DATE_OF_BIRTH = By.name("dateOfBirth");
    public static final By CREATE_ACCOUNT_BTN = By.xpath("//button[@type='submit']");
    public static final By EXPECTED_EMAIL = By.xpath("//h2[3][@class='chakra-heading css-18j379d']");
    public static final By SIGN_IN_PAGE_TEXT = By.xpath("//h2[contains( text() , 'Sign up your account')]");
    public static final By ERROR_MESSAGE = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat'] ");
}