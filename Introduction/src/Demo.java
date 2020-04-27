import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// selenium code
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	//driver.get("http://yahoo.com");
	//System.out.println(driver.getCurrentUrl());
driver.navigate().back();
System.out.println(driver.getCurrentUrl());
driver.navigate().forward();
	//System.out.println(driver.getCurrentUrl());
	//driver.close(); //closes current bowser
	//driver.quit(); // closes all selenium browsers : used when we arewoeking with child windows
		
		//driver.get("http://facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten account?")).click();
		*/
		
	/*	driver.findElement(By.xpath("//*[@id=\'email']")).sendKeys("emailid");
	driver.findElement(By.cssSelector("input#pass.inputtext")).sendKeys("password");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.cssSelector("input#u_0_2")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'globalContainer\']/div[3]/div/div/div")).getText());
	
		/* 
		   Writing Customized xpath :

Using Attributes .//tagName[@attribute=‘value’]
Any attribute can be used but try to select a unique one


Ex--- 
<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2">

Xpath = //input[@type=’submit’] ------ ao access attribute of particular tag

Xpath = //*[@type=’submit’]   ------- when you are confused about tagname


REgular expression for xpath-   when attribute is changing like username to username123

//tagName[contains(@attribute,’value’]
		 
		 *  Writing Customized css :
		 

Using Attributes .  -  tagName[attribute=‘value’]
Any attribute can be used but try to select a unique one

Alternate syntax for css ===  tagname#ID
Alternate syntax for css ===  tagname.classname

Tagname can be avoided

REgular expression for css -   when attribute is changing like username to username123

tagName[attribute*=’value’]     */
		
	/*	
	//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my custom css");
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("my css");
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("password");
	//driver.findElement(By.cssSelector("input[value='Log In']")).click();
	driver.findElement(By.cssSelector("#u_0_2")).click();
	
	
		
		driver.get("https://www.rediff.com");
		//driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();    // by css regular expression
		driver.findElement(By.cssSelector("input#login1")).sendKeys("test");  //by  tagname#ID
		driver.findElement(By.xpath("//input[contains(@id,'passwo')]")).sendKeys("password");  // by xpath regular expression
		driver.findElement(By.cssSelector("input[name*='procee']")).click();
		
		
		
		
		//parent child relation ===== Parent child relationship is used when you can not create a xpath because of no unique attributes then ypu find the parent and take it’s xpath and then add then traverse towards child using \. like --
		//*[@class='a4bIc']/div/input
		driver.get("http://www.google.com");
		//driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("test");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("chropath plugin");


		
		driver.get("http://www.qaclickacademy.com/interview.php");
		//driver.findElement(By.xpath("//div/div//div/div/ul/li[1]/following-sibling::li[2]")).click();    // traversing from sibling tosibling
		//driver.findElement(By.xpath("//div/div//div/div/ul/li[1]/parent::ul")).click();  // traversing back from child to parent
	
	     driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();   //  identifyiing xpath with text -- //*[text()='text value']
	*/}
	

}
