package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataInHTML {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.get("https://ru.wikipedia.org/wiki/%D0%9F%D0%BB%D1%83%D1%82%D0%BE%D0%BD");

        String txt = driver.findElement(By.cssSelector("#mw-content-text > div > table.infobox")).getText();
        //Проверка на то, что в полученном тексте содержится определенное предложение
        Assert.assertTrue(txt.contains("Мозаика снимков планеты, сделанных автоматической межпланетной станцией (АМС) «Новые горизонты» 14 июля 2015 года с расстояния 450 000 км"));
        System.out.println(txt);
    }

    @After
    public void close() {
        driver.close();
    }
}
