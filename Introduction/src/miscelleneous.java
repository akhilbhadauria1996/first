import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscelleneous {

	public static void main(String[] args) throws Throwable {
		// 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.spotify.com/ca-en/signup/");
		Thread.sleep(4000);
		int number=findFrameNumber(driver,By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		
		driver.switchTo().defaultContent();
        int number1=findFrameNumber(driver,By.xpath("#recaptcha-verify-button"));
		
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
		
	}

	
	public static int findFrameNumber(WebDriver driver,By by)
	
	{
		int i;
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		int framecount=driver.findElements(By.tagName("iframe")).size();
		
		// isDisplayed method checks visibitly/invisibility of an object in the page if the object is visible 
				// to the user it returns True and if the object is invisible to the user it returns False and if the object is not
				// present it fails the script
				// if we want to check if the object is present in the application then we will use size(); and if the count is greate than 0
				// it shows that the object is present
		
		for(i=1;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			
			int count=driver.findElements(by).size();
			if(count>0)
			{
				//driver.findElement(by).click();
				break;
			}
			
			else
			{
				System.out.println("Continue Looping");
			}
			
		}
		
		driver.switchTo().defaultContent(); // to come out to webpage from frame so that you can switch toanother independent fram on the page
		System.out.println(i);
		return i;
		
	
		
		
		
		
	}
	
}
