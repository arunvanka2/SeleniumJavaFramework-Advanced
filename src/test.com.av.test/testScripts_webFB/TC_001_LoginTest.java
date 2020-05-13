package testScripts_webFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_001_LoginTest {

    //Global Variable
    private WebDriver driver= null;
@BeforeTest

    public void Initialize() {

//    System.setProperty("webdriver.firefox.marionett","C:\\Users\\Admin\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//    WebDriver driver = new FirefoxDriver();


}


@Test
    public void LoginTest() throws InterruptedException {
    String TestURL = "https://flybuys.co.nz";

    System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Projects\\SeleniumJavaFrameworkAdvanced\\src\\com\\av\\framework\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to(TestURL);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


// Step 1
    driver.findElement(By.id("signin_btn")).click();

    }
}
