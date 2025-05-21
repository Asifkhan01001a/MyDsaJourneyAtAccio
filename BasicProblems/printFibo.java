package MyDsaJourneyAtAccio.BasicProblems;

import java.util.Scanner;

public class printFibo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //Write code here
        int first=0;
        int second=1;
        int third=0;
        for(int i=0;i<n;i++){

            third=first+second;
            System.out.println(first);
            first=second;
            second=third;
        }
    }
}
