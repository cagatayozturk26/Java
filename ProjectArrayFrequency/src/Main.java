import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int length;

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin uzunluğunu giriniz: ");
        length = input.nextInt();

        int[] list = new int[length];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". eleman: ");
            list[i] = input.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            int count = 0;
            int sayac = 0;
            for (int k = 0; k < i; k++) {
                if (list[k] == list[i])
                    sayac++;
            }
            if (sayac == 0) {
                for (int j = 0; j < list.length; j++) {
                    if (list[j] == list[i])
                        count++;
                }
            }
            if (sayac != 0)
                continue;
            System.out.println(list[i] + " sayısı " + count + " kere yazıldı.");
        }
    }
}