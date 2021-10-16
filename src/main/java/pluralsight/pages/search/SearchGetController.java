package pluralsight.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static org.testng.Assert.assertTrue;
import static pluralsight.DriverFactory.getChromeDriver;


public class SearchGetController {
    WebDriver driver = getChromeDriver();

    public List<String> course(){
        List<WebElement> course = driver.findElements(By.xpath(""));

        assertTrue(course.size() !=0 ,"List is empty, failed to collect courses");

        return  course.stream()
                .map(WebElement::getText)
                .collect(toList());
    }
}
