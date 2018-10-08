package com.telran.qa15.sandbox.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenWikiAndSearchJava {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void openSiteTest() {
        wd.navigate().to("https://en.wikipedia.org");

        wd.findElement(By.name("search")).sendKeys("Java");

        wd.findElement(By.name("go")).click();

        // wd.findElement(By.cssSelector("i.sprite.svg-search-icon")).click();- єта строчка не работает почему-то,
        // нашла имя кнопки и через него все побежало.
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
       wd.quit();
    }





}
