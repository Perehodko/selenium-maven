package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialCharactersKeyEvents {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.wikipedia.org/");

        WebElement element = driver.findElement(By.cssSelector("body"));

        element.sendKeys(Keys.PAGE_DOWN);
        element.sendKeys(Keys.F5);
        element.sendKeys(Keys.PAGE_UP);

    }
    @After
    public void close() {
        driver.quit();
    }
}
