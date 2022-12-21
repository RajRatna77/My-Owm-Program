package Keywords;

import org.testng.annotations.Test;

public class Priority 
{
  
	@Test(priority=1)
	  public void SignUpPage() 
	  {
		  
		  System.out.println("This is SignUpPage ");
	  }
	  
	  @Test(priority=2)
	  public void LoginPage() 
	  {
		  
		  System.out.println("This is LoginPage");
	  }
	  
	  @Test(priority=3)
	  public void ForgotPasswordLink() 
	  {
		  
		  System.out.println("This is ForgotPasswordLink ");
	  }
	  
	  @Test(priority=4)
	  public void HomePage() 
	  {
		  
		  System.out.println("This is HomePage ");
	  }
	  
	  @Test(priority=5)
	  public void LogOutPage() 
	  {
		  
		  System.out.println("This is LogOutPage ");
	  }
}
