package ru.deliveryClub;
import com.google.common.io.Files;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import java.io.IOException;

public class CaptureScrennshot {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru/");

        File screenFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(screenFile, new File("C:\\Users\\Nadya\\Desktop\\screen.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void close() {
        driver.quit();
        }
    }
