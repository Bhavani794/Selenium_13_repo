package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.navigate().to("https://demoapp.skillrary.com/login.php?type=register");
		driver.findElement(By.partialLinkText(" SIGNUP")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("First Name")).sendKeys("Bhavani");
		driver.findElement(By.name("lastname")).sendKeys("Bhavani");
		driver.findElement(By.name("email")).sendKeys("Bhavani123@gmail.com");
		driver.findElement(By.className("password")).sendKeys("1234@");
		driver.findElement(By.name("repassword")).sendKeys("1234@");
		driver.findElement(By.name("signup")).click();
		driver.navigate().back();
	}
}