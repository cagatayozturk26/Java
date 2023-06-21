public class Main {
    public static void main(String[] args) {

        System.out.print("1 ile 100 arasındaki asal sayılar: ");
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int x = 1; x <= i; x++) {
                if (i % x == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + ", ");
            }
        }
    }
}