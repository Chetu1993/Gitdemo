package chromedev;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class geolocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
DevTools a=driver.getDevTools();		
a.createSession();
Map b=new HashMap();
b.put("latitude", 52);
b.put("longitude", 12);
b.put("accuracy", 1);
driver.executeCdpCommand("Emulation.setGeolocationOverride", b);
driver.get("https://google.com");
driver.findElement(By.name("q")).sendKeys("moneycontrol",Keys.ENTER);
driver.findElement(By.xpath("//h3[normalize-space()='Moneycontrol']")).click();

		
		
		
		
		
		
		
		
	}

}
