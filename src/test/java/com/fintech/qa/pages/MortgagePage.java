package com.fintech.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgagePage {
    WebDriver driver;

    public MortgagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "param[homevalue]")
    private WebElement homeValueInput;

    @FindBy(name = "param[downpayment]")
    private WebElement downPaymentInput;

    @FindBy(css = "input[type='submit'][value='Calculate']")
    private WebElement calculateButton;

    public void enterHomeValue(String value) {
        homeValueInput.clear();
        homeValueInput.sendKeys(value);
    }

    public void enterDownPayment(String value) {
        downPaymentInput.clear();
        downPaymentInput.sendKeys(value);
    }

    public void clickCalculate() {
        calculateButton.click();
    }
}
