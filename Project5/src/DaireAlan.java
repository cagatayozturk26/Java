import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double pi = 3.14, daireAlan, daireCevre, dilimAlan, dilimCevre;
        int r, a;

        Scanner radius = new Scanner(System.in);
        System.out.print("Yarıçap'ı Giriniz :");
        r = radius.nextInt();

        Scanner slice = new Scanner(System.in);
        System.out.print("Daire Diliminin Açısını Giriniz:");
        a = slice.nextInt();

        daireAlan = pi * r * r;
        daireCevre = pi * r * 2;
        dilimAlan = pi * r * r * a / 360;
        dilimCevre = (pi * r * 2 * a / 360) + (2 * r);

        System.out.println("Yarıçapını girdiğiniz dairenin alanı: " + daireAlan);
        System.out.println("Yarıçapını girdiğiniz çemberin çevresi: " + daireCevre);
        System.out.println("Açısını ve yarıçapını girdiğiniz daire diliminin alanı:" + dilimAlan);
        System.out.println("Açısını ve yarıçapını girdiğiniz daire diliminin çevresi:" +dilimCevre);
    }
}