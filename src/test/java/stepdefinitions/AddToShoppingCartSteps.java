package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AddToShoppingCartSteps {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    int cartBadge = 0;
    @When("user login with valid user name and password")
    public void userLoginWithValidUserNameAndPassword(){
        loginPage.userNameBox.sendKeys(ConfigReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
    }
    @And("user clicks backpack add to cart button")
    public void userClicksBackpackAddToCartButton() {
        homePage.addBackPack.click();
        cartBadge= cartBadge+1;
    }

    @And("user clicks fleece Jacket add to cart button")
    public void userClicksFleeceJacketAddToCartButton() {
        homePage.addFleeceJacket.click();
        cartBadge= cartBadge+1;
    }

    @Then("user allows the number above the cart icon increases by one")
    public void userAllowsTheNumberAboveTheCartIconIncreasesByOne() {
        int expectedValue = Integer.parseInt(homePage.shoppingCartBadge.getText());
        Assert.assertEquals(expectedValue, cartBadge);
    }
}
