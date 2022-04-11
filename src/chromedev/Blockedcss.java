package chromedev;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v99.network.Network;

import com.google.common.collect.ImmutableList;

public class Blockedcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools a=driver.getDevTools();
		a.createSession();
		long starttime=System.currentTimeMillis();
		a.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		a.send(Network.setBlockedURLs(ImmutableList.of("*.css","*.jpg")));
		driver.get("https://rahulshettyacademy.com/angularAppdemo");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add to Cart']")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='sp']")).getText());
		long endtime=System.currentTimeMillis();
		System.out.println(endtime-starttime);
		
		
		
		
	}

}
