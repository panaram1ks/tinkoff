package patterns.adapter;

// Реализация видеоплеера
public class Mp4Player implements VideoPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing video file. Name: " + fileName);
    }
}
