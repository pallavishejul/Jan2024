package utility;

public class Calling extends SeleniumOperations
{

	
	   public static void main(String[] args) throws InterruptedException 
	   {
		   
		   Calling obj=new Calling();
	
		   //browserLaunch
		   Object[] input1=new Object[2];
		            input1[0]="Chrome";
		            input1[1]="D:\\Automation Support\\chromedriver.exe";
		            SeleniumOperations.browserLaunch(input1);
		   
		  //openApplication
		            
	          Object[] input2=new Object[1];
		            input2[0]="https://tutorialsninja.com/demo/index.php?route=account/login";
		            		SeleniumOperations.openApplication(input2);               
	
                   Thread.sleep(5000);
		           //click on Login
		            	    Object[] input3=new Object[1];
				            input3[0]="(//*[text()='Login'])[2]";
				            SeleniumOperations.clickOnElement(input3);

				            
		            //send username
				            Object[] input4=new Object[2];
				            input4[0]="//*[@id='input-email']";
				            input4[1]="abhirjshejul@gmail.com";
				            SeleniumOperations.sendText(input4);
				   
				            //send password
				            Object[] input5=new Object[2];
				            input5[0]="//*[@id='input-password']";
				            input5[1]="Rajvika83!";
				            SeleniumOperations.sendText(input5);
				            
				            //click on submit
				            Object[] input6=new Object[1];
				            input6[0]="//*[@type='submit']";
				            SeleniumOperations.clickOnElement(input6);
				            
				            //click on addressbook
				            Object[] input7=new Object[1];
				            input7[0]="//*[text()='Address Book']";
				            SeleniumOperations.clickOnElement(input7);
				            //click on new address
				            Object[] input8=new Object[1];
				            input8[0]="//*[text()='New Address']";
				            SeleniumOperations.clickOnElement(input8);
				            
				            //send name
				            Object[]input9=new Object[2];
				            input9[0]="(//*[@type='text'])[2]";
				            input9[1]="Ganesh";
				            SeleniumOperations.sendText(input9);
				            
				            //send surname
				            Object[] input10=new Object[2];
				            input10[0]="(//*[@type='text'])[3]";
				            input10[1]="Gandal";
				            SeleniumOperations.sendText(input10);
				            
                            //send companyname
				            Object[]input11=new Object[2];
				            input11[0]="(//*[@type='text'])[4]";
				            input11[1]="PerfectLearn";
				            SeleniumOperations.sendText(input11);
				            
				            //send city
				            Object[]input12=new Object[2];
				            input12[0]="(//*[@type='text'])[5]";
				            input12[1]="Ahmednagar";
				            SeleniumOperations.sendText(input12);
				            
				            //send city2
				            Object[] input13=new Object[2];
				            input13[0]="(//*[@type='text'])[6]";
				            input13[1]="Pune";
				            SeleniumOperations.sendText(input13);
				            
				            //area
				            Object[] input14=new Object[2];
				            input14[0]="(//*[@type='text'])[7]";
				            input14[1]="WarjePune";
				            SeleniumOperations.sendText(input14);
				            
				            //pin
				            Object[] input15=new Object[2];
				            input15[0]="(//*[@type='text'])[8]";
				            input15[1]="411058";
				            SeleniumOperations.sendText(input15);
				           
				            //select india
				            Object[] input16=new Object[2];
				            input16[0]="//*[@id='input-country']";
				            input16[1]="India";
				            SeleniumOperations.staticDropDown(input16);
				            
				            //select state
				            Object[] input17=new Object[2];
				            input17[0]="//*[@id='input-zone']";
				            input17[1]="Maharashtra";
				            SeleniumOperations.staticDropDown(input17);
				            
				            //select radio
				            Object[] input18=new Object[1];
				            input18[0]="(//*[@type='radio'])[1]";
				            SeleniumOperations.clickOnElement(input18);
				            
				            //click on submit
				            Object[] input19=new Object[1];
				            input19[0]="//*[@type='submit']";
				            SeleniumOperations.clickOnElement(input3);
				            

	
	}
	
	
	
	
	
}
