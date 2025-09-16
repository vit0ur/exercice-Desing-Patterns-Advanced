package adapter.streaming;

public class SpotifyAdapter implements Player {
    private SpotifyService sp = new SpotifyService();
    public void play(String midia) { sp.startSong(midia); }
    public void stop() { sp.endSong(); }
}
