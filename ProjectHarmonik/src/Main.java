import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kesir, sonuc = 0;
        int harmonic;
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik seri istenilen sayı giriniz: ");
        harmonic = input.nextInt();

        for (int i = 1; i <= harmonic; i++) {
            kesir = 1.0 / i;
            sonuc += kesir;
        }
        System.out.println("İstenilen sayıdaki harmonik seri elemanları toplamı= " + sonuc);
    }
}