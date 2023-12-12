package test;

import org.testng.annotations.Test;
import page.AddGoodWithoutCharactPage;
import page.MainPage;

public class AddGoodWithoutCharactTest extends CommonConditions {
    @Test
    public void testAddingGood() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        AddGoodWithoutCharactPage addingGoodPage = new AddGoodWithoutCharactPage(driver);
        addingGoodPage.AddingGoodToCart();
    }
}
