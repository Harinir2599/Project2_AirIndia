package AirIndia.Project2_AI;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T5_RoundTrip {
	WebDriver driver;
	JavascriptExecutor js;
	
	@FindBy(xpath="(//input[@id='dpToDate'])[1]")
	WebElement returndate;
	
	@FindBy(xpath="//div[@aria-label='Sunday, March 23, 2025']")
	WebElement retrundate_calendar;
	public void clickonroundtrip() {
		String script = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group').shadowRoot.querySelector('#radio1')";
	    WebElement radioButton = (WebElement) js.executeScript(script);
	    radioButton.click();

	}
	public void return_method() {
		returndate.click();
		retrundate_calendar.click();
	}
	
	public T5_RoundTrip(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}


}
