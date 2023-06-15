import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newpassword1, newpassword2;
        int istek;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı Giriniz:");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        password = input.nextLine();

        if (userName.equals("Cagatay.Ozturk") && password.equals("1234cgty")) {
            System.out.println("Giriş başarılı bir şekilde gerçekleştirildi.");

        } else {
            System.out.println("Giriş başarısız. Kullanıcı adı veya şifre hatalı.");
            System.out.println("Şifrenizi sıfırlamak istiorsanız 1'i istemiyorsanız 2'yi tuşlayınız:");
            istek = input.nextInt();
            if (istek == 1) {
                Scanner inp = new Scanner(System.in);
                System.out.print("Yeni şifre giriniz:");
                newpassword1 = inp.nextLine();

                System.out.print("Şifrenizi tekrar giriniz:");
                newpassword2 = inp.nextLine();
                if (newpassword1.equals(newpassword2)) {
                    System.out.print("Şifreniz başarılı bir şekilde oluşturuldu.");
                } else {
                    System.out.print("Farklı şifre girdiniz.\nİyi günler.");
                }

            } else if (istek == 2) {
                System.out.println("Kullanıcı veya şifrenizi doğru girerek tekrar deneyiniz.");
            } else {
                System.out.println("Yanlış tuşlama yaptınız.\nİyi günler.");
            }
        }

    }
}