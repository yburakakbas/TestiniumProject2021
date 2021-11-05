import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By shippingOptionLocator = By.id("freeShipmentOption");
    By productNameLocator = By.cssSelector("h3.productName ");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return  isDisplayed(shippingOptionLocator);
    }
// index deki ürüne tıkla
    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }
//sayfadaki elenmentleri bul
    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
