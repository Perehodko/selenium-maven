package ru.deliveryClub;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottomOfPage {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://wikipedia.org");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 2500)");
    }

    @After
    public void close() {
        driver.quit();
    }
}

