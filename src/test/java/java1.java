import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class java1 {

WebDriver driver;
	

	@BeforeMethod
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

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
}