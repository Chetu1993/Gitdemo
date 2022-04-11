package chromedev;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v99.network.model.ConnectionType;

public class NetworkSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools a=driver.getDevTools();
		a.createSession();
		a.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		a.send(Network.emulateNetworkConditions(true, 10000, 20000, 20000, Optional.of(ConnectionType.ETHERNET)));
		a.addListener(Network.loadingFailed(), loadingFailed->{
			
			System.out.println(loadingFailed.getErrorText());
			System.out.println(loadingFailed.getTimestamp());
		}
		
				
				);
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("/html/body/app-root/app-landingpage/div/button")).click();
		
		
		
		
		
	}

}
