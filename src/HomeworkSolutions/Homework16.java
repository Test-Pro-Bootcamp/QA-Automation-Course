package HomeworkSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 {

    @Test
    public void createNewPlaylist() throws InterruptedException {
        String url = "https://bbb.testpro.io/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();

        String email = "demo@TestPro30";
        String password = "testpro123!";
        WebElement emailAddressField = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

//        User logs in
        emailAddressField.sendKeys(email);
        Thread.sleep(1000);
        passwordField.sendKeys(password);
        Thread.sleep(1000);
        loginButton.click();
        Thread.sleep(3000);

//        Clicks + icon for playlists
        WebElement createPlaylistIcon = driver.findElement(By.xpath("//i[@title='Create a new playlist']"));
        createPlaylistIcon.click();
        Thread.sleep(2000);

//        Clicks new playlist option
        WebElement newPlaylistOption = driver.findElement(By.xpath("//li[text()=('New Playlist')]"));
        newPlaylistOption.click();

//        Enters new playlist name and presses Enter
        WebElement newPlaylistNameTextField = driver.findElement(By.xpath("//form[@name='create-simple-playlist-form']/input"));
        String newPlaylistNameToEnter = "TestPro playlist";
        newPlaylistNameTextField.sendKeys(newPlaylistNameToEnter);
        newPlaylistNameTextField.sendKeys(Keys.ENTER);

//        First approach
//        Check if the pop up notification for the new playlist made is displayed
//        Added sleep for the meantime to wait for the notification to pop up
        Thread.sleep(2000);
        WebElement playlistCreatedNotification = driver.findElement(By.xpath("//div[contains(text(),'Created playlist')]"));
        Assert.assertTrue(playlistCreatedNotification.isDisplayed());

//        Another approach
//        Checks whether the new playlist name exists in the list of playlists
//        Returns true if the element is found

//        We can use the full playlist name or just the partial playlist name to check
        boolean doesThePlaylistNameExist = driver.findElement(By.xpath("//a[text()='"+newPlaylistNameToEnter+"']")).isDisplayed();
        System.out.println("Playlist check with the use of full playlist name = " +doesThePlaylistNameExist);

        boolean doesThePlaylistNameExist2 = driver.findElement(By.xpath("//a[contains(text(),'TestPro play')]")).isDisplayed();
        System.out.println("Playlist check with the use of partial playlist name = " +doesThePlaylistNameExist2);


        Thread.sleep(3000);
        driver.quit();





    }
}
