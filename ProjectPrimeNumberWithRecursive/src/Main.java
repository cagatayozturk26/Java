import java.util.Scanner;

public class Main {
    static void primeNumbers() {
        int prime, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("\nBir sayı giriniz: ");
        prime = input.nextInt();
        for (int i = 1; i <= prime; i++) {
            if (prime % i == 0) {
                count++;
            }
        }
        if (prime < 0)
            System.out.print("Negatif sayılarda asallık aranmaz!");
        else if (prime == 1)
            System.out.print("1 şartları sağlasa da asal sayı değildir.");
        else if (count == 2)
            System.out.print("Girdiğiniz sayı ASAL SAYIDIR.");
        else if (prime % 2 == 0 && prime > 2)
            System.out.print("Çift olan sadece 1 tane asal sayı vardır. O da 2'dir.");
        else if(prime==0) {
            System.out.print("Program sonlandırıldı");
            return;
        } else
            System.out.print("Girdiğiniz sayı ASAL SAYI DEĞİLDİR.");
        primeNumbers();
    }

    public static void main(String[] args) {
        primeNumbers();
    }
}