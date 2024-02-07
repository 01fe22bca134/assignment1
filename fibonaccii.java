import java.util.Scanner;

public class fibonaccii {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ur range");
        int n = scanner.nextInt();
        int[] marks = new int[n];
        System.out.println("Fibonacci Series up to " + n + ":");
        for (int i = 0; fibonacci(i) <= n; i++) {
            System.out.print(fibonacci(i) + "\t");
        }
        for (int i = 0; fibonacci(i) <= marks.length; i++) {
            marks[i] = fibonacci(i);

        }
        int nth;
        System.out.print("\n enter the nth term u want btw 0 - " + n);
        nth = scanner.nextInt();
        System.out.print(marks[nth] + "\t");
        scanner.close();

    }

}
