package Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListernerImplementation.class)
public class TestScript {	
@Test
public void login() {
	Reporter.log("launch the browser",true);
	Reporter.log("Navigate to url",true);
	Reporter.log("Click on login link",true);
	Reporter.log("Enter valid credentials",true);
	Reporter.log("Click on login button",true);
	Assert.assertEquals(true, true);
}
}
