package test;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;
import page.SortingPage;

import java.time.Duration;

public class SortingTest extends CommonConditions {
    @Test
    public void testSortingGoods() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        SortingPage sortingPage = new SortingPage(driver);
        sortingPage.SortingOfGoodsByPrice();

    }
}
