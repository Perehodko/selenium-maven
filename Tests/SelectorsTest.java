package ru.deliveryClub;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelectorsTest {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        }

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru/");

        WebElement searchField = driver.findElementByCssSelector("#user-addr__input");
        searchField.clear();
        searchField.sendKeys("Москва, Новослободская улица, 3");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElementByCssSelector("#user-addr__form > label.user-addr__label__btn > a");
        searchButton.click();
    }

    @After
    public void close() {
        driver.quit();
    }
}
