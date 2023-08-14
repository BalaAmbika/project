package Assertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class soft {
	public void sat() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver ob=new ChromeDriver();
	ob.get("http:\\www.flipkart.com");
	SoftAssert s=new SoftAssert();
	s.assertEquals(ob.getTitle(), "flipkart");
    s.assertNotEquals(ob.getCurrentUrl(), "yahoo");
	WebElement variable = ob.findElementByLinkText("Login");
	s.assertTrue(variable.isDisplayed());
	s.assertFalse(variable.isSelected());
	WebElement ele = ob.findElementByName("q");
	s.assertTrue(ele.isDisplayed());
	
	
	ob.quit();
	
	
	}
}
