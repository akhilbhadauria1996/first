import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	//	driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
        driver.get("http://www.demo.guru99.com/V4/index.php");
		
		driver.findElement(By.name("uid")).sendKeys("deneu");
		driver.findElement(By.name("password")).sendKeys("jhdbd");
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
		// switch method is used for java alerts as we cannot get the html code of it
		//for normal web alerts we can use normal procedure
		//System.out.println(driver.switchTo().alert().getText());
	//driver.switchTo().alert().accept();   //  accept is used for positive outcomes like ok,yes,done etc
	    //driver.switchTo().alert().dismiss();  // for negative scenarios like no,cancel etc
	
	//driver.switchTo().alert().sendKeys("");  // if you have a text field in the alert
	
	}

}
