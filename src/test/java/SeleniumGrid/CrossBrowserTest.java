package SeleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;


public class CrossBrowserTest
{
	public WebDriver driver;
	@Parameters({"bname"})
	@Test
	public void broweserTest(String bname) throws MalformedURLException, InterruptedException 
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			Reporter.log("Test executing on Chrome!!",true);

			driver= new RemoteWebDriver( new URL ("http://localhost:4444"),options);
			Reporter.log("Driver session established with server!!",true);

		}else if(bname.equalsIgnoreCase("edge")) 
		{

			EdgeOptions options=new EdgeOptions();
			Reporter.log("Test executing on Edge!!",true);

			driver= new RemoteWebDriver( new URL ("http://localhost:4444"),options);
			Reporter.log("Driver session established with server!!",true);

		}else if(bname.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions options=new FirefoxOptions();
			Reporter.log("Test executing on Firefox!!",true);

			driver= new RemoteWebDriver( new URL ("http://localhost:4444"),options);
			Reporter.log("Driver session established with server!!",true);
		}
		Thread.sleep(500);
		driver.get("http://www.amazon.in");
		System.out.println("Title is: "+ driver.getTitle());
		Thread.sleep(1000);
		Reporter.log("Test executing for Amazon application!!",true);
		driver.close();
		Reporter.log("Test executing on Chrome Completed!!",true);
		Reporter.log("Test executing on Edge Completed!!",true);
		Reporter.log("Test executing on Firefox Completed!!",true);
	}
}
