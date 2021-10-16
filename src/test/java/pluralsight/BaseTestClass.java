package pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

public class BaseTestClass {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void startUpBrowser() {

        driver = getChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

        wait = getWebDriverWait();
    }

    @BeforeMethod
    public void goToHome(){
        driver.navigate().to("https://app.pluralsight.com/library/");
        // Login locators
        WebElement username = driver.findElement(By.xpath("(//input[contains(@class,'psds-text-input__field psds-text-input__field--appearance-subtle')])[1]"));
        username.sendKeys("abdmohamed033@gmail.com");
        username.sendKeys(Keys.TAB);

        WebElement password = driver.findElement(By.xpath("(//input[contains(@class,'psds-text-input__field psds-text-input__field--appearance-subtle')])[2]"));
        password.sendKeys("Z4i-B^jKBf(nD7_");
        password.sendKeys(Keys.TAB);

        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Sign in')]"));
        btnLogin.click();
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser(){
       driver.close();
    }
}
