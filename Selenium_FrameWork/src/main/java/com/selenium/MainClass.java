package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        // configuration
        String CHROME_DRIVER = "webdriver.chrome.driver";
        String driverUrl = "";
        String SITE_URL = "https://hh.ru/search/vacancy?text=Java";

        try (InputStream input = new FileInputStream("src/main/resources/application.properties")) {
            Properties prop = new Properties();
            // load a properties file
            prop.load(input);

            // get the property value and print it out
            driverUrl = prop.getProperty(CHROME_DRIVER);

        } catch (IOException ex) {
            ex.printStackTrace();
        }


        System.setProperty(CHROME_DRIVER, driverUrl);

        ChromeDriver driver = new ChromeDriver();
        driver.get(SITE_URL);
        Thread.sleep(2000);

        List<WebElement> vacancyElements = driver.findElementsByCssSelector("div.vacancy-serp-item");
        List<String[]> resultList = new ArrayList<>();

        for (WebElement element : vacancyElements) {
            WebElement header = element.findElement(new By.ByCssSelector("div.vacancy-serp-item__row_header span a"));

            String vacancyLink = header.getAttribute("href");
            String name = header.getText();
            resultList.add(new String[]{name, vacancyLink});
        }

        for (int j = 0; j < resultList.size(); j++) {
            System.out.println(j + ") " + Arrays.toString(resultList.get(j)));
        }
    }
}
