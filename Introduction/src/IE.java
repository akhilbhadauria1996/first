import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\MicrosoftWebDriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");

	}

}
