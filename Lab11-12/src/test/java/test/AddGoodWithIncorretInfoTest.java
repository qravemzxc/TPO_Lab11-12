package test;

import org.testng.annotations.Test;
import page.AddGoodWithIncorretInfoPage;
import page.MainPage;

public class AddGoodWithIncorretInfoTest extends CommonConditions {
    @Test
    public void testAddingGood() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        AddGoodWithIncorretInfoPage addGoodWithIncorretInfoPage = new AddGoodWithIncorretInfoPage(driver);
        addGoodWithIncorretInfoPage.AddingGoodWithIncorretCity("123","йцу","йцу","йцу","йцу");
    }
}
