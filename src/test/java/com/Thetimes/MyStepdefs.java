package com.Thetimes;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Jay Vaghani on 27/04/2017.
 */
public class MyStepdefs
{
    WebDriver driver;
    @Given("^user is on home page$")
    public void userIsOnHomePage()
    {
     driver = new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("https://www.thetimes.co.uk");
     driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//a[contains(text(),'Accept and close')]")).click();



    }

    @When("^user click on subscribe services$")
    public void userClickOnSubscribeServices()
    {
        driver.findElement(By.xpath("//a[contains(text(),'Subscribe')]")).click();

    }

    @And("^user select digital pack for (\\d+) week$")
    public void userSelectDigitalPackForWeek(int arg0) throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.tagName("h2")).getText().contains("Subscription brings you"));

    }

    @Then("^user should get digital services subscription for (\\d+) weeks$")
    public void userShouldGetDigitalServicesSubscriptionForWeeks(int arg0)
    {

    }
}
