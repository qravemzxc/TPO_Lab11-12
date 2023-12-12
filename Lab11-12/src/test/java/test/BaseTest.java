package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class BaseTest extends CommonConditions {
    @Test
    public void isMainPageOpened() {
        String url = new MainPage(driver)
                .open()
                .getUrl();
       /* Assert.assertEquals("https://rockbastion.by", url);
        assertThat("Url matched", url.equals("https://rockbastion.by"));*/
    }
}