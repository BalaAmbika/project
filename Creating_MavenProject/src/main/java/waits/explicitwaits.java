package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicitwaits {
	@Test
	public void explct()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayal\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ab= new ChromeDriver();
		ab.get("http:\\www.youtube.com");
		ab.executeScript("alert('Time out')");
		
		WebDriverWait w=new WebDriverWait(ab,10);
		w.until(ExpectedConditions.titleIs("youtube"));
		w.until(ExpectedConditions.titleContains("you"));
		w.until(ExpectedConditions.alertIsPresent());
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Music")));
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Music")));

		
	}

}
