import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count, sayi, max = 0, min = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        count = input.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        sayi = input.nextInt();
        max = sayi;
        min = sayi;
        for (int i = 1; i <= (count - 1); i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            sayi = input.nextInt();
            if (sayi > max) {
                max = sayi;
            } else {
                min = sayi;
            }

        }
        System.out.print("\nGirilen sayılardan en büyüğü: " + max);
        System.out.print("\nGirilen sayılardan en küçüğü: " + min);
    }
}