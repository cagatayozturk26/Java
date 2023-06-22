import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    static int exp() {
        int taban, us, sonuc = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        taban = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        us = input.nextInt();
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.print(exp());
    }
}