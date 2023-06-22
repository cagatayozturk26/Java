import java.util.Scanner;

public class Main {
    static void toplama() {
        int number, i = 1, toplam = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();
            if (number == 0)
                break;
            toplam += number;
            i++;
        }
        System.out.print("Girdiğiniz sayıların toplamı: " + toplam);
    }

    static void cikarma() {
        int sonuc = 0, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int adet = input.nextInt();
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();
            if (i == 1) {
                sonuc += number;
                continue;
            }
            sonuc -= number;
        }
        System.out.print("Sonuç: " + sonuc);
    }

    static void carpma() {
        int number, i = 1, carpim = 1;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();
            if (number == 1)
                break;
            carpim *= number;
            if (number == 0) {
                carpim = 0;
                break;
            }
            i++;
        }
        System.out.print("Girdiğiniz sayıların çarpımı: " + carpim);
    }

    static void bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void usAlma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void faktoriyel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void modalma() {
        int bolunen, bolen, mod;
        Scanner input = new Scanner(System.in);
        System.out.println("Bölüneni giriniz: ");
        bolunen = input.nextInt();
        System.out.print("Böleni giriniz: ");
        bolen = input.nextInt();
        mod = bolunen % bolen;
        System.out.print(bolunen + "'in " + bolen + "'e bölümünden kalan: " + mod);
    }

    static void dikdortgen() {
        int k1, k2, alan, cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin kenarlarını giriniz: ");
        k1 = input.nextInt();
        k2 = input.nextInt();

        alan = k1 * k2;
        cevre = (k1 + k2) * 2;
        System.out.print("Dikdörtgenin çevresi: " + cevre);
        System.out.print("\nDikdörtgenin alanı: " + alan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "\n1- Toplama işlemi\n"
                + "2- Çıkarma işlemi\n"
                + "3- Çarpma işlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü sayı hesaplama\n"
                + "6- Faktoriyel hesaplama \n"
                + "7- Mod alma\n"
                + "8- Dikdörtgenin alanı ve çevresini hesaplama\n"
                + "0- Çıkış yap\n";

        do {
            System.out.print(menu);
            System.out.print("Lütfen işlem seçiniz: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modalma();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Yanlış giriş yaptınız!");
            }
        } while (select != 0);


    }
}