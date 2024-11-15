package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScrrenshot {

	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://demoapps.qspiders.com/");
    driver.findElement(By.partialLinkText("UI Testing Concepts")).click();
    driver.findElement(By.linkText("Web Table")).click();
    driver.findElement(By.linkText("Dynamic Web Table")).click();
 
    
    
    
	}

}
