	//validation - which we getting we require or not

	import io.github.bonigarcia.wdm.WebDriverManager;
	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Test;
	
public class testcase3 {

	  WebDriver driver;

	@BeforeMethod
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	@Test(priority=1)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(actual, expected);
		Assert.assertEquals(title, "Google","title is not match");
		
	}
	
	@Test(priority=2)
	public void googleTitleTest2() {
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(actual, expected);
		Assert.assertEquals(title, "Google12","title is not match");
		
	}
	
	@Test(priority=3)
	public void button() {
		boolean b = driver.findElement(By.xpath("//input[@name='btnK']")).isDisplayed();
		Assert.assertTrue(b);
		//Assert.assertEquals(b, true);
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	}
	

