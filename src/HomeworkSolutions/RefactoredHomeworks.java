package HomeworkSolutions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RefactoredHomeworks extends BaseTest  {
    String playlistName = "Test Pro Playlist";
    String songTitle = "Pluto";
    String newPlaylistNotification = "Created playlist";

    String newSongAddedNotification = "Added 1 song into";

//    Homework15
    @Test
    public void search() throws InterruptedException {
        navigateToHome();
        login();
        searchSong(songTitle);
        Assert.assertTrue(getFirstSongResultText().contains(songTitle));
    }

//    Homework16
    @Test
    public void createNewPlaylist() throws InterruptedException {
        navigateToHome();
        login();
        createPlaylist();
        enterPlaylistName(playlistName);
        Assert.assertTrue(getNotificationText().contains(newPlaylistNotification));
    }

//    Homework17
    @Test
    public void addSongToPlaylist() throws InterruptedException {
        navigateToHome();
        login();
        searchSong(songTitle);
        addSongToPlaylist(playlistName);
        Assert.assertTrue(getNotificationText().contains(newSongAddedNotification));
    }

}
