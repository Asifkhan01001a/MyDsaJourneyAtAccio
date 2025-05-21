package MyDsaJourneyAtAccio.Patterns;

import java.util.Scanner;

public class PrintContinuousCharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        // write code here
        for (int i = 0; i < n; i++) {
            int start = i; // Starting offset from 'A'
            for (int j = 0; j <= i; j++) {
                char ch = (char) ('A' + (start % 26)); // Wrap around after 'Z'
                System.out.print(ch);
                start++;
            }
            System.out.println();
        }

    }
}
