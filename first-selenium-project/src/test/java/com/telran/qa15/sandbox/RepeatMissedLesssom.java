package com.telran.qa15.sandbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class RepeatMissedLesssom {
    WebDriver wd;

@BeforeMethod
    public void setUp() {
        wd = new EdgeDriver();
        WebDriver.Timeouts timeouts = wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

@Test
    public  void openSiteTest (){
      wd.navigate().to("http://www.it-courses.by/category/articles/");
    }

@AfterMethod
public void tearDown(){
    wd.quit();
}
}