package map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Login 
{
	
	
	@Given("User launch {string} browser with exe as {string}")
	public void bLaunch(String bname, String exe)
	{
	  
		 Object[] input1=new Object[2];
         input1[0]=bname;
         input1[1]=exe;
         SeleniumOperations.browserLaunch(input1);	
		
		
		
	}

	@Given("User enter  {string} as url")
	public void enterUrl(String url) 
	{
		 Object[] input2=new Object[1];
         input2[0]=url;
         		SeleniumOperations.openApplication(input2);               

	}
	
	
	@When("user click on Login button")
	public void clickOnLogin() 
	{
		  Object[] input3=new Object[1];
          input3[0]="(//*[text()='Login'])[2]";
          SeleniumOperations.clickOnElement(input3);
	}

	@When("user provide username as {string}")
	public void uname(String name) throws InterruptedException
	{
		 Object[] input4=new Object[2];
         input4[0]="//*[@id='input-email']";
         input4[1]=name;
         SeleniumOperations.sendText(input4);
         
         Thread.sleep(5000);  
	}

	@When("user provide password as {string}")
	public void pass(String password) throws InterruptedException 
	{
		   Object[] input5=new Object[2];
           input5[0]="//*[@id='input-password']";
           input5[1]=password;
           SeleniumOperations.sendText(input5);
           
           
         Thread.sleep(5000);  
	}

	@When("user click on login button")
	public void loginClick() 
	{
		 Object[] input6=new Object[1];
         input6[0]="//*[@type='submit']";
         SeleniumOperations.clickOnElement(input6);
         
	}

	@Then("Application shows user profile to user")
	public void profileDone() 
	{
		  Object[] input7=new Object[2];
          input7[0]="(//*[text()='My Account'])[4]";
          input7[1]="My Account";
          SeleniumOperations.captureText(input7);
	}
	
	
	
	

}
