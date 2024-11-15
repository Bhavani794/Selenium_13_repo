package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemoWeb {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(2000);
	WebElement gender = driver.findElement(By.id("gender-female"));
	gender.click();
	driver.findElement(By.id("FirstName")).sendKeys("Bhavani");
	driver.findElement(By.id("LastName")).sendKeys("Bhavani");
	driver.findElement(By.id("Email")).sendKeys("Bhavani123@gamil.com");
	driver.findElement(By.id("Password")).sendKeys("Bha123@");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Bha123@");
	driver.findElement(By.id("register-button")).click();
	}
}

