package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToUndefinedGoodPage extends BasePage{
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]")
    private WebElement catalogButton;

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]/div/div/div/div[1]/div[3]/a[2]")
    private WebElement targetElement;

    @FindBy(xpath = "//*[@id=\"res-products\"]/div[1]/div[1]/div/div[1]/a/div[3]/div/div[1]")
    private WebElement ringElement;

    public GoToUndefinedGoodPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void GoToUndefinedGood() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(catalogButton).perform();
        log.info("Catalog button is hovered");
        targetElement.click();
        log.info("Target element is clicked");
        ringElement.click();
        log.info("Ring select is clicked");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.history.pushState('', '', arguments[0])", "https://rockbastion.by/ukrasheniya/kolca_lityye/17159/qwe");
        log.info("URL changed using JavaScript");
        Thread.sleep(1000);
        actions.sendKeys(Keys.ENTER).perform();
        log.info("Enter key is pressed");
        driver.get("https://rockbastion.by/ukrasheniya/kolca_lityye/17159/qwe");
        log.info("Navigated to the undefined good page");
        Thread.sleep(3000);
    }
}
