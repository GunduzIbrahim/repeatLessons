package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy (id= "user-name")  public WebElement userNameBox;
    @FindBy (id= "password")   public WebElement passwordBox;
    @FindBy (id = "login-button") public WebElement loginButton;
    @FindBy (className = "title") public WebElement title; //@FindBy (xpath = "//*[@class='title']")
    @FindBy (xpath = "//h3[@data-test='error']") public WebElement errorMessage;
}
