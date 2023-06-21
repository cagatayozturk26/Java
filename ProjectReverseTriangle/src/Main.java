import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int basamak;

        Scanner input = new Scanner(System.in);
        System.out.print("Ters üçgenin basamak sayısını giriniz: ");
        basamak = input.nextInt();
        for (int i = 1; i <= basamak; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(" ");
            }
            for (int y = 2 * basamak - (2 * i - 1); y >= 1; y--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}