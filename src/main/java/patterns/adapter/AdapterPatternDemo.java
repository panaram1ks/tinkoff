package patterns.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer mediaAdapter = new MediaAdapter(new Mp4Player());

        audioPlayer.play("mp3", "song.mp3");
        mediaAdapter.play("mp4", "video.mp4");
        mediaAdapter.play("avi", "movie.avi"); // Неподдерживаемый формат
    }
}
