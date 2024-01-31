package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Tempt {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Automation Support\\chromedriver.exe");
		 
		  ChromeDriver driver=new ChromeDriver();                                                    //browserLaunch
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");                 //openApplication
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[text()='Login'])[2]")).click();                                   //click
		
		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("abhirajshejul@gmail.com");            //sendkeys
		
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys("Rajvika83!");   
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	driver.findElement(By.xpath("//*[text()='Address Book']")).click();  // New Address
				
	driver.findElement(By.xpath("//*[text()='New Address']")).click();	
	
	driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("PALLAVI");

	driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("SHEJUL");
	driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("ROSS");
	
	driver.findElement(By.xpath("(//*[@type='text'])[5]")).sendKeys("Ahmednagar");
	driver.findElement(By.xpath("(//*[@type='text'])[6]")).sendKeys("Pune");
	driver.findElement(By.xpath("(//*[@type='text'])[7]")).sendKeys("Warje Pune");
	driver.findElement(By.xpath("(//*[@type='text'])[8]")).sendKeys("411058");
	
	Select sel = new Select(driver.findElement(By.xpath("//*[@id='input-country']")));                            //dropdown
	sel.selectByVisibleText("India");
	

	Thread.sleep(5000);
	Select sel2= new Select (driver.findElement(By.xpath("//*[@id='input-zone']")));                              
	sel2.selectByVisibleText("Maharashtra");
	
	
	
	driver.findElement(By.xpath("(//*[@type='radio'])[1]")).click();
	
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	
	
	
	
	
	      String [] a=new String[4];
	
	
	
	      Object[] b=new Object[3];
	        
	              b[0]=32.43f;
	               b[1]="pune";
	               b[2]=3434;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}