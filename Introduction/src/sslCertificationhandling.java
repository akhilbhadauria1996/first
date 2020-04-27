import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class sslCertificationhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SSl certificates

		//Desired capabilities=
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();// capabiities is used to create general chrome profile
		//desired capabilities is a class which helps you to customize your chrome browser and pass the capabilities to your chrome options
		
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belongss to your local browser
		ChromeOptions c= new ChromeOptions(); // this is our localbrowser object
		// chromeoptions is use to set our local browser settings
		c.merge(ch);  //adding capbilities to your chrome browser // integrating chrome profilr to our locl chromebrowser
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver=new ChromeDriver(c);
		
	}

}
