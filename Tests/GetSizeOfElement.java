package ru.deliveryClub;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfElement {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.wikipedia.org/");

        Dimension dimension = driver.findElement(By.id("searchInput")).getSize();
        System.out.println("Длина строки поиска: " + dimension.width);
        System.out.println("Высота строки поиска: " + dimension.height);
        
        Assert.assertEquals(394, dimension.width);
        Assert.assertEquals(43, dimension.height);
    }

    @After
    public void close() {
        driver.close();
    }
}
