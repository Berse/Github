package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPaths.GithubPaths.*;

public class GithubPages {
    WebDriver driver = null;

    public GithubPages (WebDriver driver){
        this.driver = driver;
    }
    public void openGitUrl(){
        driver.get("https://github.com/");
    }
    public void clickOnSignUptn(){
        WebElement SignUp =driver.findElement(signUp);
        SignUp.click();
    }
    public void clickOnSTerms(){
        WebElement terms =driver.findElement(Terms);
        terms.click();
    }
    public void clickOnSPrivacy(){
        WebElement privacy =driver.findElement(Privacy);
        privacy.click();
    }


}
