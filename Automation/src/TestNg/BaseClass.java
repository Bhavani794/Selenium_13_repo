package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
public WebDriver driver;
public Properties prop;
public Workbook workbook;

@BeforeTest
public void fetchData() throws IOException {
	//property file
	FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
	prop= new Properties();
	prop.load(fis);
	//excel file
	FileInputStream efis = new FileInputStream("./testdata/Book1.xlsx");
	  workbook=WorkbookFactory.create(efis);
}
@Parameters("Browser")
@BeforeClass

public void launchBrowser(@Optional("chrome")String browsername) {
	if(browsername.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}else if(browsername.equalsIgnoreCase("edge")) {
		driver= new EdgeDriver();
	}else if(browsername.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver();
	}
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 String url = prop.getProperty("url");
 driver.get(url);
}
@BeforeMethod
public void login() 
{
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
@AfterMethod
public void logout() {
	driver.findElement(By.linkText("Log out")).click();
}
@AfterClass
public void closeBrowser() {
	driver.quit();
}




}
