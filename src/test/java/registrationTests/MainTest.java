package registrationTests;

import libs.WebElements;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

public class MainTest {

    private WebDriver webDriver;
    private Logger logger = Logger.getLogger(getClass());
    private MainPage mainPage;
    private WebElements webElements;

    @Test
    public void testMain() {

            mainPage.openUrl("https://www.pinterest.co.uk/");
            mainPage.checkMainText("Pinterest");
            mainPage.clickToSingUn();

             webDriver.quit();
    }

}
