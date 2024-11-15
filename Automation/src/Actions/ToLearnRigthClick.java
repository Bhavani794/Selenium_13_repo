package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnRigthClick {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   driver.get("https://demowebshop.tricentis.com/");
   Actions act= new Actions(driver);
   act.contextClick().perform();//it perform page right click on web page
   Thread.sleep(3000);
  WebElement registerLink = driver.findElement(By.linkText("Register"));
  act.contextClick(registerLink).perform();
	}

}
