package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinkXPathLocator {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.google.com/?hl=en");

        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
    }

    @After
    public void close() {
        driver.quit();
    }
}
