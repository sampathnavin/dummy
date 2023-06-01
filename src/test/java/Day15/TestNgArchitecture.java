package Day15;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgArchitecture 

{
	
	// Your requirement any tags can be used 
	
	// Test Ng ARCH the flow will happen like this 
	
	// Before Test 1
	
	// Before Method 2
	
	// Test 3 
	
	// After Method 4 
	
	// After Test 5 
	
	
	
	@BeforeMethod public void deletecookies() {
	 System.out.println("Cookies Hitory deleted"); 
	 }

	
	@BeforeTest
	public void initilize()
	{
		System.out.println("Open Browser");
	}
	
	

	@Test
	public void tc1login()
	{
		System.out.println("Test Case 1 Executed");
	}

	@AfterTest
	public void closebrowser()
	{
		System.out.println("Browser has been closed");
	}
	
	
	@AfterMethod
	public void savethereports()
	{
		System.out.println("Report has been saved");
	}
	
	
	
}
