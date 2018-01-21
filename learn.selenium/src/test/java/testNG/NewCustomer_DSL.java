package testNG;

import org.testng.annotations.Test;

public class NewCustomer_DSL {
  @Test(groups= {"smoke"} ,dependsOnMethods= {"validate_workflow_dsl"})
  public void login_SM_dsl() {
	  System.out.println("login successful through simple---DSL");
  }
  @Test(groups= {"smoke"})
  public void validate_workflow_dsl() {
	  System.out.println("workflow validated---DSL");
  }
  @Test
  public void complete_customer_dsl() {
	  System.out.println("customer completed---DSL");
  }
  
}
