package ru.deliveryClub;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinkByText {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.google.com/");
        //поиск по тексту ссылки
        driver.findElement(By.linkText("Почта")).click();

        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://www.google.com/intl/ru/gmail/about/#", currentURL);
    }

    @After
    public void close() {
        driver.quit();
    }
}
