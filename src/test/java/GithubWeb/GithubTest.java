package GithubWeb;

import Base.BaseClass;
import Pages.GithubPages;
import Pages.HomePages;
import Pages.LoginPages;

import org.testng.annotations.Test;


public class GithubTest extends BaseClass {


    @Test
    public void signUpethod() throws InterruptedException{
        GithubPages signup = new GithubPages(driver);

        signup.openGitUrl();
        Thread.sleep(3000); // Wait for 3 seconds
        signup.clickOnSignUptn();
        Thread.sleep(3000); // Wait for 3 seconds
        signup.clickOnSTerms();
        signup.clickOnSPrivacy();
        Thread.sleep(3000); // Wait for 3 seconds
    }

    @Test
    public void loginPageMethod() throws InterruptedException{
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        Thread.sleep(3000); // Wait for 3 seconds
        login.clickOnSignInBtn();
        Thread.sleep(3000); // Wait for 3 seconds
        login.fillEmail();
        login.fillPassword();
        login.clickOnLoginInBtn();
        Thread.sleep(3000); // Wait for 3 seconds
    }
    @Test
    public void createRepoMethod() throws InterruptedException {
        HomePages home = new HomePages(driver);

        loginPageMethod();
        home.clickOnNewRepo();
        home.fillRepoName();
        Thread.sleep(2000);
        home.scrollToPosition(0,600);
        home.clickCreateRepo();
        Thread.sleep(5000);
    }

}
