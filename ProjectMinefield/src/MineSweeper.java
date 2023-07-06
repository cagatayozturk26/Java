import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    public static String[][] field(int satir, int sutun) {
        String[][] field = new String[satir][sutun];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = " - ";
            }
        }
        return field;
    }

    public static void printField(String[][] field) {
        for (String[] row : field) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static int hit(int mine, String[][] fieldWithMines, String[][] fieldForPlayer) {
        int x, y;
        for (int i = 1; i <= mine; i++) {
            int count = 0, sayac = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Satır giriniz: ");
            x = input.nextInt();
            System.out.print("Sütun giriniz: ");
            y = input.nextInt();

            if (fieldWithMines[x][y].equals(" * ")) {
                System.out.print("Maalesef mayına bastınız ve oyunu kaybettiniz!!");
                break;

            } else {
                for (int a = x - 1; a <= x + 1; a++) {
                    for (int b = y - 1; b <= y + 1; b++) {
                        if (a < 0 || b < 0 || a > fieldWithMines.length - 1 || b > fieldWithMines[0].length - 1)
                            continue;
                        if (fieldWithMines[a][b] == " * ")
                            count++;
                        fieldForPlayer[x][y] = " " + count + " ";
                        fieldWithMines[x][y] = " " + count + " ";
                    }
                }
            }
            printField(fieldForPlayer);

            for (int z = 0; z < fieldWithMines.length; z++) {
                for (int t = 0; t < fieldForPlayer[0].length; t++) {
                    if (fieldWithMines[z][t].equals(" - "))
                        sayac++;
                }
            }
            if (sayac == 0) {
                System.out.print("Tebrikler mayınlara basmadan tüm kutuları açtınız!!!");
                break;
            }
        }
        return 0;
    }

    public static void mines(String[][] field) {
        int numberOfMines;
        numberOfMines = field.length * field[0].length / 4;
        for (int i = 0; i < numberOfMines; i++) {
            int x, y;
            x = (int) (Math.random() * field.length);
            y = (int) (Math.random() * field[0].length);
            field[x][y] = " * ";
        }
    }

    public static int numberOfMines(String[][] field) {
        int length = field.length * field[0].length;
        return length;
    }

    public static void run(int satir, int sutun) {
        String[][] mineField = new String[satir][sutun];
        String[][] playerField = new String[satir][sutun];

        mineField = field(satir, sutun);
        playerField = field(satir, sutun);
        mines(mineField);
        hit(numberOfMines(mineField), mineField, playerField);

    }
}
