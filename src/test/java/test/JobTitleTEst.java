package test;

import com.pages.AddJobTitle;
import com.pages.JathuDashBoad;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class JobTitleTEst extends TestBase {
    @Test
    public void SaveJobTitleTest() {
        softAssert = new SoftAssert();

        AddJobTitle.ClickAdminJob();
        AddJobTitle.ClickAdminJobTitle();



        softAssert.assertTrue(AddJobTitle.isDisplayTitleHeader(), "Job Title is not Displayed");
        AddJobTitle.ClickAddButton();
        softAssert.assertTrue(AddJobTitle.isDisplayAddJobTitleHeader(), "JobAdd  Title is not Displayed");
        AddJobTitle.setJobTitle("QA");
        AddJobTitle.setJobDescription("Test jathu");
        AddJobTitle.setNote(" Noteed ");

    }
}
