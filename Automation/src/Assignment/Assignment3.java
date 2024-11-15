package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
   WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
   driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
   WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
   driver.switchTo().frame(frame);
    WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
   WebElement image2 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
   WebElement trash = driver.findElement(By.id("trash"));
    Actions act= new Actions(driver);
    act.dragAndDrop(image1, trash).perform();
    act.dragAndDrop(image2, trash).perform();
    driver.switchTo().defaultContent();
    driver.findElement(By.partialLinkText("CHEATSHEETS")).click();
    driver.findElement(By.partialLinkText("SQL Cheat Sheet")).click();
    WebElement slide = driver.findElement(By.xpath("//img[@loading='lazy'][1]"));
    Actions act1= new Actions(driver); 
    act.scrollToElement(slide).perform();
   // act.scrollByAmount(0, 500).perform();
  //  act.scrollByAmount(0, 900).perform();
    TakesScreenshot ts = (TakesScreenshot)driver;
    File temp =ts.getScreenshotAs(OutputType.FILE);
    File dest = new File(("./Screenshot/image3.png"));
 FileHandler.copy(temp, dest);
 	}
    	
	}


