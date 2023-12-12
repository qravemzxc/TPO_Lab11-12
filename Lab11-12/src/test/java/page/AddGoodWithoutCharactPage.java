package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddGoodWithoutCharactPage extends BasePage{
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]")
    private WebElement catalogButton;

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]/div/div/div/div[1]/div[3]/a[2]")
    private WebElement targetElement;

    @FindBy(xpath = "//*[@id=\"button-cart_17159\"]")
    private WebElement addtocartButton;

    @FindBy(xpath = "//*[@id=\"popup-checkout-button\"]")
    private WebElement addtocartButton1;

    @FindBy(xpath = "//*[@id=\"res-products\"]/div[1]/div[1]/div/div[1]/a/div[3]/div/div[1]")
    private WebElement movetoAdd;
    public AddGoodWithoutCharactPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void AddingGoodToCart() throws InterruptedException {
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(catalogButton).perform();
        log.info("Catalog button is hovered");
        targetElement.click();
        log.info("Target element is clicked");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", movetoAdd);
        log.info("Page is scrolled to the element 'movetoAdd'");
        actions.moveToElement(movetoAdd).perform();
        log.info("Element 'movetoAdd' is hovered");
        addtocartButton.click();
        log.info("Add to cart button is clicked");
        Thread.sleep(2000);
        addtocartButton1.click();
        log.info("Second Add to cart button is clicked");
        Thread.sleep(2500);
    }
}
