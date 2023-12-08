package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPositiveSteps {
    LoginPage loginPage = new LoginPage();
    @Given("user goes to login page")
    public void userGoesToLoginPage()  {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("user enters own invalid user name into the user name box")
    public void userEntersOwnInvalidUserNameIntoTheUserNameBox() {
        loginPage.userNameBox.sendKeys(ConfigReader.getProperty("username"));
    }

    @And("user enters own invalid user password into the password box")
    public void userEntersOwnInvalidUserPasswordIntoThePasswordBox() {
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("user clicks the login box")
    public void userClicksTheLoginBox() {
        loginPage.loginButton.click();
    }

    @Then("user goes to home page")
    public void userGoesToHomePage() {
        String expectedTitle = "Products";
        Assert.assertEquals(expectedTitle,loginPage.title.getText());
    }
}
