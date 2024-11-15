package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

public class TestScript  extends BaseClass{
@Test
public void clickOnBooks() {
	driver.findElement(By.partialLinkText("BOOKS")).click();
	String act = driver.getTitle();
	String expectedTitle=workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	if(act.equals(expectedTitle))
		Reporter.log("Books page displayed",true);
	else
		Reporter.log("not displayed",true);
}
}
