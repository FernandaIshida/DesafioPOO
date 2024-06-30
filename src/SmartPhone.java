public class SmartPhone implements Cellphone, InternetBrowser, MusicPlayer {
    @Override
    public void toPlay() {
        System.out.println("Playing");
    }

    @Override
    public void toPause() {
        System.out.println("Music paused");
    }

    @Override
    public void musicSellecting() {
        System.out.println("Your music has been selected");
    }

    @Override
    public void caliing() {
        System.out.println("Calling");
    }

    @Override
    public void answering() {
        System.out.println("Call answered");
    }

    @Override
    public void voicemailConnect() {
        System.out.println("Voice mail connected");
    }

    @Override
    public void showWebPage() {
        System.out.println("Shows webpage");
    }

    @Override
    public void addNewTab() {
        System.out.println("New tab added");
    }

    @Override
    public void refreshWebPage() {
        System.out.println("Page refreshed");
    }
}
