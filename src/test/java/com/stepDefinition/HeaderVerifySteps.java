package com.stepDefinition;

import com.driver.DriverInstance;
import com.pages.CommonPage;
import com.pages.QAVendorsHomePage;

import com.utils.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class HeaderVerifySteps {
    WebDriver driver;
    WebDriverWait wait;
    static DriverInstance instance;
    CommonPage cp;
    QAVendorsHomePage hp;

    {
        instance = DriverInstance.getInstance();
        driver = instance.getDriver();
        cp = new CommonPage(driver, CucumberHooks.scenario);
        hp = new QAVendorsHomePage(driver,CucumberHooks.scenario);
    }

    @When("user clicks on {string} Header")
    public void clickHeader(String headerName) throws Exception {
        if(headerName.equals("HOME"))
            hp.clickHomeHeader();
        if(headerName.equals("HOW IT WORKS"))
            hp.howWorksHeader();
        if(headerName.equals("QA VENDORS"))
            hp.qaVendorsHeader();
        if(headerName.equals("GET MATCHED"))
            hp.getMatchedHeader();
        if(headerName.equals("JOIN TODAY"))
            hp.clickJoinUsHeader();
        if(headerName.equals("CONTACT US"))
            hp.clickContactUsHeader();
    }

    @Then("user embed the {string} screenshot in the report")
    public void embedScreenshot(String name) {
        CucumberHooks.scenario.attach(UtilityClass.takeByteScreenshot(driver), "image/png", name);
    }

    @When("user clicks on below sub-headers and verify their respective page with screenshot in {string} header")
    public void verifySubHeaders(String mainHeader, DataTable dataTable) throws Exception {
        List<String> dataList = dataTable.asList(String.class);
        if(mainHeader.equals("ABOUT US"))
            hp.clickAboutUsSubHeaders(dataList);
        if(mainHeader.contains("RESOURCES"))
            hp.clickResourcesSubHeaders(dataList);
    }
}
