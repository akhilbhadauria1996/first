import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // chromedriver class implementing webdriver interface
	/*	
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  // for implicit wait
		
		// below method is used for explicit wait we first define a object for class 
		//WebDriverWait and then further use it
		
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))); // or
		d.until(ExpectedConditions.elementToBeClickable(By.xpath(""))); // or
		d.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(""), "text"));  // their are other methods too
	
	// so now whenever we use (driver.) implicit wait will execute and when we use (d.)
		//explicit wait comes into picture
		 	 */
	/*
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
	WebDriverWait d=new WebDriverWait(driver,20);
	//	d.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#results"), "Process completed!  This response has been loaded via the Ajax request directly from the web server, without reoading this page."));
		
		d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
	    System.out.println(driver.findElement(By.cssSelector("#results")).getText());
	      
	//d.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
   //System.out.println(driver.findElement(By.id("results")).getText());
*/

// Fluent wait code below

driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
driver.findElement(By.cssSelector("#start button")).click();

Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
.ignoring(NoSuchElementException.class);// Fluentwait is the class which is implementing Wait interface
//<WebDriver> to tell that the driver is webdriver
//.ignoring(NoSuchElementException.class)) not a necessary step

WebElement fluent=wait.until(new Function<WebDriver, WebElement>(){
	public WebElement apply(WebDriver driver) {
		if(driver.findElement(By.cssSelector("#finish")).isDisplayed())
		{
		return driver.findElement(By.cssSelector("#finish"));
		}
		else 
			return null;
		
		}
});
	System.out.println(driver.findElement(By.cssSelector("#finish")).isDisplayed());
	System.out.println(driver.findElement(By.cssSelector("#finish")).getText());
}
	

}
	
	


