package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FeedbackPage extends BasePage{
    private final Logger log = LogManager.getLogger();

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]/a[1]")
    private WebElement catalogButton;

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[5]/div/div/div/div[1]/div[3]")
    private WebElement targetElement;

    @FindBy(xpath = "//*[@id=\"res-products\"]/div[1]/div[1]/div/div[1]/a/div[3]/div/div[1]")
    private WebElement ringElement;

    @FindBy(xpath = "//*[@id=\"product-info-right\"]/div[2]/div[3]/div/span[2]/a")
    private WebElement addFeedbackBtn;

    @FindBy(xpath = "//*[@id=\"input-name\"]")
    private WebElement fioInput;

    @FindBy(xpath = "//*[@id=\"input-positive_text\"]")
    private WebElement dignitiesInput;
    @FindBy(xpath = "//*[@id=\"input-negative_text\"]")
    private WebElement disadvantagesInput;
    @FindBy(xpath = "//*[@id=\"input-review\"]")
    private WebElement feedbackInput;

    @FindBy(xpath = "//*[@id=\"form-review\"]/div[8]/div")
    private WebElement btnCont;

    @FindBy(xpath = "//*[@id=\"button-review\"]")
    private WebElement continueBtn;

    public FeedbackPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void AddFeedback(String fio, String dignities, String disadvantages, String feedback) throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(catalogButton).perform();
        log.info("Catalog button is hovered");
        targetElement.click();
        log.info("Target element is clicked");
        ringElement.click();
        log.info("Ring select is clicked");
        Thread.sleep(2000);
        addFeedbackBtn.click();
        log.info("Add button is clicked");
        Thread.sleep(2000);
        fioInput.sendKeys(fio);
        log.info("FIO sent: " + fio);
        Thread.sleep(1000);
        dignitiesInput.sendKeys(dignities);
        log.info("Dignities sent: " + dignities);
        Thread.sleep(1000);
        disadvantagesInput.sendKeys(disadvantages);
        log.info("Disadvantages sent: " + disadvantages);
        Thread.sleep(1000);
        feedbackInput.sendKeys(feedback);
        log.info("Feedback sent: " + feedback);
        Thread.sleep(1000);
        actions.moveToElement(continueBtn).click().perform();
        log.info("Continue button is clicked");
        Thread.sleep(2000);
    }
}
