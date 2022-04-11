package chromedev;

import java.util.Optional;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v98.network.model.Request;
import org.openqa.selenium.devtools.v98.network.model.Response;

public class Network1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools a=driver.getDevTools();
		a.createSession();
		a.send(Network.enable(Optional.empty(), Optional.empty(),Optional.empty()));
		a.addListener(Network.requestWillBeSent(), request->{
			
			org.openqa.selenium.devtools.v85.network.model.Request req=request.getRequest();
		//	System.out.println(req.getUrl());
		//	System.out.println(req.getUrlFragment());
			
		});
	
		a.addListener(Network.responseReceived(), response->{
			org.openqa.selenium.devtools.v85.network.model.Response res=response.getResponse();
			//System.out.println(res.getUrl());
			//System.out.println(res.getStatus());
			if(res.getStatus().toString().startsWith("2")) {
				
				System.out.println(res.getUrl()+" is the pass status code "+res.getStatus());
				
			}
			
		});
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo");
		driver.findElement(By.xpath("//button[normalize-space()='Virtual Library']")).click();
		
		
	}

	
	
}
