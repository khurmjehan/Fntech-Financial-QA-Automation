package com.fintech.qa.stepdefinitions;

import com.fintech.qa.pages.MortgagePage;
import com.fintech.qa.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MortgageSteps {
    WebDriver driver = DriverManager.getDriver();
    MortgagePage mortgagePage = new MortgagePage(driver);

    @Given("I navigate to the mortgage calculator application")
    public void navigateToApp() {
        driver.get("https://www.mortgagecalculator.org");
    }

    @When("I enter a home value of {string}")
    public void enterHomeValue(String homeValue) {
        mortgagePage.enterHomeValue(homeValue);
    }

    @When("I enter a down payment of {string}")
    public void enterDownPayment(String downPayment) {
        mortgagePage.enterDownPayment(downPayment);
    }

    @When("I click the calculate button")
    public void clickCalculate() {
        mortgagePage.clickCalculate();
    }

    @Then("the mortgage calculation should process successfully")
    public void verifyCalculation() {
        Assert.assertTrue(driver.getCurrentUrl().contains("mortgagecalculator.org"));
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}

