package lettoreMultimediale;

public abstract class MediaElement {
    private String titolo;

    public MediaElement(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public abstract void esegui();
}
