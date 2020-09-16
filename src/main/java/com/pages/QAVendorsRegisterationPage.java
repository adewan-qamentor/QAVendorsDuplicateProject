package com.pages;

import com.controls.ObjectsControl;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class QAVendorsRegisterationPage extends ObjectsControl {
    WebDriver driver;
    WebDriverWait wait;
    Scenario scenario;

    @FindBy(css = "input[name='email']")   WebElement emailTextField;
    @FindBy(css = "input[name='email_confirm']")   WebElement confirmEmailTextField;
    @FindBy(css = "input[name='password']")   WebElement passwordTextField;
    @FindBy(css = "input[name='password_confirm']")   WebElement confirmPasswordTextField;
    @FindBy(css = "iframe[src*='google.com/recaptcha/'][name*='a-']")   WebElement captchaFrameElement;
    @FindBy(css = "span[id='recaptcha-anchor']")   WebElement captchaCheckbox;
    @FindBy(css = "input[value='Create My Profile']")   WebElement createProfileBtn;
    @FindBy(css = "div[class='icon success animate']")   WebElement successAnimation;
    @FindBy(xpath = "//h2[contains(text(),'Congratulations')]")   WebElement congratsMessage;
    @FindBy(xpath = "//a[contains(@class,'btn-success') and contains(text(),'Continue')]")   WebElement continueVendorBtn;


    public QAVendorsRegisterationPage(WebDriver driver,Scenario sc) {
        super(driver, sc);
        this.driver = driver;
        this.scenario = sc;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email)  {
        clearTypeKeys(emailTextField,email);
        clearTypeKeys(confirmEmailTextField,email);
    }

    public void enterPassword(String pwd){
        clearTypeKeys(passwordTextField,pwd);
        clearTypeKeys(confirmPasswordTextField,pwd);
    }

    public void clickCaptchaCheckbox() throws Exception {
//        switchToFrame(captchaFrameElement);
//        int xaxis = captchaFrameElement.getLocation().x;
//        int yaxis=captchaFrameElement.getLocation().y;
//
//        int width = captchaFrameElement.getSize().width;
//        int height= captchaFrameElement.getSize().height;
//        Robot r=new Robot();
//        r.mouseMove(xaxis+width/2, yaxis+height/2);
//        r.mousePress(KeyEvent.BUTTON1_MASK);//click function
//        r.mouseRelease(KeyEvent.BUTTON1_MASK);
        scrollToElement(captchaFrameElement);
        mouseHoverElement(captchaFrameElement);
        actionClick(captchaFrameElement);
    }

    public void submitProfileBtn() throws Exception {
//        returnFromFrame();
        click(createProfileBtn);
    }

    public void verifyCongratsPopup(){
        isPresentAndVisible(successAnimation);
        isPresentAndVisible(congratsMessage);
    }

    public void clickContinueVendorsBtn() throws Exception {
        click(continueVendorBtn);
    }
}
