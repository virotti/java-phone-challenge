public class myPhone {
    public static void main(String[] args) {
        AndroidOs androidOs = new AndroidOs();
        System.out.println("Testing music player:");
        androidOs.selectSong();
        androidOs.playSong();
        androidOs.pauseSong();
        androidOs.stopSong();
        androidOs.playNextSong();
        androidOs.playPreviousSong();
        androidOs.shuffleSong();
        System.out.println("Testing phone app:");
        androidOs.dialNumber();
        androidOs.call();
        androidOs.answerCall();
        androidOs.endCall();
        androidOs.checkVoicemail();
        System.out.println("Testing web browser:");
        androidOs.open();
        androidOs.displayPage();
        androidOs.addTab();
        androidOs.refreshPage();
    }
}
