package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSubmit {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/index.php");
if(driver.getCurrentUrl().equals("https://demo.vtiger.com/vtigercrm/index.php"))
	System.out.println("welcome page loaded");
else
	System.out.println("welcome page not loaded");

driver.findElement(By.id("username")).sendKeys("Testing");
driver.findElement(By.id("password")).sendKeys("Test@123");
driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();
	}

}
