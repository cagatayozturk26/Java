import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int range, customer, type;
        double price;

        Scanner input = new Scanner(System.in);
        System.out.print("Yolculuk yapılacak mesafeyi giriniz:");
        range = input.nextInt();
        System.out.print("Yolculuk yapacak kişi 12 yaşından küçükse 1'i, 12-24 yaşları arasında ise 2'yi, 65 yaşından büyük ise 3'ü, bunların hiçbirine girmiyorsa 4'ü tuşlayınız:");
        customer = input.nextInt();
        System.out.print("Yolculuk tek yön ise 1'i gidiş-dönüş ise 2'yi tuşlayınız:");
        type = input.nextInt();

        if (range >= 400 && range <= 2000) {
            if (customer == 1) {
                if (type == 1) {
                    price = range * 0.1 * 0.5;
                    System.out.println("Bilet ücreti:" + price);
                } else if (type == 2) {
                    price = range * 0.1 * 0.5 * 2 * 0.8;
                    System.out.println("Bilet ücreti:" + price);
                } else {
                    System.out.println("Hatalı giriş yapıldı.");
                }
            } else if (customer == 2) {
                if (type == 1) {
                    price = range * 0.1 * 0.9;
                    System.out.println("Bilet ücreti:" + price);
                } else if (type == 2) {
                    price = range * 0.1 * 0.9 * 2 * 0.8;
                    System.out.println("Bilet ücreti:" + price);
                } else {
                    System.out.println("Hatalı giriş yapıldı.");
                }
            } else if (customer == 3) {
                if (type == 1) {
                    price = range * 0.1 * 0.7;
                    System.out.println("Bilet ücreti:" + price);
                } else if (type == 2) {
                    price = range * 0.1 * 0.7 * 2 * 0.8;
                    System.out.println("Bilet ücreti:" + price);
                } else {
                    System.out.println("Hatalı giriş yapıldı.");
                }
            } else if (customer == 4) {
                if (type == 1) {
                    price = range * 0.1;
                    System.out.println("Bilet ücreti:" + price);
                } else if (type == 2) {
                    price = range * 0.1 * 2 * 0.8;
                    System.out.println("Bilet ücreti:" + price);
                } else {
                    System.out.println("Hatalı giriş yapıldı.");
                }
            }
        } else {
            System.out.println("Girilen mesafede uçak yolculuğu yapılamaz");
        }
    }
}