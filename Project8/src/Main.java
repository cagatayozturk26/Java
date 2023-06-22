import java.util.Scanner;

public class Main {
    static void metot() {
        int x, tempx;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        x = input.nextInt();
        tempx = x;
        System.out.print("Çıktısı: ");
        do {
            tempx -= 5;
            System.out.print(tempx + " ");
        } while (tempx > 0);
        do {
            tempx += 5;
            System.out.print(tempx + " ");
        } while (tempx != x);
    }

    public static void main(String[] args) {
        metot();
    }
}