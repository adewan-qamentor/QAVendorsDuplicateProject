package com.controls;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.UtilityClass;

import io.cucumber.java.Scenario;

public class ObjectsControl {
	public WebDriver webDriver;
	public WebDriverWait wait;
	Long maxWaitTimeToFindElement = 45L;
	String screenshot;
	Scenario scenario;
	JavascriptExecutor js;
	Actions act;
	public Properties titleProp;
	
	public ObjectsControl(WebDriver webDriver, Scenario scenario){
		this.webDriver = webDriver;
		this.scenario = scenario;
		wait = new WebDriverWait(webDriver, maxWaitTimeToFindElement);
		js = (JavascriptExecutor) webDriver;
		act=new Actions(webDriver);
		readProperties();
	}

	private void readProperties()  {
		FileReader reader= null;
		try {
			System.out.println();
			reader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\pageTitle.properties");
		titleProp=new Properties();
		titleProp.load(reader);
		} catch (IOException e) {
			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
	}

	protected boolean verifyPageTitle(String expectedTitle){
		String message = "Waiting for the title " + expectedTitle
				+ ", will wait by " + maxWaitTimeToFindElement
				+ " seconds";

		boolean verifyFlag = false;
		try {
			System.out.println(message);
			Thread.sleep(2000);
			verifyFlag = wait.until(ExpectedConditions.titleContains(expectedTitle));
			scenario.log(expectedTitle +" verified");
		} catch (Exception e) {
			verifyFlag = false;

			takeScreenshot();
//			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
			throw new RuntimeException("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return verifyFlag;
	}

	protected boolean verifyCurrentURL(String expectedURL){
		String message = "Waiting for the URL " + expectedURL
				+ ", will wait by " + maxWaitTimeToFindElement
				+ " seconds";

		boolean verifyFlag = false;
		try {
			System.out.println(message);
			Thread.sleep(2000);
			verifyFlag = wait.until(ExpectedConditions.urlToBe(expectedURL));
			scenario.log(expectedURL +" verified");
		} catch (Exception e) {
			verifyFlag = false;

			takeScreenshot();
//			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
			throw new RuntimeException("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return verifyFlag;
	}

	protected void navigateTo(String url) {
		webDriver.get(url);
		scenario.log("Navigated to "+url);
	}

	protected String getCssValue(WebElement element, String attrName){
		String cssValue=null;
		element= waitAndFindElementByVisibility(element);
		cssValue=element.getCssValue(attrName);
		return cssValue;
	}



	protected void typeKeys(WebElement element, String value) {
		element= waitAndFindElementByVisibility(element);
		element.sendKeys(Keys.END);
		element.sendKeys(value);

	}

	protected void clearTypeKeys(WebElement element, String value) {
		element= waitAndFindElementByVisibility(element);
		element.sendKeys(Keys.END);
		element.clear();
		element.sendKeys(value);

	}

	protected void click(WebElement element) throws Exception {
		element= waitAndFindElementByVisibility(element);
		highLightElement(element);
//		takeScreenshot();
		element.click();
	}

	protected void submit(WebElement element) {
		element=waitAndFindElementByVisibility(element);
		element.submit();
	}

	protected String getText(WebElement element) {
		String text = null;
		element= waitAndFindElementByVisibility(element);
		text = element.getText();
		return text;
	}
//	protected List listDetailsForText(WebElement element) {
//		String text = null;
//		List allElementDetails= waitForListElements(element);
//		return allElementDetails;
//	}
	protected Boolean isSelected(WebElement element) {
		Boolean flag = true;
		element= waitAndFindElementByVisibility(element);
		flag = element.isSelected();
		return flag;
	}

	protected boolean isVisible(WebElement element) {
		return element.isEnabled();
	}


	protected List<WebElement> verifyNumberOfElementLessThen(By by,int count) {
		String message = "Searching elements list " + by.toString()
		+ " to be less than "+count+", will wait by " + maxWaitTimeToFindElement
		+ " seconds";
		List<WebElement> elementList = null;
		try {
			System.out.println(message);
			elementList = wait.until(ExpectedConditions.numberOfElementsToBeLessThan(by,count));
		} catch (Exception e) {
			elementList = null;
			takeScreenshot();
			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return elementList;


	}
	//Niharika
	protected List<WebElement> verifyNumberOfElementsMoreThan(By by, int number) {
		String message = "Searching elements list " + by.toString()
		+ " to be greater than "+number+", will wait by " + maxWaitTimeToFindElement
		+ " seconds";
		List<WebElement> elementList = null;

		try {
			System.out.println(message);
			elementList = wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by,number));
		} catch (Exception e) {
			elementList = null;
			takeScreenshot();
			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return elementList;
	}

	protected List<WebElement> verifyNumberOfElementsToBe(By by, int number) {
		String message = "Searching elements list " + by.toString()
		+ " to be greater than "+number+", will wait by " + maxWaitTimeToFindElement
		+ " seconds";
	
		List<WebElement> elementList = null;
		try {
			System.out.println(message);
			elementList = wait.until(ExpectedConditions.numberOfElementsToBe(by,number));
		} catch (Exception e) {
			elementList = null;
			takeScreenshot();
			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return elementList;
	}


	protected List<WebElement> waitForListElements(List<WebElement> elements) {
		String message = "Searching elements list " + elements.get(0).toString()
		+ "  will wait by " + maxWaitTimeToFindElement
		+ " seconds";
		List<WebElement> elementList = null;
		try {
			System.out.println(message);
			elementList = wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		} catch (Exception e) {
			elementList = null;
			takeScreenshot();
			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return elementList;
	}


	protected boolean verifyElementByText(WebElement element, String textValue){
		String message = "Waiting element " + element.toString()
		+ " for its text "+textValue+", will wait by " + maxWaitTimeToFindElement
		+ " seconds";
		boolean verifyFlag = false;
		try {
			System.out.println(message);

			verifyFlag = wait.until(ExpectedConditions.textToBePresentInElement(element, textValue));
		} catch (Exception e) {
			verifyFlag = false;
			takeScreenshot();
			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return verifyFlag;
	}

	protected boolean verifyElementInvisibility(WebElement element){
		String message = "Waiting for element's invisibility " + element.toString()
		+ "  will wait by " + maxWaitTimeToFindElement
		+ " seconds";
		boolean verifyFlag = false;
		try {
			System.out.println(message);

			verifyFlag = wait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			verifyFlag = false;
			takeScreenshot();
			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return verifyFlag;
	}

	protected boolean verifyElementByTextMatches(WebElement element , String textValue){
		String message = "Waiting element " + element.toString()
		+ " for its text "+textValue+", will wait by " + maxWaitTimeToFindElement
		+ " seconds";
		boolean verifyFlag = false;
		try {
			System.out.println(message);

			verifyFlag = wait.until(ExpectedConditions.textToBePresentInElementValue(element, textValue));
		} catch (Exception e) {
			verifyFlag = false;
			takeScreenshot();
			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return verifyFlag;
	}

	protected boolean verifyElementByAttribute(WebElement element, String attributeName, String attrValue){
		String message = "Waiting element " + element.toString()
		+ " for its attribute "+attributeName+", will wait by " + maxWaitTimeToFindElement
		+ " seconds";
		boolean verifyFlag = false;
		try {
			System.out.println(message);

			verifyFlag = wait.until(ExpectedConditions.attributeToBe(element, attributeName, attrValue));
		} catch (Exception e) {
			verifyFlag = false;
			takeScreenshot();
			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return verifyFlag;
	}



	protected WebElement waitAndFindElementByVisibility(WebElement element) {
		String message = "Searching element " + element.toString()
		+ " for presence, will wait by " + maxWaitTimeToFindElement
		+ " seconds";

		try {
			System.out.println(message);
			element= wait.until(ExpectedConditions.visibilityOf(element));
			highLightElement(element);
		} catch (Exception e) {
			takeScreenshot();
//			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
//			e.printStackTrace();
			throw new RuntimeException("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return element;
	}

	protected WebElement waitForAndFindElementAfterEnable(WebElement element) {
		String message = "Searching element " + element.toString()
		+ " for presence, will wait by " + maxWaitTimeToFindElement
		+ " seconds";


		try {
			System.out.println(message);
			element= wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			takeScreenshot();
//			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
//			e.printStackTrace();
			throw new RuntimeException("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return element;
	}

	protected String takeScreenshot() {

		screenshot = System.getProperty("user.dir")+"/screenshots/screenshots"+System.currentTimeMillis() + ".png";
		File srcFile = ((TakesScreenshot) webDriver)
				.getScreenshotAs(OutputType.FILE);
		System.out.println("Failed and Screen capture saved at location "
				+ screenshot);
		try {
			FileHandler.copy(srcFile, new File(screenshot));
			scenario.attach(UtilityClass.takeByteScreenshot(webDriver), "image/png", scenario.getName()+ (int)(Math.random()*((1000-1)+1))+1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return screenshot;
	}

	protected void selectDropDownVisibleText(WebElement element, String text) {
		element= waitAndFindElementByVisibility(element);
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText(text);


	}

	protected void dragAndDrop(WebElement drag,WebElement drop) {
		act.dragAndDrop(drag, drop).build().perform();

	}

	protected boolean verifyElementClicked(WebElement element) {
		String message = "Verifying element clicked " + element.toString()
		+ " or need to be clicked again";

		boolean present = true;
		try {
			System.out.println(message);
			while(!element.isDisplayed()) {
				element.click();
			}
		} catch (Exception e) {
			present = false;
			takeScreenshot();
//			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
//			e.printStackTrace();
			throw new RuntimeException("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return present;
	}
	
	protected WebElement isPresentAndVisible(WebElement element) {
		String message = "Waiting for the visibility of element " + element.toString()
		+", will wait by " + maxWaitTimeToFindElement
		+ " seconds";
		try {
			System.out.println(message);
			element = wait.until(ExpectedConditions.visibilityOf(element));
			scenario.log(element.toString()+" visible");
		} catch (Exception e) {
			takeScreenshot();
//			System.out.println("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
			throw new RuntimeException("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
		return element;
	}
	
	
	private void highLightElement(WebElement element) throws InterruptedException{
//		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');", element);
		Thread.sleep(150);
		js.executeScript("arguments[0].style.border=''", element, "");
		//Thread.sleep(2000);
	}

	protected void scrollToElement(WebElement element){
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void switchToFrame(WebElement element){
		String message = "Waiting to switch to frame"
				+ ", will wait by " + maxWaitTimeToFindElement
				+ " seconds";
		try {
			System.out.println(message);
			Thread.sleep(2000);
			this.webDriver = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

		} catch (Exception e) {
			takeScreenshot();
			throw new RuntimeException("Exception caused by "+e.getClass().getName()+" and message is "+e.getMessage());
		}
	}

	protected void returnFromFrame(){
		this.webDriver = webDriver.switchTo().parentFrame();
	}

	protected void actionClick(WebElement element){
		act.click(element).build().perform();
	}

	protected void mouseHoverElement(WebElement element) throws InterruptedException {
		highLightElement(element);
		act.moveToElement(element).build().perform();
	}

	protected void pressKey(Keys key){
		act.keyDown(key).keyUp(key).build().perform();
	}
}
