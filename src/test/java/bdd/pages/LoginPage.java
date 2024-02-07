package bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {
public static final By USER_NAME = By.name("username");
public static final By PASSWORD =By.name("password");
public static final By SIGN_IN_BTN =By.xpath("//button[@type='submit']");
public static  final By PAGE_TEXT =By.xpath("//h2[contains(text(), 'Customer Service Portal')]");
public static final By ERROR_MESSAGE = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat']");

}
