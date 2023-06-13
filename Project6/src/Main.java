import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, kitleEndeksi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kilogram cinsinden kilonuzu yazınız:");
        kilo = inp.nextDouble();

        System.out.print("Metre cinsinden boyunuzu yazınız:");
        boy = inp.nextDouble();

        kitleEndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz:" + kitleEndeksi);
    }
}