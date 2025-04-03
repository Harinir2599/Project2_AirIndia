package AirIndia.Project2_AI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;



@Listeners(Testng_listener.class)
public class BaseTest extends Testng_listener{
	
	 //WebDriver driver;
	    @BeforeMethod
	    public void launch(){

	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.airindia.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.findElement(By.xpath("//div[@class='onetrust-banner-options']")).click();



	    }
	    @AfterMethod
	    public void quit() throws InterruptedException {
	        Thread.sleep(3000);
	        //driver.quit();
	    }
	}


