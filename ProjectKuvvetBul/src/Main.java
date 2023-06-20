import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        x = input.nextInt();
        System.out.print("Girilen sayıdan küçük 4'ün kuvvetleri: ");
        for (int i = 1; i <= x; i *= 4) {
            if (i <= x) {
                System.out.print(i + ", ");
            }
        }

        System.out.print("\nGirilen sayıdan küçük 5'ün kuvvetleri: ");
        for (int i = 1; i <= x; i *= 5) {
            if (i <= x) {
                System.out.print(i + ", ");
            }
        }
    }
}