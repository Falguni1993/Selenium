import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("falguni.tundurwar@gmail.com");
driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
System.out.println("Total iframes" + allFrames.size());
for(int i = 0; i<allFrames.size();i++)
{
	driver.switchTo().frame(i);
	System.out.println(driver.findElements(By.xpath("//input[@class='whsOnd zHQkBf'][@name='password']")).size());
driver.switchTo().defaultContent();
}
//WebDriverWait wait =new WebDriverWait(driver,10);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Welcome']")));
//driver.switchTo().frame(0);

driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][@name='password']")).sendKeys("Falguni@123");
driver.findElement(By.xpath("//span[text()='Next']")).click();


}
}
