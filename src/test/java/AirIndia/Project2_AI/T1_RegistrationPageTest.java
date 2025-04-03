package AirIndia.Project2_AI;

import org.testng.annotations.Test;

public class T1_RegistrationPageTest extends BaseTest{
	@Test
	public void testcase() {
		T1_RegisterationPage rp = new T1_RegisterationPage(driver);
		rp.sigin_method();
		rp.signup_method();
		rp.title_method();
		rp.un_method();
		rp.ln_method();
		rp.dob_method();
		rp.email_method();
		rp.c_email_method();
		rp.ph_no_method();
		rp.c_ph_no_method();
		rp.check_box_method();
		rp.submit_method(driver);
		
	}

}
