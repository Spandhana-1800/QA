
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmaillogin {
	 public static void main(String[] args) throws InterruptedException {
		 
	        //initialize Chrome driver
	        System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver(); 
	 
	         //Open gmail
	         driver.get("http://www.gmail.com");
	         Thread.sleep(1000);
	        driver.switchTo().alert().accept();
	 
	         // Enter userd id
	        // WebElement element = 
	        		 driver.findElement(By.id("Email")).sendKeys("spandhana.Vallakati@gmail.com");
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	         driver.findElement(By.id("identifierNext")).click();
	         //element.
	         //driver.sendKeys("").click();
	 
	         //wait 5 secs for  userid to be entered
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	         //Enter Password
	         //WebElement element1 = 
	        		 driver.findElement(By.id("Passwd")).sendKeys("*******");;
	         //element1.sendKeys("");
	 
	         
	    }
	 
	
	
}
