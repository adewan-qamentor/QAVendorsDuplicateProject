package com.stepDefinition;


import com.driver.DriverInstance;
import com.pages.KeywordSearchResultsPage;
import com.pages.QAVendorsHomePage;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaginationAndKeywordSteps {

    WebDriver driver;
    WebDriverWait wait;
    static DriverInstance instance;
    QAVendorsHomePage hp;
    KeywordSearchResultsPage kp;
    {
        instance = DriverInstance.getInstance();
        driver = instance.getDriver();
        hp = new QAVendorsHomePage(driver,CucumberHooks.scenario);
        kp = new KeywordSearchResultsPage(driver,CucumberHooks.scenario);
    }

    @When("user enters {string} in the keyword search box")
    public void enterKeywordSearch(String keyword) {
        hp.enterKeywordSearch(keyword);
    }

    @When("user presses Enter key")
    public void userPressesEnterKey() throws Exception {
        hp.pressEnterKey();
    }

    @Then("page should display number of records shown on page with total number of records")
    public void displayRecordsOnPage() {
    boolean verifyFlag = kp.displayRecordsWithTotalOnPage();
    Assert.assertTrue("records with total number are not displayed correctly on page", verifyFlag);
    }

    @When("user clicks on next button in pagination till last record is shown and take screenshot for every page")
    public void clickPaginationNextButton() throws Exception {
        kp.clickPaginationNextBtn();
    }

    @When("user clicks on previous button in pagination till first record is shown")
    public void clickPaginationPreviousButton() throws Exception {
        kp.clickPaginationPrevBtn();
    }

}
