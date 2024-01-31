package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations                       
{
		
	public static WebDriver driver;
	
	      //browserLaunch
	       public static void browserLaunch(Object[] inputParameters)                          // bname   exelocation  KT
	          {                                                                                // training
	            String bname=(String)inputParameters[0]; //Chrome
	             String path=(String)inputParameters[1]; //exeLocation
	          
	             
	           if(bname.equalsIgnoreCase("Chrome"))
	           {
	              System.setProperty("webdriver.chrome.driver", path);          	     
	                    	     
	            driver=new ChromeDriver();    
	            
	           driver.manage().window().maximize();
	           }
	           else if(bname.equalsIgnoreCase("fireFox"))
	           {
	        	   System.setProperty("webdriver.gecko.driver", path);          	     
          	     
		            driver=new FirefoxDriver();    
		            
		           driver.manage().window().maximize(); 
	           }
	           
	           }
	//openApplication
	        public static void openApplication(Object[] inputParameters)
	        {
	        	try{
	        	String url=(String)inputParameters[0];
	        	
	        	  driver.get(url);
	        	  
	        	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	}
	        	catch(Exception e)
	        	{
	        		System.out.println(e);
	        	}
	        }
	
	        //click on Element 
	        public static void clickOnElement(Object[] inputParameters)
	        {
	        	try{
	        	String xpath=(String) inputParameters[0];
	        	
	        	 driver.findElement(By.xpath(xpath)).click();
	       	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	}
	        	catch(Exception e)
	        	{
	        		System.out.println(e);
	        	}
	        }
	
	        
	   //sendTextOnUi
	        public static void sendText(Object[] inputParameters)
	        {
	        	try
	        	{
	        	String xpath=(String)inputParameters[0];
	        	String text=(String)inputParameters[1];
	        	     driver.findElement(By.xpath(xpath)).sendKeys(text);
	        		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	     
	        	}
	        	catch(Exception e)
	        	{
	        		System.out.println(e);
	        	}
	        }
	        
	    //dropdown
	        public static void staticDropDown(Object[] inputParameters)
	        {
	        	
	        	try
	        	{
	        	String xpath=(String)inputParameters[0];
	        	String value=(String)inputParameters[1];
	        	
	        	Select sel = new Select(driver.findElement(By.xpath(xpath)));                            //dropdown
	        	sel.selectByVisibleText(value);	        
	      	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	}
	        	catch(Exception e)
	        	{
	        		System.out.println(e);
	        	}
	        }
	        
	        
	        
	        public static void captureText(Object[] inputParameters)
	        {
	        	
	        	String xpath=(String)inputParameters[0];                 //xpath      
	        	
	        	String givenText=(String)inputParameters[1];                   // My Account
	        	
	        	
	        	String capturedText=driver.findElement(By.xpath(xpath)).getText();
	        	
	        	if(givenText.equalsIgnoreCase(capturedText))
	        	{
	        		System.out.println("Test Case Pass");
	        	}
	        	
	        	else 
	        	{
	        		System.out.println("Test Case Fail");
	        	}
	        	
	        	
	        	
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	

}
