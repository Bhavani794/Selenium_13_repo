package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathContains {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("7648689389");

	}

}