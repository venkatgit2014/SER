package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SESampleExported {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://staging.secretescapes.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSESampleExported() throws Exception {
    driver.get(baseUrl + "/current-sales");
    driver.findElement(By.xpath("//section[@id='saleListContainer']/div[3]/a/div[2]/p[3]")).click();
    driver.findElement(By.id("bookButtonAnchor")).click();
    driver.findElement(By.xpath("//li[@id='offer_77296']/div/div[2]/p[2]")).click();
    driver.findElement(By.xpath("//div[@id='checkInCalendar']/div/div[2]/div[7]/div")).click();
    driver.findElement(By.xpath("//div[@id='checkOutCalendar']/div/div[3]/div[5]/div")).click();
    driver.findElement(By.id("bookButton")).click();
    driver.findElement(By.id("cancelButton")).click();
    driver.findElement(By.xpath("//div[@id='checkInCalendar']/div/div[2]/div[7]")).click();
    driver.findElement(By.xpath("//div[@id='checkOutCalendar']/div/div[3]/div[5]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
