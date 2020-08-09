package automationsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdwn {			

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
	       	       
	       Select s = new Select(day);
	       s.selectByIndex(26);
	       Thread.sleep(1000);
	       
	       WebElement month = driver.findElement(By.id("month"));
	       month.click();
	       Select s1 = new Select(month);
	       s1.selectByValue("7");
	       Thread.sleep(1000);
	       
	       WebElement year = driver.findElement(By.id("year"));
	       year.click();
	       Select s2 = new Select(year);
	       
	       	s2.selectByVisibleText("1990");
	       	Thread.sleep(1000);	       
	       
	       WebElement gender = driver.findElement(By.cssSelector("input._8esa"));
	       gender.click();
	        
	       WebElement submit = driver.findElement(By.name("websubmit"));
	       submit.click();
	       
      
	}

}
