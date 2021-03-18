package io.pragra.learning;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Set;

public class ZoomTest {

    public static void main(String[] args) {
        System.out.println("My First Jenkins Pipleline Project !!!");
    }
    WebDriver driver;
    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/simra/Downloads/chromedriver.exe");
        // FireFox, Chrome, Opera
        driver = new ChromeDriver(); // Open a browser instance
        driver.get("https://zoom.us");
    }

    @Test(enabled = false)
    public void tc() throws InterruptedException {
        System.out.println("URL before clicking "   + driver.getCurrentUrl());

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[9]/a"));

        actions.keyDown(Keys.COMMAND).click(element).build().perform();



        System.out.println("URL AFTER clicking "   + driver.getCurrentUrl());

        System.out.println("Title :" + driver.getTitle());

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);

//        for (String window:  windowHandles) {
//            if( !window.equals(currentWindow) ) {
//                driver.switchTo().window(window);
//                break;
//            }
//        }
//        Thread.sleep(5000);
//
//        driver.switchTo().window(currentWindow);

//        ((JavascriptExecutor) driver).executeScript("alert('I am fake Alert')");
//
//        Thread.sleep(5000);
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.dismiss();

        //System.out.println("Source : "  + driver.getPageSource());

        element.click();

        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().to("https://pragra.io");



    }

    @Test
    public void tc2() throws InterruptedException {
       driver.get("https://www1.oanda.com/currency/converter/");
       driver.findElement(By.id("base_currency_input")).sendKeys("INR", Keys.ENTER);
       Thread.sleep(5000);
       driver.navigate().refresh();
       driver.manage().deleteAllCookies();
        Thread.sleep(5000);
        driver.navigate().refresh();
       driver.manage().addCookie(new Cookie("base_currency_0","CAD"));
        driver.navigate().refresh();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}

