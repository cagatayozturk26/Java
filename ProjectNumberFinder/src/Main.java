import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void randomList(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double randomValue = Math.random() * 100;
            list[i] = randomValue;
        }
    }

    public static void min(double[] list, int x) {
        Arrays.sort(list);
        double temp = list[list.length - 1];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (x < list[i])
                count++;
        }
        if (count == 0) {
            System.out.println("Dizide girilen sayından büyük sayı bulunmamaktadır.");
        } else {
            for (int i = 0; i < list.length; i++) {
                if (x < list[i]) {
                    if (list[i] < temp)
                        temp = list[i];
                }
            }
            System.out.println("Girilen sayıdan büyük en küçük sayı = " + temp);
        }
    }

    public static void max(double[] list, int x) {
        Arrays.sort(list);
        double temp = list[0];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (x > list[i])
                count++;
        }
        if (count == 0) {
            System.out.println("Dizide girilen sayından küçük sayı bulunmamaktadır.");
        } else {
            for (int i = 0; i < list.length; i++) {
                if (x > list[i]) {
                    if (list[i] > temp)
                        temp = list[i];
                }
            }
            System.out.println("Girilen sayıdan küçük en büyük sayı = " + temp);
        }
    }

    public static void main(String[] args) {
        int value;
        int length;

        Scanner inp = new Scanner(System.in);

        System.out.print("Oluşturmak istediğiniz listenin uzunluğunu giriniz: ");
        length = inp.nextInt();
        double[] list = new double[length];
        randomList(list);

        System.out.print("0 ile 100 arasında karşılaştırmak istediğiniz bir değer giriniz:");
        value = inp.nextInt();

        System.out.println(Arrays.toString(list));
        max(list, value);
        min(list, value);
    }
}