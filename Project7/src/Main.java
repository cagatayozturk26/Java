import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlican = 5, total;
        int fElma, fArmut, fDomates, fMuz, fPatlican;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Kilo Elma Alındı? ");
        fElma = inp.nextInt();

        System.out.print("Kaç Kilo Armut Alındı? ");
        fArmut = inp.nextInt();

        System.out.print("Kaç Kilo Domates Alındı? ");
        fDomates = inp.nextInt();

        System.out.print("Kaç Kilo Muz Alındı? ");
        fMuz = inp.nextInt();

        System.out.print("Kaç Kilo Patlıcan Alındı? ");
        fPatlican = inp.nextInt();

        total = (elma * fElma) + (armut * fArmut) + (domates * fDomates) + (muz * fMuz) + (patlican * fPatlican);

        System.out.println("Toplam ödenmesi gereken: " + total);

    }
}