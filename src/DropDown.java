import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		WebElement dropDown =driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
		dropDown.sendKeys("July");
		//Select s = new Select(dropDown);
		//s.selectByVisibleText("July");
		//s.selectByIndex(2);
		//s.selectByValue("4");
		//System.out.println(s.isMultiple());
	}

}
