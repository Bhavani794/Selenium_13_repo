package WebDriver;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleGet {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("facebook")).click();
	 Set <String> allWindowsIds =driver .getWindowHandles();
	 System.out.println(allWindowsIds);
	 for(String id:allWindowsIds)
	 {
		 System.out.println(id);
	 }
	
}
}
