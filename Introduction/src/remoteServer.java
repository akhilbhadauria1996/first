import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remoteServer {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");  // set the browser in node
		dc.setPlatform(Platform.WINDOWS); // set the platform in node
		
		//WebDriver driver=new RemoteWebDriver(hosthubUrl,dc);
		WebDriver driver=new RemoteWebDriver(new URL("http://172.20.10.3:4444/wd/hub"),dc);
	    driver.get("http://google.com");  // now this will get openes in remote(node) machine	
		
	}

}
