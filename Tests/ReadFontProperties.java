package ru.deliveryClub;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFontProperties {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.get("https://www.facebook.com/");

        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[1]/div[2]"));

        String fontColor = element.getCssValue("color");
        Assert.assertEquals("rgba(29, 33, 41, 1)", fontColor);
        System.out.println("Font color: " + fontColor);

        String fontSize = element.getCssValue("font-size");
        Assert.assertEquals("19px", fontSize);
        System.out.println("Font size: " + fontSize);

        String fontFamily = element.getCssValue("font-family");
        Assert.assertEquals("Helvetica, Arial, sans-serif", fontFamily);
        System.out.println("Font family: " + fontFamily);
    }
    
    @After
    public void close() {
        driver.close();
    }
}
