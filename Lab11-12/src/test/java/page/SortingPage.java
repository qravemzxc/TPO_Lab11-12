package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SortingPage extends BasePage{
    private final Logger log = LogManager.getLogger();

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]/a[1]")
    private WebElement catalogButton;

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]/div/div/div/div[1]/div[3]")
    private WebElement targetElement;

    @FindBy(xpath = "//*[@id=\"input-sort\"]")
    private WebElement priceSelect;

    @FindBy(xpath = "//*[@id=\"input-sort\"]/option[5]")
    private WebElement priceIncrease;

    public SortingPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void SortingOfGoodsByPrice() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(catalogButton).perform();
        log.info("Catalog button is hovered");
        targetElement.click();
        log.info("Target element is clicked");
        priceSelect.click();
        log.info("Price select is clicked");
        priceIncrease.click();
        log.info("Price increase select is clicked");
        Thread.sleep(2000);
    }
}
