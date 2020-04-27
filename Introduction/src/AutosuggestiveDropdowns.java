import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*   EXAMPLE 1
		 
		 
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.id("fromCity")).clear();   ---- to wipe out existing data in the field
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(4000);
		
		//driver.findElement(By.id("fromCity")).sendKeys("mum");
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("banglore");
		//driver.findElement(By.xpath("//*[text()='Bangalore, India']")).click();  // by mouse click
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("delhi");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);  // keys. is used to bring out keyboard commands
		
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']")); // we created web element so taht we need 
		//not to write the same thing again and again
		source.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("delhi");
		Thread.sleep(2000);
		source.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		source.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		WebElement Destination=driver.findElement(By.xpath("//input[@placeholder='To']"));
		Destination.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mumbai");
		Thread.sleep(2000);
		Destination.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		Destination.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		
		*/
		
		// EXAMPLE 2    --- enter beng and see if BENGALURU INTERNATION AIRPORT is present or not
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		//System.out.println(driver.findElement(By.id("fromPlaceName")).getText()); // here we are not getting the text in the output as the texxt is hidden it's in the hidden class in the html
		// javascript DOM van extract hidden elements...so we need to use javascript api==JacaScriptexecutor in selenium
				JavascriptExecutor js=(JavascriptExecutor)driver;  // defining JavascriptExecutor
				String script="return document.getElementById(\"fromPlaceName\").value;";  // "" cannot be used inside "" hence we use \ 
				// return is used in js to retrieve the value it will retrieve the vlue and put it in script variable
				String text=(String) js.executeScript(script);
				
				// i have used while and if loop both..this can also be achieved by a single while loop
	 /*   while("" != null)// we can use while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
	    		
		{driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		text=(String) js.executeScript(script);
		System.out.println(text);
		
		if(text.contains("BENGALURU INTERNATION AIRPORT"))
		{
			System.out.println("passed");
			break;
		}
		
		else
		{System.out.println("keep looking");
		}
		
		}
		
		//Actions a=new Actions(driver);
	//	a.moveToElement(driver.findElement(By.id("fromPlaceName"))).click().sendKeys("ben").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		//.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
*/
				int i=0;
				while(!text.equalsIgnoreCase("BENGALURU"))
					
				{
					
					driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
				//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				
				
				text=(String) js.executeScript(script);
				System.out.println(text);
				i++;
				
				if(i>10)
				{
					
					break;
				}
				
				}
				
				if(i>10)
				{
					System.out.println("not found");
					
				}
				else {
					System.out.println("keep looking");
					
				}
				}
				
				
				
	

}
