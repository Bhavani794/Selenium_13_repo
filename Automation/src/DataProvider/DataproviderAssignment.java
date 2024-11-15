package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataproviderAssignment {
	@Test(dataProviderClass = Data.class,dataProvider = "loginData")
	public void login(String[] cred) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
	 driver.findElement(By.id("Email")).sendKeys(cred[0]);
	 driver.findElement(By.id("Password")).sendKeys(cred[1]);
	 driver.findElement(By.xpath("//input[@value='Log in']")).click();
	 Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "user failed to login");
	 Reporter.log("user logged in successfully",true);
	}
		

	}

