import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		// Type uni to get United States
		
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script=("return document.getElementById(\"autocomplete\").value;");
		String text=(String) js.executeScript(script);
		int i=0;
		while(!text.equalsIgnoreCase("United States"))
			
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
			i++;
			Thread.sleep(2000);
			text=(String) js.executeScript(script);
			System.out.println(text);
			
			
			if(i>7)
			{
				
				break;
			}
			
		
		}
		if(i>7)
		{
			System.out.println("not found");
		}
		
		else {System.out.println("keep looking");}
	}

}
