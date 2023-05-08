package entità;

public class Immagine extends OggettoMultimediale implements Luminosità {
    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        setTitolo(titolo);
        this.luminosità = luminosità;
    }

    @Override
    public int getLuminosità() {
        return luminosità;
    }

    @Override
    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    @Override
    public void aumentaLuminosità() {
        this.luminosità++;
    }

    @Override
    public void diminuisciLuminosità() {
        this.luminosità--;
    }

    public void show() {
        String asterischi = new String(new char[luminosità]).replace("\0", "*");
        System.out.println(getTitolo() + " " + asterischi);
    }
}

