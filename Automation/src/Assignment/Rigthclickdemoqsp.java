package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rigthclickdemoqsp {

	public static void main(String[] args) {
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
     driver.findElement(By.linkText("Right Click")).click();
     Actions act =new Actions(driver);
      WebElement RigthclickButton = driver.findElement(By.xpath("//button[text()='Right Click'][1]"));
      act.contextClick(RigthclickButton).perform();
       driver.findElement(By.xpath("//div[text()='Yes']")).click();
   
       WebElement select = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
       String result = select.getText();
       System.out.println(result);
       String colour = select.getCssValue("color");
       System.out.println(colour);
	}

}
