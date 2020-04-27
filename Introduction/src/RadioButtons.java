import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		
	//	driver.findElement(By.xpath("//input[@value='Cheese']")).click();     // to check radio button based on it's radiobutton
		//driver.findElement(By.xpath("(//input[@name='group1'])[3]")).click();  // to check radio button by group name and indexing
		//when you might don's have a unique atttribute to get the xpath
		//driver.findElement(By.xpath("(//input[@name='group2'])[2]")).click();   // same as above
	//	System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());   // to get the count of radio buttons but in this we are using
		//driver.findelements instead of driver.findelement
		
		// to click on a button by not knowing it's attributes and without hardcoding anything
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)    // to select all the radiobuttons one by one
		{
		
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				
			}
		}
		
	}

}
