import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[5][4];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2 || i == 4) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3)
                    letter[i][j] = " * ";
                else
                    letter[i][j] = "   ";
            }
        }
        letter[2][3] = "   ";

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}