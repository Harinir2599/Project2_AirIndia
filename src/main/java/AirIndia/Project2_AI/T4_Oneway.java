package AirIndia.Project2_AI;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T4_Oneway {
WebDriver driver;
JavascriptExecutor js;

@FindBy(xpath = "(//button[.='Accept All'])[1]")
WebElement acceptCookies;

@FindBy(xpath="(//input[@id='dpFromDate'])[1]")
WebElement dep_date;

@FindBy(xpath="//div[@aria-label='Saturday, March 15, 2025']")
WebElement date;

public void accept_cookies() {
	acceptCookies.click();
}
public void clickOneWayTripRadioButton() {
    String script = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group').shadowRoot.querySelector('#radio0')";
    WebElement radioButton = (WebElement) js.executeScript(script);
    radioButton.click();
}
public void source_method() {
    String script = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-origin-dest-search.valid-input > ai-origin-destination').shadowRoot.querySelector('#originAutoComplete').shadowRoot.querySelector('div > div > div.ai-input-wrap > input')";
    WebElement source = (WebElement) js.executeScript(script);
    source.click();
    source.sendKeys(Keys.ENTER);
}
public void des_method() {
    String script = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-origin-dest-search.valid-input > ai-origin-destination').shadowRoot.querySelector('#destinationAutoComplete').shadowRoot.querySelector('div > div > div.ai-input-wrap > input')";
    WebElement des = (WebElement) js.executeScript(script);
    des.click();
    des.sendKeys(Keys.ENTER);
}

public void search_method() {
    String script = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-button > ai-button > button')";
    WebElement search = (WebElement) js.executeScript(script);
    search.click();
    
}


public void dep_date_method() {
	dep_date.click();
}

public void date_method() {
	date.click();
}

public T4_Oneway (WebDriver driver) {
	this.driver=driver;
	js = (JavascriptExecutor) driver;
	PageFactory.initElements(driver, this);
}
}


