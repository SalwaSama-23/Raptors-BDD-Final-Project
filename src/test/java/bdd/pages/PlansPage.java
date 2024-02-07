package bdd.pages;

import org.openqa.selenium.By;

public class PlansPage {
    public static final By PLANS_BTN = By.linkText("Plans");
    public static final By ROW_NUMBER =By.xpath("//tbody[@class='css-0']//tr");
    public static final By CREATE_DATE =By.xpath("//tbody//tr[1]//td[4]");
    public static final By EXPIRE_DATE =By.xpath("//tbody//tr[1]//td[5]");
}
