package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetcssvalueRegister {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.findElement(By.xpath("//input[@value='Register']")).click();
	     WebElement errormsg = driver.findElement(By.xpath("///span[@class='field-validation-error']']"));
	     String color = errormsg.getCssValue("color");

	     String paddingleft = errormsg.getCssValue("padding-left");
	     String paddingbottom =errormsg.getCssValue("padding-bottom");
	     System.out.println(color);
	     System.out.println(paddingbottom);
	     System.out.println(paddingleft);
	     
	}

}
