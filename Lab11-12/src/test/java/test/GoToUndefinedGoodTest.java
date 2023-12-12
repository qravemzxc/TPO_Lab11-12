package test;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FeedbackPage;
import page.GoToUndefinedGoodPage;
import page.MainPage;
import page.SortingPage;

import java.time.Duration;

public class GoToUndefinedGoodTest extends CommonConditions{
    @Test
    public void testGoToUndefinedGood() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        GoToUndefinedGoodPage goToUndefinedGoodPage = new GoToUndefinedGoodPage(driver);
        goToUndefinedGoodPage.GoToUndefinedGood();
    }
}
