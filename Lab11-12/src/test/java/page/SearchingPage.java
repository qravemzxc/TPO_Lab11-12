package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchingPage extends BasePage{
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "//html/body/div[4]/header/div/div/div[2]/div/input")
    private WebElement inputField;
    @FindBy(xpath = "//*[@id=\"oct-search-button\"]")
    private WebElement searchBtn;

    public SearchingPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public void SearchGood(String title) throws InterruptedException {
        inputField.click();
        log.info("Input field is clicked");
        inputField.sendKeys(title);
        log.info("Title sent: " + title);
        searchBtn.click();
        log.info("Search button is clicked");
        Thread.sleep(3000);
    }
}
