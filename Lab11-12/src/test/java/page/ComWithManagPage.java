package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComWithManagPage extends BasePage{
    private final Logger log = LogManager.getLogger();
    @FindBy(xpath = "//*[@id=\"ts-mw-id\"]/div[2]/i")
    private WebElement chatBtn;
    @FindBy(xpath = "//*[@id=\"ts-mw-id\"]/div[3]/ul/li[5]/a")
    private WebElement chatBtn1;
    @FindBy(xpath = "//*[@id=\"jcont\"]/jdiv[3]/jdiv[3]/jdiv/jdiv[1]/jdiv/jdiv[1]/textarea")
    private WebElement mesInp;

    @FindBy(xpath = "//*[@id=\"jcont\"]/jdiv[3]/jdiv[3]/jdiv/jdiv[1]/jdiv/jdiv[2]/jdiv")
    private WebElement mesSend;
    @FindBy(xpath = "  //*[@id=\"jcont\"]/jdiv[3]/jdiv[2]/jdiv[1]/jdiv/jdiv[2]/jdiv[1]/jdiv[1]/jdiv/jdiv[4]/jdiv/jdiv[1]")
    private WebElement nameField;
    @FindBy(xpath = "//*[@id=\"jcont\"]/jdiv[3]/jdiv[2]/jdiv[1]/jdiv/jdiv[2]/jdiv[1]/jdiv[1]/jdiv/jdiv[4]/jdiv/jdiv[1]/input")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"jcont\"]/jdiv[3]/jdiv[2]/jdiv[1]/jdiv/jdiv[2]/jdiv[1]/jdiv[1]/jdiv/jdiv[4]/jdiv/jdiv[2]/input")
    private WebElement numberInput;

    @FindBy(xpath = "//*[@id=\"jcont\"]/jdiv[3]/jdiv[2]/jdiv[1]/jdiv/jdiv[2]/jdiv[1]/jdiv[1]/jdiv/jdiv[4]/jdiv/jdiv[3]/input")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"jcont\"]/jdiv[3]/jdiv[2]/jdiv[1]/jdiv/jdiv[2]/jdiv[1]/jdiv[1]/jdiv/jdiv[4]/jdiv/jdiv[4]")
    private WebElement sendBtn;


    public ComWithManagPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public void ComWithManag(String fio, String phoneNumber, String email) throws InterruptedException {
        Thread.sleep(5000);
        log.info("Waiting for 5 seconds");
        chatBtn.click();
        log.info("Chat button is clicked");
        Thread.sleep(1000);
        chatBtn1.click();
        log.info("Second chat button is clicked");
        Thread.sleep(1000);
        mesInp.sendKeys("qwe");
        log.info("Message input is filled with 'qwe'");
        Thread.sleep(1000);
        mesSend.click();
        log.info("Message send button is clicked");
        Thread.sleep(2000);
        nameField.click();
        log.info("Name field is clicked");
        nameInput.sendKeys(fio);
        log.info("Name input is filled with: " + fio);
        numberInput.sendKeys(phoneNumber);
        log.info("Number input is filled with: " + phoneNumber);
        emailInput.sendKeys(email);
        log.info("Email input is filled with: " + email);
        sendBtn.click();
        log.info("Send button is clicked");
        Thread.sleep(5000);
        log.info("Waiting for 5 seconds");
    }
}
