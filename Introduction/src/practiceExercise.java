import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		
		//1. find count of links on the page  (hint-- all the links will have a tagname (a))
		System.out.println(driver.findElements(By.tagName("a")).size());
		

		//2. find count of links on the page footer  
		System.out.println(driver.findElements(By.className("gf-li")).size());  // here ihave use class name
		//but we can achieve thisby limiting the scope of webdriver to a specific point(in our case page footer)
		//for this we will create another driver
		WebElement footerDriver=driver.findElement(By.id("gf-BIG")); // now footerdriver will behave like 
		//driver for the footer section
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3. find count of links in first column of footer
		//WebElement discount=driver.findElement(By.xpath("//td[1]//ul[1]"));
		//System.out.println(discount.findElements(By.tagName("a")).size());
		
		WebElement discount1=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(discount1.findElements(By.tagName("a")).size());
		
		//4. click on each link in the column and see if it's working and get the title of each tab
		
		for(int i=1;i<discount1.findElements(By.tagName("a")).size();i++)
		{
			
			//String keyBoardClick=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
			//discount1.findElements(By.tagName("a")).get(i).sendKeys(keyBoardClick);
			discount1.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
			Thread.sleep(5000);
			
		}// for loop opens all the tabs
			Set<String> ids=driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			
			while(it.hasNext()) // hasnext checks if there's a next tab or nor
				{
				
				driver.switchTo().window(it.next());// next actually switches to next tab
				System.out.println(driver.getTitle());
				
			} // while loop get theid's and get titles of all the tabs
			
			
			
			
			
			
		}
				
	}


