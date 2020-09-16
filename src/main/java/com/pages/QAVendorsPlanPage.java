package com.pages;

import com.controls.ObjectsControl;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QAVendorsPlanPage extends ObjectsControl {
    WebDriver driver;
    WebDriverWait wait;
    Scenario scenario;

    @FindBy(xpath = "//li[@class='col-md-4' and ./span[text()=' Silver']]/ul//a")  WebElement silverListingBtn;


    public QAVendorsPlanPage(WebDriver driver,Scenario sc) {
        super(driver, sc);
        this.driver = driver;
        this.scenario = sc;
        PageFactory.initElements(driver, this);
    }

    public void clickSilverListingButton() throws Exception {
        scrollToElement(silverListingBtn);
        click(silverListingBtn);
    }


}
