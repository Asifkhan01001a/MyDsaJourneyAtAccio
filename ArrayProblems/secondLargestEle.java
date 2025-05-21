package MyDsaJourneyAtAccio.ArrayProblems;

import java.util.Scanner;

public class secondLargestEle {
    public static void SecondLargest(int[] arr, int n) {
        // Write code here
        int larget=arr[0];
        int maxIndex=0;
        for(int i=1;i<n;i++){
            if(arr[i]>larget){
                larget=arr[i];
                maxIndex=i;
            }
        }
        int secondLargest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest&& i!=maxIndex){
                secondLargest=arr[i];

            }
        }
        System.out.println(secondLargest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        SecondLargest(arr,n);
        sc.close();

    }
}
