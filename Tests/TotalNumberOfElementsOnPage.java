package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TotalNumberOfElementsOnPage {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void test() {
        driver.get("https://www.facebook.com/");

        List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        List <WebElement> dropdown = driver.findElements(By.tagName("select"));
        List <WebElement> textboxes = driver.findElements(By.xpath("//input[@type='text']"));
        List <WebElement> iframes = driver.findElements(By.tagName("iframe"));
        List <WebElement> radioboxes = driver.findElements(By.xpath("//input[@type='radio']"));
        List <WebElement> buttons = driver.findElements(By.xpath("//button"));

        System.out.println("Total checkboxes: " + checkboxes.size());
        System.out.println("Total dropdowns: " + dropdown.size());
        System.out.println("Total textboxes: " + textboxes.size());
        System.out.println("Total iframes: " + iframes.size());
        System.out.println("Total radio buttons: " + radioboxes.size());
        System.out.println("Total buttons: " + buttons.size());


    }
    @After
    public void close() {
        driver.close();
    }

}