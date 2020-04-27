import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.findElement(By.id("draggable")); // this will fail as the element is within a frame
		//and selenium cannot find it directly browsing the page with findElement method.
		
		
		// In the context of a web browser, a frame is a part of a web page or browser window which displays 
		//content independent of its container, with the ability to load content independently. 
		//The HTML or media elements that go in a frame may or may not come from the same web site//
		//as the other elements of content on display.
		
		//driver.switchTo().frame(arg0) ===  for tis to identify we need to use frame method
		// frame accepts value in arguement either as int,string or webelement
		//driver.switchTo().frame(0);// with index----(0) means 1st frame (1) means 2nd frame and so on
// not suggestable because if developer add or delete any frame indexes will gets change
		System.out.println(driver.findElements(By.tagName("iframe")).size());  // to find the no. of frames so that we can use indexes
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); // with webelement
		driver.findElement(By.id("draggable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		driver.switchTo().defaultContent();  // to come out of the frame after that only you can perform
		// any other operation outside frame
	}

}
