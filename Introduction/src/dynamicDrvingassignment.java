import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dynamicDrvingassignment {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		String checkValue=driver.findElement(By.id("checkBoxOption1")).getAttribute("value");
		
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(checkValue);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(checkValue);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		String alertText=driver.switchTo().alert().getText();
		if(alertText.contains(checkValue))
		{
			
			Assert.assertTrue(true);
			System.out.println("is present");
		}
		else
		{
			Assert.assertTrue(false);
			
		}
	}

}
