package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackwardForward {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.linkText("Реклама"));
        element.click();

        try {
            Thread.sleep(6000);
            driver.navigate().back();
            Thread.sleep(6000);
            driver.navigate().forward();
        }
        catch (Exception e) {
            System.out.println("Невозможно выполнить переход");
        }
    }

    @After
    public void close() {
        driver.quit();
    }
}
