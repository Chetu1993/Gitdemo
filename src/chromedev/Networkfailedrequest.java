package chromedev;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v98.fetch.Fetch;
import org.openqa.selenium.devtools.v98.network.model.ErrorReason;

public class Networkfailedrequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools a=driver.getDevTools();
		a.createSession();
		Optional<List<RequestPattern>>patterns=Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"),Optional.empty(), Optional.empty())));
	a.send(Fetch.enable(patterns, Optional.empty()));
		
	a.addListener(Fetch.requestPaused(), request->{
		
		a.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
	});	
	driver.get("https://rahulshettyacademy.com/angularAppdemo");
	driver.findElement(By.xpath("//button[normalize-space()='Virtual Library']")).click();
	
	
		
		
		
	}

}
