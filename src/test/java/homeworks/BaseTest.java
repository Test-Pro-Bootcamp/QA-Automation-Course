package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {
   static WebDriver driver;

    @BeforeSuite
    public static void chromeConfigs() {
        // This is for Windows users
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
    }
    @BeforeMethod
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
}

    @AfterMethod
    public void tearDownBrowser(){
        driver.quit();
    }
    String email ="demo@TestPro30";
    String password = "testpro123!";
    public void navigateToHome(){
        String url = "https://bbb.testpro.io/";
        driver.get(url);
    }
    public void enterEmail(String email) throws InterruptedException {
        WebElement emailAddressField = driver.findElement(By.xpath("//input[@type='email']"));
        emailAddressField.sendKeys(email);
        Thread.sleep(1000);
    }
    public void enterPassword(String password) throws InterruptedException{
        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys(password);
        Thread.sleep(1000);
    }
    public void login() throws InterruptedException {
        enterEmail(email);
        enterPassword(password);
        submit();
        Thread.sleep(2000);
    }

    public void submit() throws InterruptedException {
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }
    public void searchSong(String songTitle) throws InterruptedException{
        WebElement searchField = driver.findElement(By.cssSelector("div#searchForm input[type=search]"));
        searchField.sendKeys(songTitle);
        Thread.sleep(1500);
    }
    public void createPlaylist() throws InterruptedException {
        WebElement createPlaylistIcon = driver.findElement(By.xpath("//i[@title='Create a new playlist']"));
        createPlaylistIcon.click();
        Thread.sleep(2000);
    }
    public String getFirstSongResultText (){
        WebElement firstSongResult = driver.findElement(By.cssSelector(".results .details"));
        return firstSongResult.getText();
    }

    public String getNotificationText(){
        WebElement notificationText = driver.findElement(By.cssSelector("div.success.show"));
       return notificationText.getText();
    }
    public void enterPlaylistName(String playlistName) throws InterruptedException {
        WebElement newPlaylistOption = driver.findElement(By.xpath("//li[text()=('New Playlist')]"));
        newPlaylistOption.click();
        WebElement newPlaylistNameTextField = driver.findElement(By.xpath("//form[@name='create-simple-playlist-form']/input"));
        newPlaylistNameTextField.sendKeys(playlistName);
        Thread.sleep(2000);
        newPlaylistNameTextField.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    public void viewAllSearchResults(){
        WebElement viewAllSearchResult = driver.findElement(By.xpath("//button[contains(text(),'View All')][@data-test='view-all-songs-btn']"));
        viewAllSearchResult.click();
    }

    public void addTo() throws InterruptedException {
        WebElement addTo = driver.findElement(By.xpath("//button[contains(text(),'Add To')]"));
        addTo.click();
        Thread.sleep(2000);
    }

    public void selectViewAllFirstSongResult() throws InterruptedException {
        WebElement viewAllFirstSongResult = driver.findElement(By.cssSelector("section#songResultsWrapper tr.song-item td.title"));
        viewAllFirstSongResult.click();
        Thread.sleep(3000);
    }
    public void addSongToPlaylist(String playlistName) throws InterruptedException{
        Thread.sleep(4000);
        viewAllSearchResults();
        Thread.sleep(3000);
        selectViewAllFirstSongResult();
        addTo();
        WebElement playlistNameElement = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//section/ul/li[contains(text(),'"+playlistName+"')]"));
        playlistNameElement.click();
        Thread.sleep(2000);
    }

}