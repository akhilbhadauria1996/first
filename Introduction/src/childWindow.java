import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		driver.findElement(By.linkText("Help")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='appbar-links'] //a[@class='product-icon']")).click();
		System.out.println(driver.getTitle());  // by default control remains on parent window..here we are getting
		//the title of parent window instead of child so to accomplish this we first need to get all the windows by
		//getwindowhandles method  --- it will return the set of all the window id's (id's will be in the form of strings)
		//first id will be of parent then the child's and then sub child's-- first come first serve basis
		// you need to store these id's in the set data structure
		Set<String>ids=driver.getWindowHandles();
		
		Iterator<String> it=ids.iterator(); // iterator is used to iterate between the id's
		String Parentid=it.next();
		String childid=it.next();
		
		
		//driver.switchTo().window(arg0) in argument we need to pass the desired window id
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='product-icon']")).click();
		
		Set<String>ids1=driver.getWindowHandles();
		Iterator<String> it1=ids1.iterator();
		String child2id=it1.next();
		String child3id=it1.next();
		String child4id=it1.next();   
		
		driver.switchTo().window(child4id);
		System.out.println(driver.getTitle());
		/*driver.switchTo().window(child3id);
		System.out.println(driver.getTitle());
		driver.switchTo().window(child4id);
		System.out.println(driver.getTitle());
		//driver.switchTo().window(Parentid);
		//System.out.println(driver.getTitle());*/
		
		
		
		
	}

}
