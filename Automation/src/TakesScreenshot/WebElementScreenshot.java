package TakesScreenshot;

import java.io.File;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
  File temp = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
    String time =LocalDate.now().toString().replace(":", "-");
	File dest = new File("//Screenshot/element"+time+".png");
	}

}
