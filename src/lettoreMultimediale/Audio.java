package lettoreMultimediale;

class AudioRecording extends MediaElement implements Playable {
    private int durata;
    private int volume;

    public AudioRecording(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + "!".repeat(volume));
        }
    }

    @Override
    public void esegui() {
        play();
    }
}