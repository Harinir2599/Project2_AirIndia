package AirIndia.Project2_AI;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Testng_listener implements ITestListener {
    public static WebDriver driver;
    @Override
    public void onTestSuccess(ITestResult result) {
    	    String testClassName = result.getTestClass().getRealClass().getSimpleName();
            TakesScreenshot t = (TakesScreenshot) driver;
            File f1 = t.getScreenshotAs(OutputType.FILE);
            File f2 = new File("C:\\Users\\1816775.INDIA\\eclipse-workspace\\Project2_AI\\Screenshot\\"+testClassName+"_Pass.png");
            try {
                FileHandler.copy(f1, f2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Reporter.log("TestCase is passed");  
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	    String testClassName = result.getTestClass().getRealClass().getSimpleName();
            TakesScreenshot t = (TakesScreenshot) driver;
            File f1 = t.getScreenshotAs(OutputType.FILE);
            File f2 = new File("C:\\Users\\1816775.INDIA\\eclipse-workspace\\Project2_AI\\Screenshot\\"+testClassName+"_Fail.png");
            try {
                FileHandler.copy(f1, f2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Reporter.log("Testcase is failed");
       
    }

    @Override
    public void onFinish(ITestContext context) {
      
       
       
    }
}
