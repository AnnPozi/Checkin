package pages;




import libs.WebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;

    public class MainPage {

        WebDriver webDriver;
        Logger logger;
        WebElements webElements;

        public MainPage(WebDriver webDriver) {
            this.webDriver = webDriver;
            logger = Logger.getLogger(getClass());
            webElements = new WebElements(webDriver);
            PageFactory.initElements(webDriver, this);


        }


        @FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div/div[1]/div[1]/div[2]/div[2]/button")
        public WebElement logInButton;

        @FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div/div[1]/div[1]/div[2]/div[3]/button")
        public WebElement signUpButton;

        @FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div/div[1]/div[1]/div[1]/div/h3")
        public WebElement mainText;

        /**
         * Method click to SingIn page
         */
        public void clickToSingUn() {
            webElements.clickOnElement(signUpButton);
        }


        /**
         * Method open url
         *
         * @param url
         */
        public void openUrl(String url) {
            try {
                webDriver.get(url);
                logger.info("Page was opened " + url);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("Page can't opened " + url);
                Assert.fail("Page can't opened " + url);
            }
        }

        /**
         * Method click to SingIn page
         */
        public void checkMainText(String text) {
            webElements.checkTextInElement(mainText, text);
        }

    }
