package test;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;
import page.SearchingPage;
import page.SortingPage;

import java.time.Duration;

public class SearchingTest extends CommonConditions {
    @Test
    public void testSearchGood() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        SearchingPage searchingPage = new SearchingPage(driver);
        searchingPage.SearchGood("косуха");

    }
}
