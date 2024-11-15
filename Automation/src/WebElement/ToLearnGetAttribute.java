package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnGetAttribute {

	public static void main(String[] args) {
   WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.flipkart.com/");
    WebElement searchTf = driver.findElement(By.name("q"));
     String value= searchTf.getAttribute("title");
     	System.out.println("value");
	}

}
