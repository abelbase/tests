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
			options.addArguments("--headless");
			options.addArguments("--no-sandbox"); 
			options.addArguments("--user-data-dir=/tmp/chrome-profile-" + System.currentTimeMillis());
			WebDriver driver = new ChromeDriver();
			driver.get("http://3.138.34.254:8081/contact.html");
			Thread.sleep(2000);
			WebElement NameElement = driver.findElement(By.id("inputName"));
			NameElement.sendKeys("Ashish");
			Thread.sleep(1000);
			WebElement mbleElement = driver.findElement(By.id("inputNumber"));
			mbleElement.sendKeys("1023192102!");
			Thread.sleep(1000);
			WebElement emailElement = driver.findElement(By.id("inputMail"));
			emailElement.sendKeys("asb@abc.com");
			Thread.sleep(1000);
			WebElement messageElement = driver.findElement(By.id("inputMessage"));
			messageElement.sendKeys("Hello from ashish");
			Thread.sleep(10000);
			WebElement sendElement = driver.findElement(By.id("my-button"));
			sendElement.click();
			Thread.sleep(8000);
			driver.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		  
	}

}
