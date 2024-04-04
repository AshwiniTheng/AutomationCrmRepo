package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GridTest {
	@Test
	public void testOnChrome() throws MalformedURLException, InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		Reporter.log("Test executing on Chrome!!",true);

		WebDriver driver= new RemoteWebDriver( new URL ("http://localhost:4444"),options);
		Reporter.log("Driver session established with servsr!!",true);
		Thread.sleep(500);
		driver.get("http://www.amazon.in");
		System.out.println("Title is: "+ driver.getTitle());
		Thread.sleep(1000);
		Reporter.log("Test executing for Amazon application!!",true);
		driver.close();
		Reporter.log("Test executing on Chrome Completed!!",true);
	}
}
