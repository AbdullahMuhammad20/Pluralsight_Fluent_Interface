package pluralsight.pages.course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pluralsight.pages.AbstractPage;

public class CoursePage extends AbstractPage {

    private CourseActController    act;
    private CourseVerifyController verify;

    public CourseActController act(){
        return act;
    }

    public CourseVerifyController verify(){
        return verify;
    }



    private CoursePage(CourseActController act,CourseVerifyController verify){
        this.act = act;
        this.verify = verify;
    }

    public static CoursePage getCoursePage(){

        return new CoursePage(new CourseActController(),
                               new CourseVerifyController());
    }



}
