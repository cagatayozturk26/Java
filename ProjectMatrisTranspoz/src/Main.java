import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int satir, sutun;

        Scanner input = new Scanner(System.in);
        System.out.print("Satır bilgisini giriniz: ");
        satir = input.nextInt();
        System.out.print("Sütun bilgisini giriniz: ");
        sutun = input.nextInt();

        int[][] matris = new int[satir][sutun];
        int[][] matrisTranspose = new int[sutun][satir];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        for (int i = 0; i < matrisTranspose.length; i++) {
            for (int j = 0; j < matrisTranspose[i].length; j++) {
                matrisTranspose[i][j] = matris[j][i];
            }
        }
        System.out.println("Girdiğiniz satır ve sütun bilgisine göre rastgele oluşturulan matris: ");
        for (int i = 0; i < matris.length; i++)
            System.out.println(Arrays.toString(matris[i]));

        System.out.println("Oluşturulan matrisin transpozu: ");
        for (int i = 0; i < matrisTranspose.length; i++)
            System.out.println(Arrays.toString(matrisTranspose[i]));
    }
}