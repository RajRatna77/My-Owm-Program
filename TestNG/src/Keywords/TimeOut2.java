package Keywords;

import org.testng.annotations.Test;

public class TimeOut2 
{
	@Test(description="TestNG Learning")
	public void ContactVerify()
	{
	   System.out.println("Contact validation is successful");
	}
	@Test(timeOut = 1000,description="Its a Failed Test Case")
	public void LandingPage() throws InterruptedException
	{
	   System.out.println("Landing page verification is successful");
	   Thread.sleep(2000);
	}
	@Test(dependsOnMethods = { "LandingPage" })
	public void LoanContact()
	{
	   System.out.println("Loan contact details verification is successful");
	}
}
