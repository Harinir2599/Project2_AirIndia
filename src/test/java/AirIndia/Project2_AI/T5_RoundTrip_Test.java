package AirIndia.Project2_AI;

import org.testng.annotations.Test;

public class T5_RoundTrip_Test extends BaseTest {
	@Test
	public void testcase() {
		T4_Oneway t = new T4_Oneway(driver);
		t.accept_cookies();
		
		T5_RoundTrip rt = new T5_RoundTrip(driver);
		rt.clickonroundtrip();
		
		
		t.source_method();
		t.dep_date_method();
		t.date_method();
		t.des_method();
		rt.return_method();
		t.search_method();
	}

}
