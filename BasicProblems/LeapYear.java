package MyDsaJourneyAtAccio.BasicProblems;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //Write your code here and print the required output
        if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
