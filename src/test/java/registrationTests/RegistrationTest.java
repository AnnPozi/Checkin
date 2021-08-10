package registrationTests;




import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.RegistrationPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

    public class RegistrationTest {

        private WebDriver webDriver;
        private Logger logger = Logger.getLogger(getClass());

        public RegistrationPage registrationPage;
        public MainPage mainPage;


        private final String EMAIL = "346346-sdgsdgs@yopmail.com";
        private final String PASSWORD = "qwerty123";
        private final String AGE = "22";


        @Test
        public void testRegistration() {
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
            //another method
           // registrationPage.checkWelcomeText("Welcome to Pinterest");
            registrationPage.clickNextButton();
            registrationPage.clickFemale();
            registrationPage.clickNextGander();
            registrationPage.clickNextLanguage();
            registrationPage.click5Topics();
            registrationPage.clickDoneButton();
            registrationPage.clickDoneButton2();
            registrationPage.checkHomeText("Home");

            //Close chromedriver
            webDriver.quit();
        }
    }

