package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectARadiobutton {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://yandex.ru/portal/video?source=tabbar&redircnt=1543154779.1&stream_channel=1536653652&stream_active=storefront");

        String[] XPAthList = {
                "/html/body/div[1]/div/div/div[4]/div/div/ul/li[1]/span[1]",
                "/html/body/div[1]/div/div/div[4]/div/div/ul/li[2]/span[1]",
                "/html/body/div[1]/div/div/div[4]/div/div/ul/li[3]/span[1]",
                "/html/body/div[1]/div/div/div[4]/div/div/ul/li[4]/span[1]",
                "/html/body/div[1]/div/div/div[4]/div/div/ul/li[5]/span[1]",
                "/html/body/div[1]/div/div/div[4]/div/div/ul/li[6]/span[1]",
                "/html/body/div[1]/div/div/div[4]/div/div/ul/li[7]/span[1]"};

        try {
            for (int i = 0; i < XPAthList.length ; i++) {
                WebElement element = driver.findElement(By.xpath(XPAthList[i]));
                element.click();
                Thread.sleep(3000);
            }
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
