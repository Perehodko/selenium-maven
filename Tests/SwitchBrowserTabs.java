package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBrowserTabs {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.yahoo.com/");
        Assert.assertEquals("Yahoo", driver.getTitle());

        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        driver.get("https://www.google.com/");
        Assert.assertEquals("Google", driver.getTitle());

        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
        driver.get("https://www.yandex.ru/");
        Assert.assertEquals("Яндекс", driver.getTitle());
    }

    @After
    public void close() {
        driver.quit();
    }
}
