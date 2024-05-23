package patterns.adapter;

// Адаптер для видеоплеера, чтобы он работал как медиаплеер
public class MediaAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public MediaAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            videoPlayer.playVideo(fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
