package Keywords;

import org.testng.annotations.Test;

public class Enabled 
{
	@Test
	  public void SignUpPage() 
	  {
		  
		  System.out.println("This is SignUpPage ");
	  }
	  
	  @Test
	  public void LoginPage() 
	  {
		  
		  System.out.println("This is LoginPage");
	  }
	  
	  @Test(enabled=false)
	  public void ForgotPasswordLink() 
	  {
		  
		  System.out.println("This is ForgotPasswordLink ");
	  }
	  
	  @Test
	  public void HomePage() 
	  {
		  
		  System.out.println("This is HomePage ");
	  }
	  
	  @Test
	  public void LogOutPage() 
	  {
		  
		  System.out.println("This is LogOutPage ");
	  }
}
