package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementIsDisplayed {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void test() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        WebElement element = driver.findElement(By.xpath("//*[@id=\"p-logo\"]/a"));

        if (!element.isDisplayed()) {
            System.out.println("Элемент не отображен на странице");
        }
        else {
            System.out.println("Элемент отображен на странице");
        }
    }
    @After
    public void close() {
        driver.close();
    }
}
