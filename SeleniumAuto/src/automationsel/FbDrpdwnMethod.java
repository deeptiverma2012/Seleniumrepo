package automationsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDrpdwnMethod {			
	
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

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();		

		  driver.get("https://www.facebook.com/");
	        
	      driver.manage().window().maximize();
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
	       
      
	}

}
