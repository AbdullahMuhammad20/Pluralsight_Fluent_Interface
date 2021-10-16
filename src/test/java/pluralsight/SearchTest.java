package pluralsight;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pluralsight.pages.*;
import pluralsight.pages.course.CoursePage;
import pluralsight.pages.home.HomePage;
import pluralsight.pages.search.SearchPage;
import pluralsight.pages.search.SkillLevel;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static pluralsight.pages.CommonVerification.getCommonVerification;
import static pluralsight.pages.course.CoursePage.*;
import static pluralsight.pages.home.HomePage.getHomePage;
import static pluralsight.pages.search.SearchPage.getSearchPage;

public class SearchTest extends AbstractPage {

    HomePage home =  getHomePage();
    SearchPage searchPage = getSearchPage();
    CoursePage coursePage = getCoursePage();
    CommonVerification common = getCommonVerification();
    @Test
    public void basicFilterByTest() throws InterruptedException {
        // Search
        home.act().search("Java");

        //Filter functions
        searchPage.act()
                .filterBySkillLevel(SkillLevel.BEGINNER)
                .selectCourse("Java Fundamentals: The Java Language");

        // Course page Assertion
        coursePage.verify().startCourseButton().courseDownloadButton();

        List<String> courseList =  searchPage.get().course();

        assertThat(courseList)
                .hasSize(25)
                .containsOnlyOnce("Java Fundamentals: The Java Language")
                .doesNotContain("Python");

    }

}
