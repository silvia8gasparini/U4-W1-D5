package lettoreMultimediale;

class Image extends MediaElement {
    private int luminosita;

    public Image(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void show() {
        System.out.println(getTitolo() + "*".repeat(luminosita));
    }

    @Override
    public void esegui() {
        show();
    }
}
