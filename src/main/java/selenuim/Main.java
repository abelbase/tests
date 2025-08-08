package selenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Main {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless","--start-maximized");
			options.addArguments("--no-sandbox","--disable-dev-shm-usage"); 
			 options.addArguments("--remote-allow-origins=*");
			//options.addArguments("--user-data-dir=/tmp/chrome-profile-" + System.currentTimeMillis());
			WebDriver driver = new ChromeDriver(options);
			driver.get("http://3.138.34.254:8081/contact.html");
			Thread.sleep(2000);
			WebElement NameElement = driver.findElement(By.id("inputName"));
			NameElement.sendKeys("testuser");
			
			WebElement mbleElement = driver.findElement(By.id("inputNumber"));
			mbleElement.sendKeys("1023192102!");
			
			WebElement emailElement = driver.findElement(By.id("inputMail"));
			emailElement.sendKeys("testuser@abc.com");
			
			WebElement messageElement = driver.findElement(By.id("inputMessage"));
			messageElement.sendKeys("Hello from testuser");
			
			WebElement sendElement = driver.findElement(By.id("my-button"));
			sendElement.click();
			
			WebElement responseElement = driver.findElement(By.id("response"));
			System.out.println(responseElement.getText());
			driver.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		  
	}

}
