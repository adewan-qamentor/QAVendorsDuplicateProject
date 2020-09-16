package com.pages;

import com.controls.ObjectsControl;
import com.utils.UtilityClass;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeywordSearchResultsPage extends ObjectsControl {
    WebDriver driver;
    WebDriverWait wait;
    Scenario scenario;
    int firstRecordDisplayed;
    int lastRecordDisplayed;
    int totalRecordsDisplayed;

    @FindBy(css = "div.col-sm-4.nopad.bmargin")  WebElement recordNNumberLabel;
    @FindBy(css = "a[rel='next']")  WebElement paginationNextButton;
    @FindBy(css = "a[rel='prev']")  WebElement paginationPreviousButton;

    public KeywordSearchResultsPage(WebDriver driver,Scenario sc) {
        super(driver, sc);
        this.driver = driver;
        this.scenario = sc;
        PageFactory.initElements(driver, this);
    }

    public boolean displayRecordsWithTotalOnPage() {
        isPresentAndVisible(recordNNumberLabel);
        boolean verifyFlag = numberLabelDisplayedCorrectly(recordNNumberLabel.getText());
//        System.out.println("aaaaaaaaaaaaaa "+verifyFlag);
        return verifyFlag;
    }

    public boolean numberLabelDisplayedCorrectly(String label){
        boolean verifyFlag = false;
        if(label.contains("Showing") && label.contains("-") && label.contains("of") && label.contains("Results"))
            verifyFlag = true;

        return verifyFlag;
    }

    public void splitAndGetRecordDisplayed(){
        String label = recordNNumberLabel.getText();
        label = label.replaceFirst("Showing ","");
        int whiteSpaceIndex = label.indexOf(" ");
        String firstRecord = label.substring(0,whiteSpaceIndex);
        firstRecordDisplayed = Integer.parseInt(firstRecord);
        label = label.replaceFirst(firstRecord,"").trim();
        label = label.replaceFirst("-","").trim();
        whiteSpaceIndex = label.indexOf(" ");
        String lastRecord = label.substring(0,whiteSpaceIndex);
        lastRecordDisplayed = Integer.parseInt(lastRecord);
        label = label.replaceFirst(lastRecord,"").trim();
        label = label.replaceFirst("of","").trim();
        whiteSpaceIndex = label.indexOf(" ");
        String totalRecords = label.substring(0,whiteSpaceIndex);
        totalRecordsDisplayed = Integer.parseInt(totalRecords);
    }

    public void clickPaginationNextBtn() throws Exception {
        splitAndGetRecordDisplayed();
        while(lastRecordDisplayed<totalRecordsDisplayed){
            scrollToElement(paginationNextButton);
            click(paginationNextButton);
            verifyPageTitle(titleProp.getProperty("vendorsList.pageTitle"));
            scenario.attach(UtilityClass.takeByteScreenshot(driver), "image/png", new Integer(lastRecordDisplayed).toString());
            splitAndGetRecordDisplayed();
            Thread.sleep(3000);
        }
    }
    public void clickPaginationPrevBtn() throws Exception {
        while(firstRecordDisplayed >1){
            scrollToElement(paginationPreviousButton);
            click(paginationPreviousButton);
            verifyPageTitle(titleProp.getProperty("vendorsList.pageTitle"));
            splitAndGetRecordDisplayed();
            Thread.sleep(3000);
        }
    }

}
