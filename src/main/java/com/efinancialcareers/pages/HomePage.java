package com.efinancialcareers.pages;

import com.efinancialcareers.browserfactory.ManageBrowser;
import com.efinancialcareers.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Sign in / Register')]")
    WebElement Signin;

    @CacheLookup
    @FindBy(name="Accept all")
    WebElement Acceptall;
    @CacheLookup
    @FindBy(xpath= "//input[@id='tq6rp']")
    WebElement Email;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue;

    @CacheLookup
    @FindBy(xpath = "//input[@id='8jqwe']")
    WebElement Password;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement Submit;

    public void clickOnSignInLink() {
      clickOnElement(Signin);
        log.info("Clicking on Sign in link : " + Signin.toString());

    }
    public void clickOnAcceptAllLink(){
        clickOnElement(Acceptall);
    }
    public void enterEmailId(String email){sendTextToElement(Email,email);}
    public void clickOnContinue(){
        clickOnElement(Continue);
        log.info("Clicking on Continue :" + Continue);
    }
    public void enterPassword(String password){
        sendTextToElement(Password,password);}
    public void clickonSubmit(){
        clickOnElement(Submit);
        log.info("Clicking on Submit:"+ Submit);
    }


    }


