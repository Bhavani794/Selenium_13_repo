package SelectList;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {

	public static void main(String[] args) {
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
   WebElement monthDropDown = driver.findElement(By.id("month"));
   Select monthSelect = new Select(monthDropDown);
  // monthSelect.selectByIndex(3);
   //monthSelect.selectByValue("4");
   monthSelect.selectByVisibleText("Apr");
   
   		
    WebElement dayDropDown = driver.findElement(By.id("day"));
    Select daySelect = new Select(dayDropDown);
    daySelect.selectByValue("23");
   
	}

}
