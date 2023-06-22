import java.util.Scanner;

public class Main {
    static int fibonacci(int x) {
        if (x == 1 || x == 2)
            return 1;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static void main(String[] args) {
        int fib;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaçıncı sıradaki fibonacci değerini istiyorsunuz: ");
        fib = input.nextInt();

        System.out.print("İstediğiniz fibonacci değeri: " + fibonacci(fib));
    }
}