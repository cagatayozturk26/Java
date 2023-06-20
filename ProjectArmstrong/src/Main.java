import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, power = 0, tempSayi, rakam = 0, sonuc = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Armstrong sayı olabileceğini düşündüğünüz bir sayı giriniz: ");
        sayi = input.nextInt();
        tempSayi = sayi;
        while (tempSayi != 0) {
            tempSayi /= 10;
            power++;
        }
        tempSayi = sayi;
        while (tempSayi != 0) {
            int kRakam=1;
            rakam = tempSayi % 10;
            for (int i = 1; i <= power; i++) {
                kRakam *= rakam;
            }
            sonuc += kRakam;
            tempSayi /= 10;
        }
        if (sonuc == sayi){
            System.out.print("Girilen sayı Armstrong sayıdır.");
        } else {
            System.out.print("Girilen sayı Armstrong sayı değildir.");
        }
    }
}