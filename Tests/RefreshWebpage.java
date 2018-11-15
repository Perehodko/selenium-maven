package ru.deliveryClub;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWebpage {
    public ChromeDriver driver;
    @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
        }

    @Test
    public void firstTest() {
        driver.get("https://www.wikipedia.org/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        driver.quit();
    }
}

