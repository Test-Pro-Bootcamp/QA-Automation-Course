package lesson16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 {

    @Test
    public void userSearchesSong() throws InterruptedException {

        // Pre-reqs
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }

        String url = "https://bbb.testpro.io/";
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();

        String email = "demo@TestPro30";
        String password = "testpro123!";

        // User logs in
        WebElement emailAddressField = driver.findElement(By.cssSelector("input[type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        emailAddressField.sendKeys(email);
        Thread.sleep(1000);
        passwordField.sendKeys(password);
        Thread.sleep(1000);
        loginButton.click();

        // Search for 'Pluto'
        WebElement searchField = driver.findElement(By.cssSelector("input[type=search]"));
        Thread.sleep(1000);
        String searchPhrase = "Pluto";
        searchField.sendKeys(searchPhrase);
        Thread.sleep(2000);

        // Validate that search result contains the search phrase
        WebElement firstSongResult = driver.findElement(By.cssSelector(".results .details"));
        String firstSongTitle = firstSongResult.getText();
        Assert.assertTrue(firstSongTitle.contains(searchPhrase));

        // Cleanup
        driver.quit();
    }
}
