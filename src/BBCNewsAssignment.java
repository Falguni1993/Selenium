import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNewsAssignment {

	        public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.bbc.com/");
			 List<WebElement> allNews = driver.findElements(By.xpath("//div[@class='most-popular']/div/ul/li"));
			System.out.println(allNews.size());
			
			//driver.findElement(By.xpath("//h3[text()='Ryanair boss threatens legal action over Flybe']")).click();
                //System.out.println("First title is " + driver.getTitle());
                for(int i = 0; i<allNews.size();i++)
                {
                	List<WebElement> allNews2 = driver.findElements(By.xpath("//div[@class='most-popular']/div/ul/li"));
                	 
                	allNews2.get(i).click();
                	System.out.println(driver.getTitle());
                	
                	driver.navigate().back();
                	Thread.sleep(5000);
                }

	}
	        

}
