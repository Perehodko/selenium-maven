package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileWriter;

public class WritePagesourceHTMLIntoFile {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.google.com/");

       String source = driver.getPageSource();
       System.out.println(source);

        try {
            File newTextFile = new File("C:\\Users\\Надя\\Desktop\\Test.txt");
            FileWriter fw = new FileWriter(newTextFile);

            fw.write(source);
            fw.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @After
    public void close() {
        driver.quit();
    }
}

