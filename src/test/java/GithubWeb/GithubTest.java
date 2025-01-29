package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;


public class GithubTest extends BaseClass {

    @Test
    public void loginPageMethod() throws IllegalAccessException{
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(); // Print error (optional)
        }

        login.clickOnSignInBtn();
        login.checkTerms();
        login.checkPrivacy();
    }

}
