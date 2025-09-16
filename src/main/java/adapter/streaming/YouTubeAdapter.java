package adapter.streaming;

public class YouTubeAdapter implements Player {
    private YouTubeService yt = new YouTubeService();
    public void play(String midia) { yt.iniciarVideo(midia); }
    public void stop() { yt.pausarVideo(); }
}
