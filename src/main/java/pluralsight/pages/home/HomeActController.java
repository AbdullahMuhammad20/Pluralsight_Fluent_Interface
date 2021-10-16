package pluralsight.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pluralsight.pages.DriverFactory.getChromeDriver;

public class HomeActController {

    WebDriver driver = getChromeDriver();
    public HomeActController search(String value){
        // Search and enter
        WebElement search =  driver.findElement(By.xpath("//input[contains(@id,'prism-search-input')]"));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
        return this;
    }
}
