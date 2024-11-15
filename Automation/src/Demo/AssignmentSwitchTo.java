package Demo;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSwitchTo {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demowebshop.tricentis.com/");
   Thread.sleep(20000);
   driver.findElement(By.id("Facebook")).click();
   switchToWindow(driver,"facebook");
   driver.findElement(By.id("Create new account")).click();
   switchToWindow(driver,"create new account");
   driver.findElement(By.name("firstname")).click();
   switchToWindow(driver,"fist name");
   }

	private static void switchToWindow(WebDriver driver, String url) {

		 Set<String> allWindowIds = driver.getWindowHandles();
		for(String id: allWindowIds)
		{
			driver.switchTo().window(id);
			String actUrl =driver.getCurrentUrl();
			if(actUrl.contains(url))
			{
				break;
			}
		}
			
	}

}
