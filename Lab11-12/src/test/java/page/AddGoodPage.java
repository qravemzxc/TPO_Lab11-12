package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddGoodPage extends BasePage{
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]")
    private WebElement catalogButton;

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]/div/div/div/div[1]/div[3]/a[2]")
    private WebElement targetElement;

    @FindBy(xpath = "//*[@id=\"button-cart_17159\"]")
    private WebElement addtocartButton;

    @FindBy(xpath = "//*[@id=\"options-popup-input-option25836\"]")
    private WebElement sizeSelect;
    @FindBy(xpath = "//*[@id=\"options-popup-input-option25836\"]/option[3]")
    private WebElement sizeSelect1;
    @FindBy(xpath = "//*[@id=\"popup-checkout-button\"]")
    private WebElement addtocartButton1;
    @FindBy(xpath = "//*[@id=\"res-products\"]/div[1]/div[1]/div/div[1]/a/div[3]/div/div[1]")
    private WebElement movetoAdd;
    @FindBy(xpath = "//*[@id=\"popup-cart-inner\"]/div[4]/form/div/div/div[4]/div/input[3]")
    private WebElement inputCount;
    @FindBy(xpath = "//*[@id=\"popup-cart-inner\"]/div[4]/div/div[2]/a[2]")
    private WebElement cartClick;

    public AddGoodPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void AddingGoodToCart(String count) throws InterruptedException {
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(catalogButton).perform();
        targetElement.click();
        log.info("Target element is clicked");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", movetoAdd);
        log.info("Page is scrolled to the element 'movetoAdd'");
        actions.moveToElement(movetoAdd).perform();
        addtocartButton.click();
        log.info("Add to cart button is clicked");
        Thread.sleep(2000);
        sizeSelect.click();
        log.info("Size select is clicked");
        Thread.sleep(2000);
        sizeSelect1.click();
        log.info("Size select 1 is clicked");
        addtocartButton1.click();
        log.info("Add to cart button 1 is clicked");
        Thread.sleep(2000);
        inputCount.sendKeys(count);
        log.info("Count is entered: " + count);
        Thread.sleep(1000);
        cartClick.click();
        log.info("Cart is clicked");
        Thread.sleep(1000);
    }
}
