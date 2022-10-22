package lesson16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 {

    WebDriver driver;
    String email = "demo@TestPro30";
    String password = "testpro123!";
    String searchPhrase = "Pluto";

    @Test
    public void userSearchesSong() throws InterruptedException {
        login();
        search(searchPhrase);
        Assert.assertTrue(getFirstResultText().contains(searchPhrase));
    }

    private String getFirstResultText() {
        WebElement firstSongResult = driver.findElement(By.cssSelector(".results .details"));
        return firstSongResult.getText();
    }

    @AfterMethod
    private void cleanup() {
        // Cleanup
        driver.quit();
    }

    private void search(String searchPhrase) throws InterruptedException {
        WebElement searchField = driver.findElement(By.cssSelector("input[type=search]"));
        Thread.sleep(1000);
        searchField.sendKeys(searchPhrase);
        Thread.sleep(2000);
    }

    private void login() throws InterruptedException {
        // User logs in
        WebElement emailAddressField = driver.findElement(By.cssSelector("input[type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        emailAddressField.sendKeys(email);
        Thread.sleep(1000);
        passwordField.sendKeys(password);
        Thread.sleep(1000);
        loginButton.click();
    }

    @BeforeMethod
    private void prereqs() {
        // Pre-reqs
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }

        String url = "https://bbb.testpro.io/";
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();
    }
}
