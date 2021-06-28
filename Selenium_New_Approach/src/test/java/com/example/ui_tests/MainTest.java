package com.example.ui_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {

    // setting up driver binary
    private WebDriver driver;

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }

    @Test
    void openWeather() throws InterruptedException {

        driver.get("https://weather.com/ru-RU/weather/today/l/RSXX0063:1:RS");
        System.out.println("Waiting 2 seconds");
        Thread.sleep(2000);

        WebElement searchInput = driver.findElement(new By.ByCssSelector("input#LocationSearch_input"));
        searchInput.sendKeys("Москва");
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println("Searching Weather");

        WebElement dailyForecast = driver.findElement(new By.ByCssSelector("ul.WeatherTable--columns--3q5Nx"));
        assertNotNull(dailyForecast);

    }
}
