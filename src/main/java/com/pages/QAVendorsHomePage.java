package com.pages;

import com.controls.ObjectsControl;
import com.utils.UtilityClass;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class QAVendorsHomePage extends ObjectsControl {
    WebDriver driver;
    WebDriverWait wait;
    Scenario scenario;

    @FindBy(css = "a.btn_get_listed")  WebElement getListedBtn;
    @FindBy(css = "input.member_search.form-control.input-sm.tt-input")  WebElement keywordSearchTextField;
    @FindBy(css = "input.btn-sm.btn_search")  WebElement keywordSearchBtn;
    @FindBy(xpath = "//a[text()='HOME']")  WebElement homeHeader;
    @FindBy(xpath = "//span[text()=' ABOUT US']")  WebElement aboutusHeader;
    @FindBy(xpath = "//a[text()='Who We Are']")  WebElement whoWeAreSubHeader;
    @FindBy(xpath = "//a[text()='How to choose the right QA Vendor']")  WebElement rightVendorSubHeader;
    @FindBy(xpath = "//a[text()='HOW IT WORKS']")  WebElement howItWorksHeader;
    @FindBy(xpath = "//a[text()='QA VENDORS']")  WebElement qaVendorsHeader;
    @FindBy(xpath = "//a[text()='GET MATCHED']")  WebElement getMatchedHeader;
    @FindBy(xpath = "//span[contains(text(),'RESOURCES')]")  WebElement resourcesHeader;
    @FindBy(xpath = "//a[text()='Our Blog']")  WebElement ourBlogSubHeader;
    @FindBy(xpath = "//a[text()='Articles']")  WebElement articlesSubHeader;
    @FindBy(xpath = "//a[text()='Deals & Promotions']")  WebElement dealsSubHeader;
    @FindBy(xpath = "//a[text()='Photos']")  WebElement photosSubHeader;
    @FindBy(xpath = "//a[text()='Reviews']")  WebElement reviewsSubHeader;
    @FindBy(xpath = "//a[text()='QA Tools']")  WebElement qatoolsSubHeader;
    @FindBy(xpath = "//a[text()='Videos']")  WebElement videosSubHeader;
    @FindBy(xpath = "//a[text()='Jobs']")  WebElement jobsSubHeader;
    @FindBy(xpath = "//a[text()='Events']")  WebElement eventsSubHeader;
    @FindBy(xpath = "//a[text()='JOIN TODAY']")  WebElement joinTodayHeader;
    @FindBy(xpath = "//a[text()='CONTACT US']")  WebElement contactUsHeader;

    public QAVendorsHomePage(WebDriver driver,Scenario sc) {
        super(driver, sc);
        this.driver = driver;
        this.scenario = sc;
        PageFactory.initElements(driver, this);
    }

    public void clickGetListedButton() throws Exception {
        click(getListedBtn);
    }

    public void clickHomeHeader() throws Exception {
        click(homeHeader);
    }

    public void clickAboutUsSubHeaders(List<String> list) throws Exception {
        for (String subHeaderName: list) {
            mouseHoverElement(aboutusHeader);
            if(subHeaderName.contains("Who We Are")){
                click(whoWeAreSubHeader);
                verifyCurrentURL(titleProp.getProperty("who_we_are.pageURL"));
            }
            if(subHeaderName.contains("How to choose the right QA Vendor")){
                click(rightVendorSubHeader);
                verifyCurrentURL(titleProp.getProperty("right_qa_vendor.pageURL"));
            }
            scenario.attach(UtilityClass.takeByteScreenshot(driver), "image/png", subHeaderName);
        }
    }

    public void howWorksHeader() throws Exception {
        click(howItWorksHeader);
    }

    public void qaVendorsHeader() throws Exception {
        click(qaVendorsHeader);
    }

    public void getMatchedHeader() throws Exception {
        click(getMatchedHeader);
    }

    public void clickResourcesSubHeaders(List<String> list) throws Exception {
        for (String subHeaderName: list) {
            mouseHoverElement(resourcesHeader);
            if(subHeaderName.contains("Our Blog")){
                click(ourBlogSubHeader);
                verifyPageTitle(titleProp.getProperty("our_blog.pageTitle"));
            }
            if(subHeaderName.contains("Articles")){
                click(articlesSubHeader);
                verifyPageTitle(titleProp.getProperty("articles.pageTitle"));
            }
            if(subHeaderName.contains("Deals & Promotions")){
                click(dealsSubHeader);
                verifyPageTitle(titleProp.getProperty("deals_promotions.pageTitle"));
            }
            if(subHeaderName.contains("Photos")){
                click(photosSubHeader);
                verifyPageTitle(titleProp.getProperty("photos.pageTitle"));
            }
            if(subHeaderName.contains("Reviews")){
                click(reviewsSubHeader);
                verifyPageTitle(titleProp.getProperty("reviews.pageTitle"));
            }
            if(subHeaderName.contains("QA Tools")){
                click(qatoolsSubHeader);
                verifyPageTitle(titleProp.getProperty("qatools.pageTitle"));
            }
            if(subHeaderName.contains("Videos")){
                click(videosSubHeader);
                verifyPageTitle(titleProp.getProperty("videos.pageTitle"));
            }
            if(subHeaderName.contains("Jobs")){
                click(jobsSubHeader);
                verifyPageTitle(titleProp.getProperty("jobs.pageTitle"));
            }
            if(subHeaderName.contains("Events")){
                click(eventsSubHeader);
                verifyPageTitle(titleProp.getProperty("events.pageTitle"));
            }
            scenario.attach(UtilityClass.takeByteScreenshot(driver), "image/png", subHeaderName);
        }
    }

    public void clickJoinUsHeader() throws Exception {
        click(joinTodayHeader);
    }

    public void clickContactUsHeader() throws Exception {
        click(contactUsHeader);
    }

    public void enterKeywordSearch(String keyword){
        clearTypeKeys(keywordSearchTextField, keyword);
    }

    public void pressEnterKey() throws Exception {
        click(keywordSearchBtn);
//        pressKey(Keys.ENTER);
    }

}
