public class fibonaccii {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int givenNumber = 100;

        System.out.println("Fibonacci Series up to " + givenNumber + ":");

        for (int i = 0; fibonacci(i) <= givenNumber; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

}
