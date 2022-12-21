package Keywords;

import org.testng.annotations.Test;

public class TimeOut 
{
	
	  public void SignUpPage() //throws InterruptedException 
	  {
		//Thread.sleep(3000); 
		  System.out.println("This is SignUpPage ");
		  
	  }
	  
	  @Test
	  public void LoginPage() 
	  {
		  
		  System.out.println("This is LoginPage");
	  }
	  
	  @Test
	  public void ForgotPasswordLink() 
	  {
		  
		  System.out.println("This is ForgotPasswordLink ");
	  }
	  
	  @Test
	  public void HomePage() 
	  {
		  
		  System.out.println("This is HomePage ");
	  }
	  
	  @Test(timeOut=2000,description="Session Expired")
	  public void LogOutPage() throws InterruptedException 
	  {
		  
		  System.out.println("This is LogOutPage ");
		  Thread.sleep(3000);
	  }
}
