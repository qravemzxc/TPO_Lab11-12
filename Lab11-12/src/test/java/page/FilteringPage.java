package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FilteringPage extends BasePage{
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "//html/body/div[4]/header/div/div/div[2]/div/input")
    private WebElement inputField;
    @FindBy(xpath = "//*[@id=\"oct-search-button\"]")
    private WebElement searchBtn;
    @FindBy(xpath = "//*[@id=\"input-limit\"]")
    private WebElement filterBtn;
    @FindBy(xpath = "//*[@id=\"input-limit\"]/option[4]")
    private WebElement optionBtn;
    public FilteringPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public void FilteringGoods(String title) throws InterruptedException {
        inputField.click();
        log.info("Input field is clicked");
        inputField.sendKeys(title);
        log.info("Title sent: " + title);
        searchBtn.click();
        log.info("Search button is clicked");
        Thread.sleep(2000);
        filterBtn.click();
        log.info("Filter button is clicked");
        optionBtn.click();
        log.info("Option button is clicked");
        Thread.sleep(2000);
    }
}
