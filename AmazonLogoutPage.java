package pages;

public class AmazonLogoutPage {
    System.setProperty("webdriver.chrome.driver");
    WebDriver driver = new ChromeDriver();
        driver.get("www.amazon.de");
        driver.manage().window().maximize();

    //Test case for Logout the website
         driver.findElement(By.id("nav-item-signout")).click();
}
