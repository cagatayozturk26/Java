import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int yol;
        double ucret;
        double sonucret;

        Scanner km = new Scanner(System.in);
        System.out.print("Alınan toplam yolu giriniz:");
        yol = km.nextInt();

        ucret = 10 + (yol * 2.20);

        sonucret = ucret<20 ? 20 : ucret;

        System.out.println("Ödenmesi gereken ücret :" + sonucret);
    }
}