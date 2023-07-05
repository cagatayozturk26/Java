import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretNumber, count = 0, guess;
        secretNumber = (int) (Math.random() * 100);

        Scanner inp = new Scanner(System.in);

        while (count < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            guess = inp.nextInt();
            if (guess <= 0 || guess >= 100) {
                System.out.println("Lütfen 1 ile 100 arasında tahminde bulunun !!! ");
                continue;
            }

            if (guess == secretNumber) {
                System.out.println("Tebrikler gizli sayıyı buldunuz !!! ");
                break;
            }
            if (count == 4) {
                if (guess != secretNumber) {
                    System.out.println("Son hakkınızı da kullandınız ancak gizli sayıyı tahmin edemediniz.");
                    System.out.println("Gizli sayı : " + secretNumber + " idi.");
                    break;
                }
            }
            if (guess > secretNumber) {
                count++;
                System.out.println("Tahmininiz gizli sayıdan büyük.");
                System.out.println((5 - count) + " hakkınız kaldı.");
            } else {
                count++;
                System.out.println("Tahmininiz gizli sayıdan küçük.");
                System.out.println((5 - count) + " hakkınız kaldı.");
            }
            if (Math.abs(guess - secretNumber) <= 5)
                System.out.println("Tahmininizin gizli sayıya uzaklığı 5 ve daha az.");
        }
    }
}