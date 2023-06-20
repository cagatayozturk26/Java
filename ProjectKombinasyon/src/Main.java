import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n, r, x = 1, y = 1, z = 1;


        Scanner input = new Scanner(System.in);
        System.out.print("Kombinasyon için 'n' değeri giriniz: ");
        n = input.nextDouble();
        System.out.print("Kombinasyon için 'r' değeri giriniz: ");
        r = input.nextDouble();
        if (n < r) {
            System.out.println("Hatalı giriş yaptınız!");
        } else {
            for (int i = 1; i <= n; i++) {
                x *= i;
            }
            for (int i = 1; i <= r; i++) {
                y *= i;
            }
            for (int i = 1; i <= n - r; i++) {
                z *= i;
            }
            double combination = x / ((double) y * z);
            System.out.print(+combination);
        }
    }
}