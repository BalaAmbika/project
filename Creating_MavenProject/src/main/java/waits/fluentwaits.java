package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class fluentwaits {
	@Test
	public void fluent()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver ab= new ChromeDriver();
	ab.get("http:\\www.youtube.com");
	ab.executeScript("alert('Time out'");
	
	FluentWait f=new FluentWait(ab);
	f.withTimeout(6000,TimeUnit.MILLISECONDS);
	f.pollingEvery(2000,TimeUnit.MILLISECONDS);
	f.until(ExpectedConditions.alertIsPresent());
	}
}
