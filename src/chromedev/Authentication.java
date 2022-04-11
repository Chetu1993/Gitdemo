package chromedev;


import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import com.google.common.base.Predicate;

import java.net.URI;


public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cks_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools a=driver.getDevTools();
		a.createSession();
		Predicate<URI>uriPredicate=uri->uri.getHost().contains("httpbin.org");
		((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo","bar"));
	driver.get("https://httpbin.org/basic-auth/foo/bar");
	System.out.println("hello");
		
		
		
		
	}

	

}
