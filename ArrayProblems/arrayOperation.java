package MyDsaJourneyAtAccio.ArrayProblems;

import java.util.Scanner;

public class arrayOperation {
    public static void main(String[] args) {
        /*Sum of all the elements in the array.
          Average of all the elements in the array (Give the floor value).
          Maximum element in the array.*/

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int[] arr, int n) {
        // Write your code here
        int sum=0;
        int ave=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
            sum=sum+arr[i];
        }
        ave=ave+sum/n;
        System.out.print(sum+" "+ave+" "+max);
    }
}
