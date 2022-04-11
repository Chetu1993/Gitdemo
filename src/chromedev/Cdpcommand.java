package chromedev;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.emulation.Emulation;

public class Cdpcommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools a=driver.getDevTools();
		a.createSession();
	 Map b=new HashMap();
	 b.put("width",400);
	 b.put("height", 1000);
	 b.put("deviceScaleFactor", 50);
	 b.put("mobile", true);
	 driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", b);
	 driver.get("https://rahulshettyacademy.com/angularAppdemo");
	 driver.findElement(By.xpath("/html/body/app-root/nav/button/span")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[normalize-space()='Library']")).click();

		
	}

}
