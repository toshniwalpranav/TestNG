
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LoginOrangeHrmF {
		
		WebDriver driver;
	    int i = 1;
	    
	    @BeforeClass
	    public void setup() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }
		
       @BeforeMethod
       public void count() {
    	   System.out.println("Test case" + i);
    	   
       }
		
		@Test
		public void username() throws InterruptedException {
			WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys("Admin");
			Thread.sleep(2000);
				
		}	
			
		
		@Test(dependsOnMethods="username")
		public void password() throws InterruptedException 
		{
			WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("admin123");
			Thread.sleep(2000);
			
		}
		
		@Test(dependsOnMethods="password")
		public void submit() throws InterruptedException {
			WebElement element= driver.findElement(By.xpath("//button[@type='submit']"));
			element.submit();
			Thread.sleep(2000);
			
		}
		

		@AfterMethod
		public void tearDown() {
			i++;
		}
		
			



}
