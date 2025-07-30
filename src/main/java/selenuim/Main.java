package selenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Main {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		WebElement userNameElement = driver.findElement(By.name("email"));
		userNameElement.sendKeys("abelbase49@gmail.com");
		Thread.sleep(1000);
		WebElement passwdElement = driver.findElement(By.name("pass"));
		passwdElement.sendKeys("HelloK@thm@ndu95731!");
		Thread.sleep(1000);
		WebElement clickElement = driver.findElement(By.name("login"));
		clickElement.click();
		Thread.sleep(10000);
		driver.close();
		
		
		
		  
	}

}
