package chromedev;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.openqa.selenium.devtools.v85.network.Network;

public class Chromedevclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	DevTools a=	driver.getDevTools();
		a.createSession();
		//send commands to CDP
a.send(Emulation.setDeviceMetricsOverride(500, 1000, 100, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
driver.get("https://rahulshettyacademy.com/angularAppdemo");
driver.findElement(By.xpath("/html/body/app-root/nav/button/span")).click();
//Thread.sleep(3000);
driver.findElement(By.xpath("//a[normalize-space()='Library']")).click();


		
		
	}

}
