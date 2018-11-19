package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class VerifyTextPresent {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        if (driver.getPageSource().contains(" Although Wilton's marriage is legitimate, it was conducted in secret, and she is accused of having a child out of wedlock."))
        {
            System.out.println("Текст на странице присутствует");
        }
        else{
            System.out.println("Текст не найден");
        }
    }

    @After
    public void close() {
        driver.quit();
    }
}
