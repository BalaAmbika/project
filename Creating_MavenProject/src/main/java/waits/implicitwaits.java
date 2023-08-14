package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicitwaits {
	
	@Test
	public void implicit()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab= new ChromeDriver();
		ab.get("http:\\www.youtube.com");
		ab.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Capabilities n = ab.getCapabilities();
		System.out.println("version is "+ n.getVersion());
		System.out.println("os is "+n.getPlatform());
		ab.findElementByLinkText("Trending");
		ab.quit();
		
		
		
	}

}
