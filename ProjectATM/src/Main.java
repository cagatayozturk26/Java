import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int username = 122922, password = 240293, bakiye = 5500;
        int girilenUsername, girilenPassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınızı giriniz: ");
        girilenUsername = input.nextInt();
        System.out.print("Lütfen Şifrenizi giriniz: ");
        girilenPassword = input.nextInt();
        if (girilenUsername == username && girilenPassword == password) {
            System.out.print("Giriş başarılı şekilde gerçekleştirildi.\n1- Para Yatırma\n2- Para Çekme\n3- Şifre Değiştirme\nHangi işlemi yapmak istiyorsunuz: ");
            int islem = input.nextInt();
            switch (islem) {
                case 1:
                    System.out.print("Yatırmak istediğiz miktarı giriniz: ");
                    int paraYatir = input.nextInt();
                    bakiye += paraYatir;
                    System.out.print("Bakiye= " + bakiye);
                    break;
                case 2:
                    System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                    int paraCek = input.nextInt();
                    if (paraCek > bakiye) {
                        System.out.print("Yeterli bakiyeniz bulunmamaktadır.");
                    } else {
                        bakiye -= paraCek;
                        System.out.print("Bakiye= " + bakiye);
                    }
                    break;
                case 3:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    password = input.nextInt();
                    System.out.print("Şifreniz başarılı bir şekilde değiştirilmiştir.");
                    break;
                default:
                    System.out.print("Yanlış giriş yaptınız.");
            }
        } else {
            System.out.print("Kullanıcı veya Şifre hatalı. Lütfen yeniden giriş yapınız.");
        }
    }
}