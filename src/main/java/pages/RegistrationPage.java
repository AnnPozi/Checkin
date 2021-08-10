
    package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

    public class RegistrationPage extends MainPage {

        public RegistrationPage(WebDriver webDriver) {
            super(webDriver);
        }


        @FindBy(id = "email")
        public WebElement emailInput;

        @FindBy(id = "password")
        public WebElement passInput;

        @FindBy(id = "age")
        public WebElement ageInput;

        @FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[5]/div/div[1]/form/div[5]/button")
        public WebElement continueButton;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[1]/div[3]/div/label/div/h2")
        public WebElement welcomeText;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/button")
        public WebElement nextButton;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/label/div")
        public WebElement femaleOption;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/div[2]/label/div")
        public WebElement maleOption;

        @FindBy(xpath = "'/html/body/div[2]/div/div/div[2]/div/div[3]/button")
        public WebElement nextButtonGender;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[2]/button")
        public WebElement nextButtonLanguage;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div")
        public WebElement topic;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div/div[3]/div/div/div/div/div/div/div[1]/div[2]/div")
        public WebElement topic2;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div/div[1]/div/div/div/div/div/div/div[1]/div[2]/div")
        public WebElement topic3;

        @FindBy(xpath= "/html/body/div[2]/div/div/div[3]/div/div[3]/div/div[4]/div/div/div/div/div/div/div[1]/div[2]/div")
        public WebElement topic4;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div/div[7]/div/div/div/div/div/div/div[1]/div[2]/div")
        public WebElement topic5;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[4]/div[2]/button")
        public WebElement doneButton;

        @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[2]/button")
        public WebElement doneButton2;

        @FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[2]/div/div/div[1]")
        public WebElement homeButtonText;

        @FindBy(xpath =  "//*[@id=\"email-error\"]")
        public WebElement emailError;





        /**
         * Method click to SingUn page
         */
        public void openSignUpForm() {
            openUrl("https://www.pinterest.co.uk/");
            webElements.clickOnElement(signUpButton);
        }

        /**
         * Method input email
         *
         * @param email
         */
        public void inputEmailIn(String email) {
            webElements.inputText(emailInput, email);
        }

        /**
         * Method input Age
         */
        public void inputAge(String age) {
            webElements.inputText(ageInput, age);
        }

        /**
         * Method input Password
         */
        public void inputPassword(String password) {
            webElements.inputText(passInput, password);
        }

        /**
         * Method Continue registration
         */
        public void clickContinue() {
            webElements.clickOnElement(continueButton);
        }

        /**
         * Method Welcome text
         */
        public void checkWelcomeText(String welcomeText1) {

            webElements.checkTextInElement(welcomeText, welcomeText1);
        }

        /**
         * Method Next button
         */
        public void clickNextButton() {
            webElements.clickOnElement(nextButtonGender);
        }

        /**
         * Method Female choosing
         */
        public void clickFemale () {
            webElements.clickOnElement(femaleOption);
        }

        /**
         * Method Next after gender
         */
        public void clickNextGander () {
            webElements.clickOnElement(nextButtonGender);
        }

        /**
         * Method Next after language
         */
        public void clickNextLanguage () {
            webElements.clickOnElement(nextButtonLanguage);
        }

        /**
         * Method selecting 5 items
         */
        public void click5Topics () {
            webElements.clickOnElement(topic);
            webElements.clickOnElement(topic2);
            webElements.clickOnElement(topic3);
            webElements.clickOnElement(topic4);
            webElements.clickOnElement(topic5);
        }


        /**
         * Method Done button
         */
        public void clickDoneButton() {
            webElements.clickOnElement(doneButton);
        }

        /**
         * Method final done button
         */
        public void clickDoneButton2() {
            webElements.clickOnElement(doneButton2);
        }


        /**
         * Method checking home text button
         */
        public void checkHomeText(String homeText) {

            webElements.checkTextInElement(homeButtonText, homeText);
        }

        /**
         * Method checking email error text
         */
        public void checkErrorText(String errorText) {

            webElements.checkTextInElement(emailError, errorText);
        }



        public void checkTitle(String message, boolean actual, boolean expected) {
            webElements.checkAC(message, actual, expected);
        }



    }

