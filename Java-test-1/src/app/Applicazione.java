package app;
import entità.Audio;
import entità.Video;
import entità.Immagine;
import entità.OggettoMultimediale;
import java.util.Scanner;

public class Applicazione {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        OggettoMultimediale[] oggettiMultimediali = new OggettoMultimediale[5];

	        for (int i = 0; i < oggettiMultimediali.length; i++) {
	            System.out.println("Inserisci il titolo del file multimediale n." + (i + 1) + " che vuoi creare: ");
	            String titolo = scanner.nextLine();

	            System.out.println("se"+ " " + titolo + " è un audio digita 'a', se è un immagine digita 'i', se è un video digita 'v' ");
	            String tipo = scanner.nextLine();

	            switch (tipo) {
	                case "a":
	                    System.out.println("Puoi regolare il volume dell'audio inserendo un numero intero: ");
	                    int volume = scanner.nextInt();

	                    System.out.println("Imposta la durata dell'audio con un numero intero: ");
	                    int durata = scanner.nextInt();

	                    oggettiMultimediali[i] = new Audio(titolo, volume, durata);
	                    break;

	                case "v":
	                    System.out.println("Puoi regolare il volume del video inserendo un numero intero: ");
	                    volume = scanner.nextInt();

	                    System.out.println("Imposta la durata del video con un numero intero: ");
	                    durata = scanner.nextInt();

	                    System.out.println("Imposta la luminosità del video inserendo un numero intero: ");
	                    int luminosita = scanner.nextInt();

	                    oggettiMultimediali[i] = new Video(titolo, volume, durata, luminosita);
	                    break;

	                case "i":
	                    System.out.println("Selezione la luminosità dell'immagine inserendo un numero intero: ");
	                    luminosita = scanner.nextInt();
	                    oggettiMultimediali[i] = new Immagine(titolo, luminosita);
	                    break;

	                default:
	                    System.out.println("Ops. C'è stato un errore nella creazione del file multimediale. Riprova");
	                    i--;
	                    continue;
	            }
	            scanner.nextLine();
	        }
	        int scelta = -1;

	        while (scelta != 0) {
	            System.out.println("Quale oggetto multimediale vuoi riprodurre? Puoi fermare la riproduzione premendo 0");
	            scelta = scanner.nextInt();
	            
	            if (scelta >= 1 && scelta <= 5) {
	                OggettoMultimediale oggetto = oggettiMultimediali[scelta - 1];

	                if (oggetto instanceof Audio) {
	                    ((Audio) oggetto).play();
	                } else if (oggetto instanceof Video) {
	                    ((Video) oggetto).play();
	                } else if (oggetto instanceof Immagine) {
	                    ((Immagine) oggetto).show();
	                }
	            } else if (scelta == 0) {
	            	System.out.println("riproduzione interrotta");
	            } else {
	            	System.out.println("Scelta non valida riprova!");
	            }
	        }
	        scanner.close();
	    }
}
	        
	        

	       