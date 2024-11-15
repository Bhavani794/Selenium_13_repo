package Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnSwitchTo 
{
    public static void main(String[] args) throws InterruptedException {
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.shoppersstack.com/products_page/15");
     Thread.sleep(20000);
     driver.findElement(By.id("compare")).click();
     switchTowindow(driver,"flipkart");
    Point flipkartpostion = driver.manage().window().getPosition();
    switchTowindow(driver,"ebay");
    Point ebaypostion = driver.manage().window().getPosition();
    driver.manage().window().setPosition(flipkartpostion);
    switchTowindow(driver,"flipkart");
    driver.manage().window().setPosition(ebaypostion);
     
	}
	public static void switchTowindow( WebDriver driver,String url)
	{
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
