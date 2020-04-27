import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\New folder (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		Thread.sleep(4000);
		WebElement from = driver.findElement(By.id("FromTag"));
		from.click();
		from.sendKeys("mum");
		Thread.sleep(8000);
		from.sendKeys(Keys.ENTER);
		// driver.findElement(By.id("FromTag")).click();
		// driver.findElement(By.id("FromTag")).sendKeys("mum");
		Thread.sleep(4000);
		WebElement to = driver.findElement(By.id("ToTag"));
		// to.click();
		to.sendKeys("delhi");
		Thread.sleep(8000);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active"))
				.sendKeys(Keys.ENTER);
		;

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("3");

		Select child = new Select(driver.findElement(By.id("Childrens")));
		child.selectByValue("2");

		driver.findElement(By.id("MoreOptionsLink")).click();

		Thread.sleep(2000);

		Select travel = new Select(driver.findElement(By.cssSelector("#Class")));
		travel.selectByValue("Premium Economy");

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		Thread.sleep(4000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("SearchBtn")).click();

	}

}
