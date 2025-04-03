package AirIndia.Project2_AI;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T4_OneWayTest extends BaseTest {
	@Test
	public void testcase() {
		T4_Oneway t = new T4_Oneway(driver);
		t.accept_cookies();
		t.clickOneWayTripRadioButton();
		t.source_method();
		t.dep_date_method();
		t.date_method();
		t.des_method();
		t.search_method();
		
	}

}
