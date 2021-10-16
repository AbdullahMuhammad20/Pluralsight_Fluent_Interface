package pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private DriverFactory(){
        // prevent instantiation
    }

    public static WebDriver getChromeDriver() {
        if (driver == null) {
            String chromePath = System.getProperty("user.dir") + "\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver",chromePath);

            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getWebDriverWait(){
        if (wait == null){
            wait = new WebDriverWait(getChromeDriver(),5);
        }
        return  wait;
    }


}
