import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	int height=driver.manage().window().getSize().height;
	int width=	driver.manage().window().getSize().width;
 
	Dimension dimension=new Dimension(100,100);
	System.out.println(height);
	System.out.println(width);
	
	driver.manage().window().setSize(dimension);
	int i = 0,j = 0;
	while(i<height&&j<width)
		
	{
		Dimension dimension1=new Dimension(i,j);
	driver.manage().window().setSize(dimension1);
	i++;
	j++;
		
	}
	
	
	}

}
