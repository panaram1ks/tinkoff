package patterns.adapter;

// Реализация аудиоплеера
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Playing audio file. Name: " + fileName);
    }
}
