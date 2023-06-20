import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban, us, sayi = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplamak istediğiniz üslü sayının tabanını giriniz: ");
        taban = input.nextInt();
        System.out.print("Hesaplamak istediğinin üslü sayının üssünü giriniz: ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            sayi *= taban;
        }
        System.out.print("Girmiş olduğunuz " + taban + " üssü " + us + " eşittir: " + sayi);
    }
}