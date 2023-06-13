import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double tutar,kdvOran,kdvlitutar,kdvtutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ürün KDV'siz Tutarını Giriniz:");
        tutar = inp.nextDouble();

        kdvOran = tutar>1000 ? 8 : 18;
        kdvtutar = tutar * kdvOran / 100;
        kdvlitutar = tutar + kdvtutar;

        System.out.println("Ürünün KDV'siz Fiyatı :" + tutar);
        System.out.println("Ürünün KDV Oranı :" + kdvOran / 100);
        System.out.println("Ürünün KDV'si :" + kdvtutar);
        System.out.println("Ürünün KDV'li Fiyatı :" + kdvlitutar);
    }
}