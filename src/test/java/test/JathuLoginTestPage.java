package test;

import com.pages.JathuDashBoad;
import com.pages.JathuLogin;
import com.pages.JatuAddUser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class JathuLoginTestPage extends TestBase {

    @Test
    public void LoginTest(){
        softAssert = new SoftAssert();
       // softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");


        JathuLogin.SetUserName("Admin");
        JathuLogin.Setpass("admin123");
        JathuLogin.ClickLogin();
        JathuDashBoad.ClickAdmin();
        JathuDashBoad.ClickUserManagenment();
        JathuDashBoad.ClickUser();
        JathuDashBoad.ClickAdd();



//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ADD USER >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        JatuAddUser.UserEmployeName("Varman");
        JatuAddUser.UserUserName("jathumithran");
        JatuAddUser.UserAddpassword("Jathumithran@123");
        JatuAddUser.UserAddConformPassword("Jathumithran@123");
        JatuAddUser.UserAddClick();

    }

}
