package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptCrossBrowser extends BaseClassDemoSillky {
@Test
public  void ClickonSales() {
	driver.findElement(By.xpath("//span[text()='Sales']")).click();
	String actualtitle = driver.getTitle();
	String expectedtitle = "SkillRary Ecommerce";
   if(actualtitle.endsWith(expectedtitle)) {
	   Reporter.log("sales page is displayed",true);
   } else {
	   Reporter.log("sales page is not displayed",true);
		   
   }
	
}
}
