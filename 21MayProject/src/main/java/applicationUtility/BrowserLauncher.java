package applicationUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLauncher {
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("amazon.in");
}
}
