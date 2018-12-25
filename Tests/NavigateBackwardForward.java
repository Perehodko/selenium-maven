package ru.deliveryClub;
import org.junit.After;
import org.junit.Assert;
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

        String currentURL1 = driver.getCurrentUrl();
        Assert.assertEquals("https://ads.google.com/intl/ru_ru/home/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1", currentURL1);

        try {
            Thread.sleep(6000);
            driver.navigate().back();

            String currentURL2 = driver.getCurrentUrl();
            Assert.assertEquals("https://www.google.com/", currentURL2);
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
