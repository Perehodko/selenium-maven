package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetXYCoordinatesOfElements {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test() throws Exception {
        driver.get("https://www.google.com");

        WebElement element1 = driver.findElement(By.linkText("Всё о Google"));
        WebElement element2 = driver.findElement(By.cssSelector("#hplogo"));

        Point point = element1.getLocation();
        int x1coord = point.getX();
        int y1coord = point.getY();
        System.out.print(element1.getText() + ": ");
        System.out.println(x1coord + ","+y1coord);


        Point point1 = element2.getLocation();
        int x2coodr = point1.getX();
        int y2coord = point1.getY();
        System.out.print("Логотип Google: ");
        System.out.println(x2coodr + ", " + y2coord);

    }

    @After
    public void close() {
        driver.close();
    }
}
