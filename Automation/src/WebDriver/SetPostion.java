package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostion {
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().window().setPosition(new Point(250,150));
		
	}

}