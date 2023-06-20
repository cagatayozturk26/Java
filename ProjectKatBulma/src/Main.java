import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz:");
            x = input.nextInt();
            if (x % 4 == 0)
                total += x;

        } while (x % 2 == 0);
        System.out.println("Toplam:" + total);
    }
}