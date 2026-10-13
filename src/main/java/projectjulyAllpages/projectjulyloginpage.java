package projectjulyAllpages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import projectjulybase.projectjulybaseC;

public class projectjulyloginpage extends projectjulybaseC
{


	
	public static By Username=By.xpath("//input[@name='username']");
	public static By password=By.xpath("//input[@name='password']");
	public static By submit=By.xpath("//button[@type='submit']");
	
	public static void Enter_EmailID(String Textusername)
	{
		
		driver.findElement(Username).sendKeys(Textusername);
	}
	
	public static void Enter_password(String Textpassword)
	{
		driver.findElement(password).sendKeys(Textpassword);
	}
	
	public static void clicksubmit()
	{
		driver.findElement(submit).click();
	}
	
	public static String captureScreenShot() throws IOException 
	{
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		//we are Takescreenshot as interface and upcasting driver as TakesScreenshot.
			
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
				
		File destfile=new File("C://kphp//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
			
		return destfile.getAbsolutePath();
	}	
	
}