package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionsMonth {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
   WebElement monthDropDown = driver.findElement(By.id("month"));
   Select monthSelect = new Select(monthDropDown);
    List<WebElement> allOptions = monthSelect.getOptions();
  for(int i=0;i<allOptions.size();i++)
  {
	  monthSelect.selectByIndex(i);
	  String text =allOptions.get(i).getText();
	 monthSelect.selectByVisibleText(text);
	  Thread.sleep(2000);
  }
  for(WebElement ele:allOptions)
  {
	  monthSelect.selectByVisibleText(ele.getText());
	  if(ele.isSelected());
	  System.out.println(ele.getText()+"----> Selected");
  }
	}

}
