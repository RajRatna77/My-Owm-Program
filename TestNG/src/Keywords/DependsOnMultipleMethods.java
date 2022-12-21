package Keywords;

import org.testng.annotations.Test;

public class DependsOnMultipleMethods {
	@Test(dependsOnMethods= {"APIStudentLogin","MobileStudentLogin"}) 
	public void WebStudentLogin()  
	{  
		System.out.println("Student login through web");  
	}  
	
	@Test//(timeOut=1000)  
	public void MobileStudentLogin() //throws InterruptedException  
	{  
		System.out.println("Student login through mobile");
		//Thread.sleep(2000);
	}  
	
	@Test 
	public void APIStudentLogin()  
	{  
		System.out.println("Student login through API");  
	}  
}
