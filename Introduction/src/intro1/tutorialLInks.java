package intro1;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tutorialLInks {

	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				  WebDriver driver = new ChromeDriver();
				  driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(6000);
				  //driver.findElement(By.id("loginText")).click();
				 // driver.findElement(By.id("userId")).clear();
				  
				  driver.findElement(By.id("userId")).sendKeys("mss1990");
				//  driver.findElement(By.id("pwd")).clear();
				  
				 // driver.findElement(By.id("pwd")).sendKeys("monu1990");
		          
		         // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		         // driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
	}
	
		
	/*
	 * private WebDriver driver; private String baseUrl;
	 * 
	 * @Test public void setUp() throws Exception{ // Selenium version 3 beta
	 * releases require system property set up
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 * WebDriver driver = new ChromeDriver(); // Create a new instance for the class
	 * FirefoxDriver // that implements WebDriver interface
	 * 
	 * // Implicit wait for 5 seconds driver.manage().timeouts().implicitlyWait(5,
	 * TimeUnit.SECONDS); // Assign the URL to be invoked to a String variable
	 * baseUrl = "https://www.in.ckgs.us/myaccount/";
	 * 
	 * // Open baseUrl in Firefox browser window driver.get(baseUrl); // Locate
	 * 'Current Passport Number' text box by cssSelector: tag and name attribute
	 * WebElement passportNo =
	 * driver.findElement(By.cssSelector("input[name='currentPassportNo']")); //
	 * Clear the default placeholder or any value present passportNo.clear(); //
	 * Enter/type the value to the text box passportNo.sendKeys("123456789");
	 * //prompting user to enter captcha String captchaVal =
	 * JOptionPane.showInputDialog("Please enter the captcha value:"); //Type the
	 * entered captcha to the text box
	 * driver.findElement(By.id("recaptcha_response_field")).sendKeys(captchaVal); }
	 * 
	 */

		 
	}


