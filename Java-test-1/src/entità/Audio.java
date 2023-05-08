package entità;

public class Audio extends OggettoMultimediale implements Riproducibile {
    private int volume;
    private int durata;
    
    public Audio(String titolo, int durata, int volume) {
        setTitolo(titolo);
        this.durata = durata;
        this.volume = volume;
    }
    
    public void aumentaVolume() {
        this.volume++;
    }

    public void diminuisciVolume() {
        this.volume--;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            String puntiEsclamativi = new String(new char[volume]).replace("\0", "!");
            System.out.println(getTitolo() + " " + puntiEsclamativi);
        }
    }
}



