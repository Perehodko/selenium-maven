package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAButtonById {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.yahoo.com/");

        try {
            Thread.sleep(5000);
            driver.findElement(By.id("uh-signin"));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @After
    public void close() {
        driver.quit();
    }
}
