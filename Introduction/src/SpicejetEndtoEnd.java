import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpicejetEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\New folder (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		// driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();

		driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style");
		if (driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("0.5")) {
			System.out.print("disabled");
			Assert.assertFalse(true);
		}

		else {
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);

		int i = 1;

		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		int g = 1;
		while (g < 3) {
			driver.findElement(By.id("hrefIncChd")).click();
			g++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");

		driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).click();
		driver.findElement(By.cssSelector("input[id*='FindFlights']")).click();

	}

}
