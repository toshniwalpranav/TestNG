import org.testng.annotations.Test;

public class testdepend {
	@Test
	public void loginTest()
	{
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomepageTest()
	{
		System.out.println("Home page test");
	}
	

}
