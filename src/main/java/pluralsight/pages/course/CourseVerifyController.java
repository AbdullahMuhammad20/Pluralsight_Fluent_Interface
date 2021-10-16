package pluralsight.pages.course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static pluralsight.DriverFactory.getChromeDriver;

public class CourseVerifyController {
    private WebDriver driver =  getChromeDriver();

    public  CourseVerifyController startCourseButton(){
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(@class,'course-hero__button')]")).isDisplayed());
         return this;
    }
    public  CourseVerifyController courseDownloadButton(){
            Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@class,'download---2i_9z')]")).isDisplayed());
          return  this;
    }

}
