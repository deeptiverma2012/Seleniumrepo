package automationsel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FBSignupWithAnnotations  {
	ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	FBSignupWithAnnotations fban = new FBSignupWithAnnotations();
	fban.BrowserLaunch();	
	fban.Signup();	
	fban.BrowserClose();	
			
	}	 
	 @ Before
	public void BrowserLaunch() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");        
	    driver.manage().window().maximize();
	    
	}	 
	 public void dropDownSelection(int indexNumber, WebElement element)
		{
			
		   	Select s = new Select(element);
		    s.selectByIndex(indexNumber);	  
			
		}
		
		public void dropDownSelection(String value, WebElement element )
		{
			Select s1 = new Select(element);
		    s1.selectByValue(value);
		}
		public void dropDownSelection1(String birtyear , WebElement element)
		{
			
			Select s2 = new Select(element);
		       
	       	s2.selectByVisibleText(birtyear);
		}		
		
		
		@ Test
		public void Signup() throws InterruptedException
		{	   
		      
			WebElement createNewAcc = driver.findElement(By.id("u_0_2"));
			createNewAcc.click();
	     
			System.out.println(" Create New ACcount button clicked");
				Thread.sleep(3000);	
	     
			  WebElement username = driver.findElement(By.name("firstname"));
		       username.sendKeys("Deepti");	       	  
		       
		       WebElement lastname = driver.findElement(By.name("lastname"));
		       lastname.sendKeys("Verma");
		       
		       WebElement mobileNo = driver.findElement(By.name("reg_email__"));
		       mobileNo.sendKeys("9999999999");
		       
		       WebElement newpasswd = driver.findElement(By.cssSelector("input#password_step_input"));
		       newpasswd.sendKeys("123@ABc");
		       
		       WebElement day = driver.findElement(By.id("day"));
		       day.click();
		       
		       FbDrpdwnMethod obj = new FbDrpdwnMethod();
		       obj.dropDownSelection(26, day);         	       
		       	       
		       WebElement month = driver.findElement(By.id("month"));
		       month.click();
		       obj.dropDownSelection("7", month);	       
		      
		       
		       WebElement year = driver.findElement(By.id("year"));
		       year.click();	      
		       obj.dropDownSelection1("1990", year);	       
		       	       
		       
		       WebElement gender = driver.findElement(By.cssSelector("input._8esa"));
		       gender.click();
		        
		       WebElement submit = driver.findElement(By.name("websubmit"));
		       submit.click();
		       
		       System.out.println("Signup Completed");
		}
		@ After
		public void BrowserClose()
		{
			driver.quit();
			
			System.out.println("Quiting Browser");
		}
		
		
		

}
