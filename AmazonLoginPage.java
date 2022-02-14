package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginPage {

System.setProperty("webdriver.chrome.driver");
    WebDriver driver = new ChromeDriver();
        driver.get("www.amazon.de");
        driver.manage().window().maximize();

        //Test case for Login the website
        driver.findElement(By.id("ap_email")).sendKeys("testuser1@gmail.com");
         driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("ap_password")).sendkeys("Password1+")
         driver.findElement(By.id("continue")).click();













}
