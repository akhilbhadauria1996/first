import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
		// when you have similar xpaths then selenium by default takes the first one so 
		//in order to select the second xpath you need to use indexing as done above
		
		
		//if you don't want to use indexing then your xpath should be like - parent-xpath child-xpath (using parentchild relationship)
		//in this case xpath will be //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']    here parent will help in identifying the correct point
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}

}
