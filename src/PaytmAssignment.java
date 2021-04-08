import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaytmAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		//how many iframes you have
		//put explicit wait for food wallet
		//click on login
		
	    //Actions act= new Actions(driver);
	    //act.sendKeys(Keys.PAGE_UP).build().perform();
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total iFrames"+ allFrames.size());
		for(int i=0; i< allFrames.size();i++)
		{
			driver.switchTo().frame(i);
			System.out.println(driver.findElements(By.xpath("//input[@name='username']")).size());
			System.out.println(driver.findElements(By.xpath("//span[text()='Login/Signup with mobile number and password']")).size());
		driver.switchTo().defaultContent();
		}
		
		
		
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		//WebDriverWait wait =new WebDriverWait(driver,20);
	 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login/Signup with mobile number and password']")));

			Thread.sleep(5000);
			driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9766110866");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reebok87");
		driver.findElement(By.xpath("//span[@class='ng-scope']")).click();
	

	}

}
