import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gridView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// add runs scored by each batsman
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20-pakistan-v-sri-lanka-in-uae-2017");
		
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20710/eng-vs-pak-2nd-odi-pakistan-tour-of-england-2019");
	int sum=0;
		WebElement table=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int rowcount=table.findElements(By.xpath("//div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size(); //parent to child 
		
			for(int i=0;i<count-2;i++)
			{
				//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
	             String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();		
			     int intvalue=Integer.parseInt(value); // convert string to int
			     sum=sum+intvalue;
			    // System.out.println(sum);
			}
			//System.out.println(sum);
			//System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText()); // child to sibling
			String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
			int intExtras=Integer.parseInt(extras);
			sum=sum+intExtras;
			//System.out.println(sum);
			//System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
			String Actualvalue= driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
			int Actualvaluetotal=Integer.parseInt(Actualvalue);
			if(sum==Actualvaluetotal)
			{
				System.out.println("sum matches");
				
			}
			else {
				
				System.out.println("sum failed");
			}
			
			
			
			
			
	
	}

}
