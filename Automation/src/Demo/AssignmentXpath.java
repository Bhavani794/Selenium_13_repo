package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentXpath {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Bhavani123@gamil.com");
driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Bha123@");
driver.findElement(By.xpath("//input[@value='Log in']")).click();
if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/"))
	System.out.println("Home page loaded");
else
	System.out.println("Home page not loaded");
	}

}