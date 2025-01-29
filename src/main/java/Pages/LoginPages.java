package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPaths.GithubPaths.*;
import static ObjectsPaths.LoginPaths.*;

public class LoginPages {

    WebDriver driver = null;

    public LoginPages (WebDriver driver){
        this.driver = driver;
    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn(){
        WebElement SignInBtn =driver.findElement(signIn);
        SignInBtn.click();
    }

    public void fillEmail(){
        WebElement Email =driver.findElement(email);
        Email.sendKeys("bersealharbi@gmail.com");
    }

    public void fillPassword(){
        WebElement Password =driver.findElement(password);
        Password.sendKeys("Ab19!!19");
    }
    public void clickOnLoginInBtn(){
        WebElement Login =driver.findElement(signInBtn);
        Login.click();
    }

}
