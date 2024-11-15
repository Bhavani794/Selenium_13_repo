package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readprpertyfile {

	public static void main(String[] args) throws IOException {
 //step 1 create object for FileInoutStream
		
		FileInputStream fis= new FileInputStream("./testdata/commondata");
		//step 2: create respective file type object
		Properties prop =  new   Properties();
		//step3 call  read methods
		prop.load(fis);
	String url = prop.getProperty("url");
	 String email= prop.getProperty("email");
	String password = prop.getProperty("password");
	System.out.println(url);
	System.out.println(email);
	System.out.println(password);
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	}

}
