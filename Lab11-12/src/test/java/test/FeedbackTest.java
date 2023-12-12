package test;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FeedbackPage;
import page.MainPage;
import page.SortingPage;

import java.time.Duration;

public class FeedbackTest extends CommonConditions {
    @Test
    public void testAddFeedback() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        FeedbackPage feedbackPage = new FeedbackPage(driver);
        feedbackPage.AddFeedback("qkwjen","qwmel","lnkqnwel","klqwnelkqwe");
    }
}
