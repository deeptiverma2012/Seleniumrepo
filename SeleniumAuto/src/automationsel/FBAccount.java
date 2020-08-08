package automationsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBAccount {	
	
    ChromeDriver driver = new ChromeDriver();
	
	public void login()
	{		
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
	       
	       WebElement gender = driver.findElement(By.cssSelector("input._8esa"));
	       gender.click();
	        
	       WebElement submit = driver.findElement(By.name("websubmit"));
	       submit.click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		FBAccount fb = new FBAccount();
	    fb.login();        
      
	}

}
