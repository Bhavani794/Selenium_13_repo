package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle 
{
	public static void main(String[] args) {

	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver. get("https://demowebshop.tricentis.com/");
 String windowId	= driver.getWindowHandle();
 System.out.println(windowId);

}

}
