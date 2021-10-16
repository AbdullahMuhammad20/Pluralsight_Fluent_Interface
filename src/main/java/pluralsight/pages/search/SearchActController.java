package pluralsight.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;
import static pluralsight.pages.DriverFactory.getChromeDriver;
import static pluralsight.pages.DriverFactory.getWebDriverWait;

public class SearchActController {
    WebDriver driver =  getChromeDriver();
    WebDriverWait wait =  getWebDriverWait();

    public SearchActController filterBySkillLevel(SkillLevel value){
        driver.findElement(By.xpath("(//span[contains(.,'All levels')])[3]")).click();
        By skillFilter = By.xpath("(//span[contains(.,'"+value+"')])");
        wait.until(visibilityOfAllElementsLocatedBy(skillFilter));
        driver.findElement(skillFilter).click();
        //explicitWait();
        //Thread.sleep(2000);
        return this;
    }


    public void selectCourse(String courseName) throws InterruptedException {
        // Select course by name
        driver.findElement(By.xpath("(//span[contains(.,'"+courseName+"')])")).click();
        Thread.sleep(2000);
    }

/*
    public void filterByRole(String role) throws InterruptedException {
        // Role Locator
        driver.findElement(By.xpath("//a[contains(.,'Roles')]")).click();
        By roleFilter = By.xpath("(//span[@class='search-filter-option-text'][contains(.,'Software Development')])[1]");

        wait.until(visibilityOfAllElementsLocatedBy(roleFilter));
        driver.findElement(roleFilter).click();
        Thread.sleep(2000);
    }

    public void selectTab(){
        // Select tab course
        driver.findElement(By.xpath("//a[contains(@data-categories,'course')]")).click();

    }
    */
}
