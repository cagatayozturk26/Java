import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pNumber, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        pNumber = input.nextInt();

        for (int i = 1; i < pNumber; i++) {
            if (pNumber % i == 0) {
                toplam += i;
            }
        }
        if (toplam==pNumber){
            System.out.print("Tebrikler MÜKEMMEL SAYI buldunuz!!!");
        }else {
            System.out.print("Maalesef girilen sayı Mükemmel Sayı değil. Lütfen tekrar deneyiniz.");
        }

    }
}