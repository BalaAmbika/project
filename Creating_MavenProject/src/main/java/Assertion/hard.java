package Assertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hard {
	@Test
	public void at()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http:\\www.flipkart.com");
        Assert.assertEquals(ob.getCurrentUrl(), "flipkart");
        Assert.assertNotEquals(ob.getTitle(), "google");
        WebElement ele=(WebElement) ob.findElementsByLinkText("Login");
        Assert.assertTrue(ele.isDisplayed());
        Assert.assertFalse(ele.isSelected());
        ob.quit();
        
        
	}
}
