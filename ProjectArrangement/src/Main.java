import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lengt;

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin uzunluğunu giriniz: ");
        lengt = input.nextInt();

        int[] list = new int[lengt];

        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < lengt; i++) {
            System.out.print((i + 1) + ". eleman: ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sıralama: ");
        System.out.println(Arrays.toString(list));

    }
}