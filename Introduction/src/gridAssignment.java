import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gridAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		WebElement table=driver.findElement(By.cssSelector(".table-display"));
		
		/*  mymethod
		int rowCount=table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println(rowCount);
		int columnCount=table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println(columnCount);
		String secondRow=table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText();
		System.out.println(secondRow);
		
		*/
		
		// Trainers
		
		System.out.println(table.findElements(By.tagName("tr")).size());

		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());

		System.out.println(secondrow.get(1).getText());

		System.out.println(secondrow.get(2).getText());
		
		
	}

}
