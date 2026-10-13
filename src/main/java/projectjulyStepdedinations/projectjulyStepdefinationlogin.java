
package projectjulyStepdedinations;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projectjulyAllpages.projectjulyloginpage;
import projectjulybase.projectjulybaseC;
import projectjulygeneric.projectjulygenericC;

public class projectjulyStepdefinationlogin extends projectjulyloginpage

{
@Given("user is on login  page")
public static void  user_is_on_loginpage() throws IOException, InterruptedException
{
	browserInitzation();
	ExtentCucumberAdapter.addTestStepLog("application launched successfully");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulyloginpage.captureScreenShot());
}

@When("user enter valid username {string}")
public static void user_enter_valid_username(String Textusername) throws IOException
{
	 Enter_EmailID(Textusername);
		ExtentCucumberAdapter.addTestStepLog("User entered the firstnsme");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulyloginpage.captureScreenShot());
} 


@When("^user enters valid usernameM \"([^\"]*)\"$")
public static void userentersvalidusernameM(String Textpassword) throws IOException
{
Enter_password(Textpassword);
ExtentCucumberAdapter.addTestStepLog("User entered the username");
ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulyloginpage.captureScreenShot());
}



@When("user enter valid password {string}")
public static void user_enter_valid_password(String Textpassword) throws IOException
{
	Enter_password(Textpassword);ExtentCucumberAdapter.addTestStepLog("User entered the password");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulyloginpage.captureScreenShot());
}

@When("^user enters valid passwordM \"([^\"]*)\"$")
public static void userentersvalidpasswordM(String Textpassword) throws IOException
{
	Enter_password(Textpassword);
	Enter_password(Textpassword);
	ExtentCucumberAdapter.addTestStepLog("User entered the password");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(projectjulyloginpage.captureScreenShot());
}

@Then("click on submit")
public static void clicksubmitbutton() throws IOException
{
	clicksubmit();
	 browser_Close();
		
}
}
