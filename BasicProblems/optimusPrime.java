package MyDsaJourneyAtAccio.BasicProblems;

import java.util.Scanner;

public class optimusPrime {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Optimized prime check: check divisibility up to sqrt(i)
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
