package test;

import org.testng.annotations.Test;
import page.AddGoodPage;
import page.ComWithManagPage;
import page.MainPage;
public class ComWithManagTest extends CommonConditions {
    @Test
    public void testComWithManag() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .getUrl();
        ComWithManagPage comWithManagPage = new ComWithManagPage(driver);
        comWithManagPage.ComWithManag("йцу","+3744111","qwe@lis.ru");
    }
}
