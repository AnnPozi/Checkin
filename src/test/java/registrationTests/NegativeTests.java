package registrationTests;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.RegistrationPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class NegativeTests {

    private WebDriver webDriver;
    private Logger logger = Logger.getLogger(getClass());

    public RegistrationPage registrationPage;
    public MainPage mainPage;

    private final String EMAIL = "11";
    private final String PASSWORD = "aa";
    private final String AGE = "qq";


    @Test
    public void negativeTest() {
        //Setup browser
        File chrome = new File("/Users/apozina/IdeaProjects/MyOwnProgect/driver/chromedriver");
        System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
        webDriver = new ChromeDriver();
        registrationPage = new RegistrationPage(webDriver);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //Your personal info
        registrationPage.openSignUpForm();
        registrationPage.inputEmailIn(EMAIL);

        registrationPage.inputPassword(PASSWORD);
        registrationPage.inputAge(AGE);
        registrationPage.clickContinue();
        registrationPage.checkErrorText("That doesn't look like an email address.");

        webDriver.quit();
    }
}
