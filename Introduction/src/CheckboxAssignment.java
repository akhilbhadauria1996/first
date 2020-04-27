import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (3)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://qaclickacademy.com/practice.php");

WebElement check=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
System.out.println(check.isSelected());
check.click();
System.out.println(check.isSelected());
check.click();
System.out.println(check.isSelected());

System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());


	}

}
