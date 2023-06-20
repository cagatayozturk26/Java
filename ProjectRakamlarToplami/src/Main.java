import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, rakamlarToplami = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for (int i = sayi; i != 0; i /= 10) {
            rakamlarToplami = rakamlarToplami + (i%10);
        }
        System.out.print(+rakamlarToplami);
    }
}