package ru.deliveryClub;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinkByPartialText {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        //поиск по частичному тексту линка, находящегося в элементе
        driver.findElement(By.partialLinkText("Terms")).click();

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
    }

    @After
    public void close() {
        driver.quit();
    }
}
