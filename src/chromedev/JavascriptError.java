package chromedev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.idealized.log.model.LogEntry;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

public class JavascriptError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools a=driver.getDevTools();
		a.createSession();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("2");
		LogEntries log=driver.manage().logs().get(LogType.BROWSER);
		List<org.openqa.selenium.logging.LogEntry>hello=log.getAll();
		for(org.openqa.selenium.logging.LogEntry e:hello) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
	}

}
