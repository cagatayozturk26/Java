import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextInt();

        int toplam = (mat + kimya + fizik + muzik + tarih + turkce);
        double ortalama = toplam / 6;

        if (!((mat < 100) && (fizik < 100) && (kimya < 100) && (turkce < 100) && (tarih < 100) && (muzik < 100))) {
            System.out.println("Hatalı not girişi yapıldı. Lütfen tekrar deneyiniz.");
        } else if (!((mat > 0) && (fizik > 0) && (kimya > 0) && (turkce > 0) && (tarih > 0) && (muzik > 0))) {
            System.out.println("Hatalı not girişi yapıldı. Lütfen tekrar deneyiniz.");
        } else {
            if (ortalama <= 55) {
                System.out.println("Maalesef sınıfı geçemediniz. Seneye tekrar görüşmek üzere.");
            } else {
                System.out.println("Tebrikler sınıfı geçtiniz.");
            }
            System.out.println("Not ortalamanız:" + ortalama);
        }
    }
}