package MyDsaJourneyAtAccio.BasicProblems;

import java.util.Scanner;

public class BinarytoDecimal {
    public static long binaryToDecimal(long binaryNumber) {
        // write your code here
        long ans=0;
        long mul=1;
        while(binaryNumber!=0){
            long lastbit= binaryNumber%10;
            ans=ans+lastbit*mul;
            mul=mul*2;
            binaryNumber=binaryNumber/10;

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binaryNumber = scanner.nextInt();
        System.out.println(binaryToDecimal(binaryNumber));
        scanner.close();
    }
}
