import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number) {
        int reverseNumber = 0, temp = number, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int palindrom;
        Scanner input=new Scanner(System.in);
        System.out.println("Palindrom olabileceğini düşündüğünüz bir sayı giriniz: ");
        palindrom = input.nextInt();
        System.out.println(isPalindrom(palindrom));
    }
}