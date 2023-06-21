import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, tercih, ebobekok = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Ebob veya Ekok'unu bulmak istediğiniz küçük sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("Büyük sayıyı giriniz: ");
        num2 = input.nextInt();
        System.out.print("Ebob için 1'i, Ekok için 2'yi seçiniz: ");
        tercih = input.nextInt();

        if (tercih == 1) {
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebobekok = i;
                }
            }
            System.out.print("Girilen sayıların EBOB'u: " + ebobekok);
        } else if (tercih == 2) {
            for (int i = num2 * num1; i >= num2; i--) {
                if (i % num1 == 0 && i % num2 == 0) {
                    ebobekok = i;
                }
            }
            System.out.print("Girilen sayıların EKOK'u: " + ebobekok);
        } else {
            System.out.print("Yanlış giriş yaptınız!\nProgram sonlandırıldı.");
        }
    }
}