import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
/*
//for current date
driver.get("https://www.spicejet.com/");
driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();;


System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());

System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
{
	System.out.println("enabled");
	Assert.assertTrue(true);
}

   else
{
	
	Assert.assertTrue(false);
}
*/
	
	
	// For any date -- ex April 23
	
	driver.get("https://www.path2usa.com/travel-companions");
	driver.findElement(By.cssSelector("#travel_date")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".datepicker-months .datepicker-switch")).click();
	
	while(!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("April"))
	/* while expects a true argument and it keeps on looping until the argument is false
	 here we are using a negation ! so thatt if we don't find april that negation make the argument true
		 this will help us to keep looping and whenn we find April it comes out of the loop as the negation will make 
		the argument false */
	{
		
	driver.findElement(By.cssSelector(".datepicker-days .next")).click();	
	}
	// grab the common attribute. put it into a list. than iterate
	List<WebElement> dates=driver.findElements(By.cssSelector(".day")); // step can be ignored
   int count =driver.findElements(By.cssSelector(".day")).size();

	for(int i=0;i<count;i++)
		
	{
		String dateText = driver.findElements(By.cssSelector(".day")).get(i).getText();
		
	if(dateText.equalsIgnoreCase("23"))
	{
		driver.findElements(By.cssSelector(".day")).get(i).click();
		break;
	}
	}
	
	
	}

}
