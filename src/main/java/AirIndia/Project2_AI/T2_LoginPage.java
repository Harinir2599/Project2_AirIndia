package AirIndia.Project2_AI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T2_LoginPage {
	WebDriver driver;
	
	@FindBy(id="username")
	WebElement un;
	
	@FindBy(xpath="//button[normalize-space()='Sign In with OTP']")
	WebElement signin_button;
	@FindBy(id="code")
	WebElement otp;
	
	@FindBy(xpath="//button[@name='action']")
	WebElement submit_button;
	public void un_method() {
		un.sendKeys("9025371260");
	}
	public void signin_button_method() {
		signin_button.click();
	}
	public void otp_method() throws InterruptedException {
		
		otp.click();
		Thread.sleep(3000);
	}
public void submit_method() throws InterruptedException  {
	Thread.sleep(1000);
		submit_button.click();
		
	}
	public T2_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
