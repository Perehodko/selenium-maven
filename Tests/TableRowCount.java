package ru.deliveryClub;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRowCount {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.get("https://en.wikipedia.org/wiki/Leopard_seal");

        List<WebElement> txt = (List<WebElement>) driver.findElements(By.cssSelector("table.infobox.biota>tbody>tr"));
        System.out.println("Количество строк в таблице: " + txt.size());
    }

    @After
    public void close() {
        driver.close();
    }
}
