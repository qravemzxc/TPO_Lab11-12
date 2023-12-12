package test;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FilteringPage;
import page.MainPage;
import page.SearchingPage;
import page.SortingPage;

import java.time.Duration;

public class FilteringTest extends CommonConditions {
    @Test
    public void testFilteringGoods() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        FilteringPage filteringPage = new FilteringPage(driver);
        filteringPage.FilteringGoods("кольцо");

    }
}
