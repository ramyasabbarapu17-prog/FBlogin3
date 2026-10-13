package projectjulygeneric;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import projectjulybase.projectjulybaseC;

public class projectjulygenericC extends projectjulybaseC
{
	public static String captureScreenShot() throws IOException 
	{
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		//we are Takescreenshot as interface and upcasting driver as TakesScreenshot.
			
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
				
		File destfile=new File("C://KPHP//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
			
		return destfile.getAbsolutePath();
	}	

}
