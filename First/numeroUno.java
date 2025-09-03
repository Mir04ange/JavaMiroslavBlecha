import java.util.Random;
import java.util.Scanner;

public class numeroUno {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vítej v naší hře, hra spočívá o tom že musíš uniknout ze hry");
        System.out.println("Jdeš do toho, na nic se tě víc neptám xd");

        int hodnota = 0;

        while (hodnota != 3) {
            int k = random.nextInt(2) + 1;  
            int volba = 0;
            boolean validInput = false;

            // Dokud nezada čislo mezi 1-2 tak to bude opakovat
            while (!validInput) {
                System.out.println("Budeš vybírat mezi 1 a 2. (1 = vlevo, 2 = vpravo)");

                if (scanner.hasNextInt()) {
                    volba = scanner.nextInt();
                    if (volba == 1 || volba == 2) {
                        validInput = true;
                    } else {
                        System.out.println("Zadej  číslo 1 nebo 2!");
                    }
                } else {
                    System.out.println("Sakra zadej to cislo nebo jsi zmetek");
                    scanner.next(); // zahodí špatný vstup
                }
            }

            // Informace o volbě
            if (volba == 1) {
                System.out.println("Vybral jsi vlevo");
            } else {
                System.out.println("Vybral jsi vpravo");
            }

            // Vyhodnocení
            if (volba == k) {
                hodnota++;
                System.out.println("Utekl jsi z místnosti!");
                System.out.println("Jsi v místnosti číslo " + hodnota);
            } else {
                System.out.println("Špatně! Zůstal jsi v místnosti.");
                if (hodnota < 0) {
                    
                    if (hodnota <1) {
                        System.out.println("Byl jsi u konce nevadi");
                        
                    }
                    else{
                        System.out.println("Nějak ti to nejde zkousej to dal spat nepujdes dokud to nedodelas");
                    }
                    
                    
                    
                    
                    
                        hodnota = 0;
                }
            }
        }

        System.out.println("Gratuluji! Utekl jsi ze hry!");
        scanner.close();
        
    }
}
