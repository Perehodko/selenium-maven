package ru.deliveryClub;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nadya\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru/");

        //Footer's elements
        WebElement textCompany = driver.findElementByCssSelector("#wrapper > div.wrapper-footer-bottom > div > div.footer-company > div");

        //Ссылки в столбце footer
        WebElement linkPartners = driver.findElementByCssSelector("#wrapper > div.wrapper-footer-bottom > div > div.footer-company > a:nth-child(2)");
        WebElement linkAgreement= driver.findElementByCssSelector("#wrapper > div.wrapper-footer-bottom > div > div.footer-company > a:nth-child(3)");
        WebElement linkPromo = driver.findElementByCssSelector("#wrapper > div.wrapper-footer-bottom > div > div.footer-company > a:nth-child(4)");
        WebElement linkContacts = driver.findElementByCssSelector("#wrapper > div.wrapper-footer-bottom > div > div.footer-company > a:nth-child(5)");

        //Сравнение ожидаемого и фактического результата
        Assert.assertEquals("«Delivery Club» — круглосуточная доставка из любимых ресторанов города", driver.getTitle());
        Assert.assertEquals("КОМПАНИЯ", textCompany.getText());
        Assert.assertEquals("Партнерство для ресторанов", linkPartners.getText());
        Assert.assertEquals("Пользовательское соглашение", linkAgreement.getText());
        Assert.assertEquals("Условия проведения акций", linkPromo.getText());
        Assert.assertEquals("Контакты", linkContacts.getText());
    }

    @After
    public void close() {
        driver.quit();
    }
}
