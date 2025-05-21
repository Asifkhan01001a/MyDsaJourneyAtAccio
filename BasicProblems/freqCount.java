package MyDsaJourneyAtAccio.BasicProblems;

import java.util.Scanner;

public class freqCount {
    static int countFreqDigit(int n,int d)
    {
        // write code here
        int count=0;

        while(n>0){
            int rem = n%10;
            if(rem == d)
                count++;
            n /= 10;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d= sc.nextInt();
        System.out.println(countFreqDigit(n,d));
    }
}
