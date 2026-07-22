import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class passparamater {
    @Test
    @Parameters({"username", "password"})
    public void setup(String username, String password) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usernameField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        usernameField.sendKeys(username);

        WebElement passwordField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        passwordField.sendKeys(password);

        WebElement submitButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        submitButton.submit();
    }
}