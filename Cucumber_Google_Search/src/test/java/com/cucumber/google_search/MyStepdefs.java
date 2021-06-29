package com.cucumber.google_search;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStepdefs {

    private final WebDriver driver;

    public MyStepdefs() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before
    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("^I open Browser$")
    public void iOpenBrowser() {
        System.out.println("Browser is opened successfully");
    }

    @When("^I navigate to Google Home Page https://www\\.google\\.com/$")
    public void iNavigateToGoogleHomePageHttpsWwwGoogleCom() {
        driver.get("https://www.google.com/");
        System.out.println("Browser navigated to google.com");
    }

    @Then("^I should see Google Image$")
    public void iShouldSeeGoogleImage() {
        assertTrue(driver.findElement(By.cssSelector("img.lnXdpd")).isDisplayed());
    }

    @And("^I should see Input Form where I can type$")
    public void iShouldSeeInputFormWhereICanType() {
        assertTrue(driver.findElement(By.cssSelector("input.gLFyf.gsfi")).isDisplayed());
    }

    @And("^I should see Button I'm Feeling Lucky$")
    public void iShouldSeeButtonIMFeelingLucky() {
        assertTrue(driver.findElement(
                By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]")).isDisplayed());
    }

    @When("I navigate to Google Home Page")
    public void iNavigateToGoogleHomePage() {
        driver.get("https://www.google.com/");
        System.out.println("Browser navigated to google.com");
    }

    @And("Type {string} in Input Form")
    public void typeInInputForm(String text) {
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys(text);
    }

    @And("Click Enter")
    public void clickEnter() {
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys(Keys.ENTER);
    }

    @Then("I should see Google Search Results")
    public void iShouldSeeGoogleSearchResults() {
        assertTrue(driver.findElement(By.cssSelector("div#search")).isDisplayed());
    }

    @And("I should see {string} text in right corner of search")
    public void iShouldSeeTextInRightCornerOfSearch(String text) {
        assertTrue(driver.getPageSource().contains(text));
    }
}
