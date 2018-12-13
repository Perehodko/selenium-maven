package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverActions {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test() throws Exception {
        driver.get("https://en.wikipedia.org/wiki/Antarctic_Sound");

        Actions actions = new Actions(driver);
        WebElement main = driver.findElement(By.linkText("Antarctic"));
        ((Actions) actions).moveToElement(main);

        try {
            Thread.sleep(6000);
            ((Actions) actions).click().build().perform();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    @After
    public void close() {
        driver.close();
    }
}
