import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıralamak istediğiniz sayıları giriniz:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        if (a < b && a < c) {
            if (b < c) {
                System.out.println("Girilen sayıların sıralaması: a<b<c'dir");
            } else {
                System.out.println("Girilen sayıların sıralaması: a<c<b'dir");
            }
        } else if (b < c && b < a) {
            if (c < a) {
                System.out.println("Girilen sayıların sıralaması: b<c<a'dır");
            } else {
                System.out.println("Girilen sayıların sıralaması: b<a<c'dir");
            }
        } else {
            if (a < b) {
                System.out.println("Girilen sayıların sıralaması: c<a<b'dir");
            } else {
                System.out.println("Girilen sayıların sıralaması: c<b<a'dır");
            }
        }
    }
}