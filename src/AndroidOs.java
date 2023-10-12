
public class AndroidOs implements musicPlayer, phoneApp, webBrowser {
    @Override
    public void playSong() {
        System.out.println("Playing song");
    }

    @Override
    public void pauseSong() {
        System.out.println("Pausing song");
    }

    @Override
    public void stopSong() {
        System.out.println("Stopping song");
    }

    @Override
    public void playNextSong() {
        System.out.println("Playing next song");
    }

    @Override
    public void playPreviousSong() {
        System.out.println("Playing previous song");
    }

    @Override
    public void shuffleSong() {
        System.out.println("Shuffling songs");
    }

    @Override
    public void selectSong() {
        System.out.println("Song selected");
    }

    @Override
    public void open() {
        System.out.println("Opening browser");
    }

    @Override
    public void displayPage() {
        System.out.println("Displaying page");
    }

    @Override
    public void addTab() {
        System.out.println("Adding tab");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }

    @Override
    public void call() {
        System.out.println("Calling dialed number");
    }

    @Override
    public void answerCall() {
        System.out.println("Answering call");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call");
    }

    @Override
    public void checkVoicemail() {
        System.out.println("Checking voicemail");
    }

    @Override
    public void dialNumber() {
        System.out.println("Dialing number");
    }
}
