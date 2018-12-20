package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByClassName {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.google.com/");

        try {
            driver.findElement(By.className("SDkEP"));
            System.out.println("Элемент найден");
        }
        catch (Exception e) {
            System.out.println("Элемент не найден");
        }
    }

    @After
    public void close() {
        driver.quit();
    }
}
