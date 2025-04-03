package AirIndia.Project2_AI;

import org.testng.annotations.Test;

public class T2_LoginTest extends BaseTest{
	@Test
	public void testcase() throws InterruptedException {
		T1_RegisterationPage rp = new T1_RegisterationPage(driver);
		rp.sigin_method();
		T2_LoginPage lp = new T2_LoginPage(driver);
		lp.un_method();
		lp.signin_button_method();
		lp.otp_method();
		lp.submit_method();
	}

}
