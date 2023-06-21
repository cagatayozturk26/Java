import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Küçük sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("Büyük sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.print(num1 + " ile " + num2 + " arasındaki asal sayılar: ");
        for (int i = num1; i <= num2; i++) {
            int count = 0;
            for (int x = 1; x <= i; x++) {
                if (i % x == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + "\n");
                toplam++;
            }
        }
        System.out.print("\n" + num1 + " ile " + num2 + " arasındaki asal sayılar toplam " + toplam + " tanedir.");
    }
}