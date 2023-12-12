package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.AddGoodPage;
import page.MainPage;

public class AddGoodTest extends CommonConditions  {
    @Test
    public void testAddingGood() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        AddGoodPage addingGoodPage = new AddGoodPage(driver);
        addingGoodPage.AddingGoodToCart("1000000000000000000000000000");
    }
}
