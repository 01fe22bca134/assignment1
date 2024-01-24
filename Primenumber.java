public class Primenumber {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 89;
        for (int i = x1; i < x2; i++) {
            int factors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }
            if (factors == 2) {
                System.out.println(i);
            }
        }
    }

}
