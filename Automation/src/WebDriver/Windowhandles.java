package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		Thread.sleep(5000);
		driver.findElement(By.id("browserButton3")).click();
		Set<String>k=driver.getWindowHandles();
		System.out.println(k);
		for(String id:k)
		{
			System.out.println(id);
		
		}		
	}

}
