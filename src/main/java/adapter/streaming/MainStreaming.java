package adapter.streaming;

public class MainStreaming {
    public static void main(String[] args) {
        Player p1 = new SpotifyAdapter();
        p1.play("Imagine Dragons");
        p1.stop();

        Player p2 = new YouTubeAdapter();
        p2.play("Aula de Design Patterns");
        p2.stop();
    }
}
