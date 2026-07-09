import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 {

	/*	
	WebDriver driver;
	

	@BeforeMethod
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
*/
	
/*	
	
WebDriver driver;
	
              //1  //4  //7
	@BeforeMethod
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	//2
	@Test
	public void Test1() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	//5
	@Test
	public void Test2() {
		driver.get("https://orangehrm.com/");
	
	}
	   //8
	@Test
	public void test3() {
		driver.get("http://www.google.com");
		WebElement b = driver.findElement(By.linkText("Gmail"));
	}
	
	//3  //6  //9
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
*/
/*
	
WebDriver driver;
	
      
	@BeforeMethod
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	
	@Test(priority=1)
	public void Test1() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	@Test(priority=3)
	public void Test2() {
		driver.get("https://orangehrm.com/");
	
	}
	   
	@Test(priority=2)
	public void test3() {
		driver.get("http://www.google.com");
		WebElement b = driver.findElement(By.linkText("Gmail"));
	}
	
	@Test(priority=5)
	public void test4()
	{
		System.out.println("test4");
	}
	
	
	@Test(priority=6)
	public void test5()
	{
		System.out.println("test5");
	}
	
	@Test(priority=4)
	public void test6()
	{
		System.out.println("test6");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	*/
	/*
WebDriver driver;
	
      
	@BeforeMethod
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	
	@Test(priority=1,groups="link test")
	public void Test1() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	@Test(priority=3,groups="visit orangehrm")
	public void Test2() {
		driver.get("https://orangehrm.com/");
	
	}
	   
	@Test(priority=2,groups="Link test")
	public void test3() {
		driver.get("http://www.google.com");
		WebElement b = driver.findElement(By.linkText("Gmail"));
	}
	
	@Test(priority=5,groups="test")
	public void test4()
	{
		System.out.println("test4");
	}
	
	
	@Test(priority=6,groups="test")
	public void test5()
	{
		System.out.println("test5");
	}
	
	@Test(priority=4,groups="test")
	public void test6()
	{
		System.out.println("test6");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	*/
	
}




