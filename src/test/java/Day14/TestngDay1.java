package Day14;

import org.testng.annotations.Test;

public class TestngDay1 {
	
	@Test(priority = 1)
	public void firsttestng()
	{
		System.out.println("First Code in TestNg");
	}
	
	@Test(priority = 2)
	public void Secondtestng()
	{
		System.out.println("Second Code in TestNg");
	}
	
	@Test(priority = 3)
	public void Thirdtestng()
	{
		System.out.println("Third Code in TestNg");
	}
	
	@Test(priority = 4)
	public void Fourthtestng()
	{
		System.out.println("Fourth Code in TestNg");
	}

}
