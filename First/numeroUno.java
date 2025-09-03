import java.util.Random;
import java.util.Scanner;

public class numeroUno {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vítej v naší hře, hra spočívá o tom že musis uniknout ze hry");
        System.out.println("Jdes do toho na nic se te vic neptam xd");

        int hodnota = 0;

        while (hodnota != 3) {
            // 1 nebo 2
            int k = random.nextInt(2) + 1;  

            System.out.println("Budeš vybírat mezi 1 a 2. (1 = vlevo, 2 = vpravo)");
            int volba = scanner.nextInt();

            if (volba == 1) {
                System.out.println("Vybral jsi vlevo");
            } else {
                System.out.println("Vybral jsi vpravo");
            }

            if (volba == k) {
                hodnota++;
                System.out.println("Utekl jsi z místnosti!");
                System.out.println("Jsi v místnosti číslo " + hodnota);
            } else {
                System.out.println("Špatně vracis se na začátek.");

                if (hodnota < 0 ) {
                    hodnota = 0;
                    System.out.println("Měl jsi " + hodnota + " ztratil jsi vše");
                }
            }
        }

        System.out.println("Gratuluji! Utekl jsi ze hry!");
    }
}
