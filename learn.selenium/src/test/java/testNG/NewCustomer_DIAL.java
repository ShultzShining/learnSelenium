package testNG;

import org.testng.annotations.Test;

public class NewCustomer_DIAL {
  @Test
  public void login_SM_dial() {
	  System.out.println("login successful through simple---DIAL");
  }
  @Test
  public void validate_workflow_dial() {
	  System.out.println("workflow validated---DIAL");
  }
  @Test
  public void complete_customer_dial() {
	  System.out.println("customer completed---DIAL");
  }
  
}
