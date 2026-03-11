package Base;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass  {
	protected WebDriver driver;
	protected WebDriverWait wait;
 
	@BeforeMethod
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//driver.get("https://automationexercise.com/");
	}
 
	@AfterMethod()
	public void tearDown() {
		if (driver != null) {
			driver.quit();
			driver = null;
			wait = null;
		}
}
	}

