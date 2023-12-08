package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginNegativeSteps {

    LoginPage loginPage = new LoginPage();
    @When("user should enter valid user name into the user name box")
    public void userShouldEnterValidUserNameIntoTheUserNameBox() {
        loginPage.userNameBox.sendKeys("username");
    }

    @And("user enters invalid {string} into the password box")
    public void userEntersInvalidIntoThePasswordBox(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @And("user should click the login box")
    public void userShouldClickTheLoginBox() {
        loginPage.loginButton.click();
    }

    @Then("user receives an error message and remains on the home page")
    public void userReceivesAnErrorMessageAndRemainsOnTheHomePage() {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }
}
