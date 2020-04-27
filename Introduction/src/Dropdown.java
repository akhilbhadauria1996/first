import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\New folder (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		/*System.out.println(driver.getTitle());	 
		
		// Cretaing object s for class select----
		//this will work only while using static dropdowns having 'Select' Class
		Select s=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("AED");		
		s.selectByIndex(2);*/
		
		//  below oneis for complex dropdown where we need to click on + or - to add passengers
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);  // used to provide pause in this case pause for 2 seconds
		
		/*
		int i=1;
		while(i<5)  // using while loop to repeat execution of condition under it.... loop will run until the condition undr bracket is true
		// here we want to click 4 times so the condition will run for i =1 then 2 then 3 then 4 and
			//when the value off i = 5 the condition becomes false and we come out of the loop
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;  //  this will increment the value of i by 1 after each execution
		}
		*/
		
//		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)  // for loop works the same way as while you just write
			//everything in one placein () as compared to while loop
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
