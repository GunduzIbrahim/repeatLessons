package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy (id = "add-to-cart-sauce-labs-backpack") public WebElement addBackPack;
    @FindBy (id = "remove-sauce-labs-backpack") public WebElement removeBackPack;
    @FindBy (id = "add-to-cart-sauce-labs-fleece-jacket") public WebElement addFleeceJacket;
    @FindBy (id = "remove-sauce-labs-fleece-jacket") public WebElement removeFleeceJacket;
    @FindBy (className = "shopping_cart_link") public WebElement shoppingCart;
    @FindBy (className = "shopping_cart_badge") public WebElement shoppingCartBadge;
}
