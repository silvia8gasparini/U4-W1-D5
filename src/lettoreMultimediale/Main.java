package lettoreMultimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaElement[] elementi = new MediaElement[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Crea elemento multimediale #" + (i + 1));
            System.out.print("Tipo (1=Immagine, 2=Audio, 3=Video): ");
            int tipo = Integer.parseInt(scanner.nextLine());
            System.out.print("Titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1 -> {
                    System.out.print("Luminosità: ");
                    int lum = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Image(titolo, lum);
                }
                case 2 -> {
                    System.out.print("Durata: ");
                    int dur = Integer.parseInt(scanner.nextLine());
                    System.out.print("Volume: ");
                    int vol = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new AudioRecording(titolo, dur, vol);
                }
                case 3 -> {
                    System.out.print("Durata: ");
                    int dur = Integer.parseInt(scanner.nextLine());
                    System.out.print("Volume: ");
                    int vol = Integer.parseInt(scanner.nextLine());
                    System.out.print("Luminosità: ");
                    int lum = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, dur, vol, lum);
                }
                default -> {
                    System.out.println("Tipo non valido.");
                    i--;
                }
            }

            int scelta;
            do {
                System.out.println("\nQuale elemento vuoi eseguire? (1-5, 0 per uscire)");
                scelta = Integer.parseInt(scanner.nextLine());
                if (scelta >= 1 && scelta <= 5) {
                    elementi[scelta - 1].esegui();
                }
            } while (scelta != 0);

            System.out.println("Uscita dal lettore.");
            scanner.close();
        }
    }
}
