package AirIndia.Project2_AI;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class T1_RegisterationPage {
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='signIn']")
	WebElement signin;
	
	
	@FindBy(xpath="//button[@id='create-account-button']")
	WebElement signup;
	
	@FindBy(css=".mat-form-field-flex.ng-tns-c39-0")
	WebElement title;
	@FindBy(id="mat-option-4")
	WebElement miss_option;
	@FindBy(id="userfirstNameInput")
	WebElement un;
	@FindBy(id="userLastName")
	WebElement ln;
	@FindBy(id="date_of_birth")
	WebElement dob;
	@FindBy(xpath="//select[@title='Select year']//option[@value='1999']")
	WebElement year;
	@FindBy(xpath="//select[@title='Select month']//option[@value='7']")
	WebElement month;
	@FindBy(xpath="//div[contains(text(),'25')]")
	WebElement day;
	@FindBy(id="contactEmail")
	WebElement email;
	@FindBy(id="confirmEmail")
	WebElement c_email;
	@FindBy(id="phoneNo")
	WebElement ph_no;
	@FindBy(id="confirmPhoneNo")
	WebElement c_ph_no;
	@FindBy(id="promotionCheck")
	WebElement check_box;
	@FindBy(id="submit-button")
	WebElement submit;
	
	public void sigin_method() {
	signin.click();
	}
	public void signup_method() {
		signup.click();
		}
	public void title_method() {
		title.click();
		miss_option.click();
		}
	public void un_method() {
		un.sendKeys("Harini");
		}
	public void ln_method() {
		ln.sendKeys("Ravi");
		}
	public void dob_method() {
		dob.click();
		year.click();
		month.click();
		day.click();
		}
	public void email_method() {
		email.sendKeys("hariniravi25.hr@gmail.com");
		}
	public void c_email_method() {
		c_email.sendKeys("hariniravi25.hr@gmail.com");
		}
	public void ph_no_method() {
		ph_no.sendKeys("9444863553");
		}
	public void c_ph_no_method() {
		c_ph_no.sendKeys("9444863553");
		}
	public void check_box_method() {
		check_box.click();
		}
	public void submit_method(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		submit.click();
		}
	
	public T1_RegisterationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

}
