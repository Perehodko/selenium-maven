package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenContextMenu {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test() throws Exception {
        driver.get("https://www.google.com");

        WebElement element = driver.findElement(By.linkText("Всё о Google"));

        try {
            Actions action = new Actions(driver);

            action.moveToElement(element);
            Thread.sleep(6000);

            //Второй пункт контекстоного меню "Открыть в новом окне"
            action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
        @After
        public void close() {
            driver.close();
        }

    }
