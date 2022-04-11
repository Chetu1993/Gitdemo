package chromedev;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v99.fetch.Fetch;

public class Networkmocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools a=driver.getDevTools();
		a.createSession();
		a.send(Fetch.enable(Optional.empty(),Optional.empty()));
		a.addListener(Fetch.requestPaused(), request->{
			if(request.getRequest().getUrl().contains("shetty")) {
				
			String name=request.getRequest().getUrl().replace("=shetty", "=goodguy");
			System.out.println(name);
			
			
			a.send(Fetch.continueRequest(request.getRequestId(), name, request.getRequest(), Optional.empty(), Optional.empty(), Optional.empty()));
			}
			
			
			
			
		});
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo");
		driver.findElement(By.xpath("//button[normalize-space()='Virtual Library']")).click();
		
		
		
		
		
	}

}
