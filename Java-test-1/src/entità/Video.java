package entità;

public class Video extends Audio implements Riproducibile, Luminosità {
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo, durata, volume);
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
    
    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            String puntiEsclamativi = new String(new char[getVolume()]).replace("\0", "!");
            String asterischi = new String(new char[luminosità]).replace("\0", "*");
            System.out.println(getTitolo() + " " + puntiEsclamativi + " " + asterischi);
        }
    }
}
