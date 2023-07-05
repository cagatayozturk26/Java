import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void fillArray(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double randomValue = Math.random() * 1000;
            list[i] = randomValue;
        }
    }

    public static double maxValue(double[] list) {
        double max = 0.0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }

    public static double minValue(double[] list) {
        double min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }
        return min;
    }

    public static void main(String[] args) {
        double[] arr1 = new double[5];
        fillArray(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("Dizinin en küçük değeri = " + minValue(arr1));
        System.out.println("Dizinin en büyük değeri = " + maxValue(arr1));
    }
}