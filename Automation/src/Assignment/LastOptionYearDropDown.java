package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastOptionYearDropDown {

	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    WebElement yearDropDown = driver.findElement(By.id("year"));
    Select yearSelect = new Select(yearDropDown);
    yearSelect.selectByVisibleText("1905");
	}

}
