import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz:");
        year = input.nextInt();
        if (year % 400 == 0) {
            System.out.println("Girilen yıl artık yıldır.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Girilen yıl artık yıldır.");
        } else {
            System.out.println("Girilen yıl artık yıl değildir.");
        }
    }
}