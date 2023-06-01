package Day15;

import org.testng.annotations.Test;

public class TestNGOptions {
	
	
	@Test(invocationCount = 10 , invocationTimeOut = 1000)
	public void click()
	{
		System.out.println("Click 5 times");
	}

}
