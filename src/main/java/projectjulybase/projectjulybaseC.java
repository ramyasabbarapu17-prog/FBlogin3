package projectjulybase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class projectjulybaseC 
{


	public static String browser="chrome";
	public static String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static WebDriver driver;
	
	public static void browserInitzation() throws InterruptedException 
	{
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();	
			 driver= new ChromeDriver();
				 driver.get(URL);
				 Thread.sleep(4000);
			 
			 break;
			 
		case "IE":
			 WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
			 break;	
			 
		
		}
		
	}
	public static void browser_Close()
	{
		driver.close();
	}
	
	

}
