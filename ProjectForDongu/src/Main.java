import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        double ortalama, dongu = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();


        for (int i = 1; i <= sayi; i++) {
            if (i % 12 == 0) {
                toplam += i;
                dongu++;
            }
        }
        ortalama = toplam / dongu;

        System.out.println(ortalama);
    }
}