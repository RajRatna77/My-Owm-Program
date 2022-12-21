package Keywords;

import org.testng.annotations.Test;

public class DependsOnMethod 
{
	@Test(timeOut=1000)
	public void WebStudentLogin() throws InterruptedException  
	{  
		System.out.println("Student login through web");  
		Thread.sleep(2000);
	}  
	
	@Test  
	public void MobileStudentLogin()
	{  
		System.out.println("Student login through mobile");
		
	}  
	
	@Test(dependsOnMethods= {"WebStudentLogin"})  
	public void APIStudentLogin()  
	{  
		System.out.println("Student login through API");  
	}  
}
