import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9545075192");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Falguni@123");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).build().perform();
		/*WebElement mobile = driver.findElement(By.xpath("//*[text()='Computer Peripherals']"));
		act.moveToElement(mobile).build().perform();
	     driver.findElement(By.xpath("//*[text()='Designer Cases']")).click();*/
		
	   
		/*String actualTitle = driver.getTitle();
		String expectedTitle = "Mobile Phone Cases Covers Screenguards Store Online - Buy Mobile Phone Cases Covers Screenguards Online at Best Price in India | Flipkart.com";
		Assert.assertEquals(expectedTitle,actualTitle);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Mobile");
		List<WebElement> Allsearch =driver.findElements(By.tagName("a"));
		System.out.println(Allsearch.size());
		Allsearch.get(1).click();*/
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement Box =driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		List<WebElement> Allsearch = Box.findElements(By.tagName("a"));
		System.out.println(Allsearch.size());
		Allsearch.get(0).click();*/
		
		
		
	}
}
		/*driver.findElement(By.xpath("//ul[@class='QPOmNK']/li[2]/a[@title='Mi']")).click();
		List<WebElement> allmobiles = driver.findElements(By.xpath("//div[@class='_1HmYoV _35HD7C']//div[@class='col col-7-12']"));
		System.out.println("total mi mobles" + allmobiles.size());
		
		
		
		

	}*/


