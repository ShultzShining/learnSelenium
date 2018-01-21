package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewCustomer_IPTV {
	@BeforeTest
	public void createTestData() {
		System.out.println("Test Data created");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("--------IPTV Testing-------");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("--------IPTV Testing-------");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before IPTV Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after IPTV Method");
	}
	@BeforeSuite
	public void introduction() {
		System.out.println("starting test");
	}
	@AfterSuite
	public void closure() {
		System.out.println("test finished");
	}
	@Parameters({"url"})
  @Test(groups= {"smoke"})
  public void login_SM_iptv(String u) {
	  System.out.println("login successful through simple---IPTV" +u);
  }
  @Test
  public void validate_workflow_iptv() {
	  System.out.println("workflow validated---IPTV");
  }
  @Test
  public void complete_customer_iptv() {
	  System.out.println("customer completed---IPTVL");
  }
  @AfterTest
	public void closeBrowser() {
		System.out.println("browser closed");
	}
  
}
