import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsManageOptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();  // delete all cookies
		//driver.manage().deleteCookieNamed(""); // delete particular cookie by name
		// deleting session id cookie will help you to log out
		//driver.manage().addCookie(""); // adding a cookie
		driver.get("https://www.google.co.in/");
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("D://screenshot.png"));
	// if you get an error in fileutils than you might need to download the jar(apache.commons.io.FileUtils) from internet // you might get access denied error if you use c drive if you don't have admin access to it
	//in that case you can take the url of your user drive folder in c drive
	}

}
