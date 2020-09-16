package com.stepDefinition;

import com.driver.DriverInstance;
import com.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SilverUserRegistrationSteps {
    WebDriver driver;
    WebDriverWait wait;
    static DriverInstance instance;
    CommonPage cp;
    QAVendorsHomePage hp;
    QAVendorsPlanPage pp;
    QAVendorsRegisterationPage rp;

    {
        instance = DriverInstance.getInstance();
        driver = instance.getDriver();
        cp = new CommonPage(driver, CucumberHooks.scenario);
        hp = new QAVendorsHomePage(driver,CucumberHooks.scenario);
        pp = new QAVendorsPlanPage(driver,CucumberHooks.scenario);
        rp = new QAVendorsRegisterationPage(driver,CucumberHooks.scenario);
    }

    @Given("user navigates to the QAVendors App")
    public void openQAVendorsApp() {
        cp.navigateToQAVendors();
    }

    @Then("user verify the title {string} in the app")
    public void verifyPageTitle(String title) {
        cp.pageVerify(title);
    }

    @When("user clicks on {string} button")
    public void buttonClick(String btnName) throws Exception {
        if(btnName.contains("Get Listed Today"))
            hp.clickGetListedButton();
        if(btnName.contains("silver plan Create Listing"))
            pp.clickSilverListingButton();
        if(btnName.contains("Create My Profile"))
            rp.submitProfileBtn();
        if(btnName.contains("Continue to Vendor now"))
            rp.clickContinueVendorsBtn();
    }

    @When("user enters mail {string} and confirm {string} for the plan")
    public void userEnterEmail(String email, String confirmEmail)  {
    rp.enterEmail(email);
    }

    @When("user enters password {string} and confirm {string} for the plan")
    public void userEnterPassword(String pwd, String confirmPwd) {
    rp.enterPassword(pwd);
    }

    @When("user clicks on captcha checkbox")
    public void checkCaptchaBox() throws Exception {
        rp.clickCaptchaCheckbox();
    }

    @Then("Congratulations message should successfully appear in a popup")
    public void verifyCongrats() {
        rp.verifyCongratsPopup();
    }

    @Then("Dashboard page should be displayed")
    public void verifyDashboardPage() {

    }

    @When("user closes chat window pop up if it is opened")
    public void closeChatWindow() {

    }


}
