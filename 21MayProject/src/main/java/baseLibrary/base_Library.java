package baseLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service.State;

public class base_Library 
{
	String path="C:\\Users\\Susheel.paswan\\eclipse-workspace\\21MayProject\\webdriver\\chromedriver.exe";
	public static WebDriver driver=null;
	@Test
public void launchUrl()
{
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://www.testingbaba.com/old/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
}
