package HomeworkSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework15 {


    @Test
    public void userSearchesSong() throws InterruptedException {

        String url = "https://bbb.testpro.io/";
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();

        String email = "demo@TestPro30";
        String password = "testpro123!";

        WebElement emailAddressField = driver.findElement(By.cssSelector("input[type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password'][placeholder='Password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

//        User logs in
        emailAddressField.sendKeys(email);
        Thread.sleep(1000);
        passwordField.sendKeys(password);
        Thread.sleep(1000);
        loginButton.click();

        WebElement searchField = driver.findElement(By.cssSelector("div#searchForm input[type=search]"));
        searchField.sendKeys("F");
        Thread.sleep(1000);
        searchField.clear();
        searchField.sendKeys("Pluto");
        Thread.sleep(2000);


        // Prints the first song result, will return no_such_element exception if no song results were found
            WebElement firstSongResult = driver.findElement(By.cssSelector("div.main-scroll-wrap div.results section.songs ul:nth-child(2) article:nth-child(1) span.main > span.details"));
            System.out.println(firstSongResult.getText());


//        Another approach
            Assert.assertTrue(firstSongResult.isDisplayed());
            Thread.sleep(5000);

        driver.quit();


    }




}
