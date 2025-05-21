package MyDsaJourneyAtAccio.ArrayProblems;

import java.util.Scanner;

public class rotateArray {
    public static void rotate(int[] arr,int n){
        int last=arr[n-1];
        for(int i=n-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }

    public static void rotate1(int[] arr,int n){
        int last=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=last;
    }
    public static void rotateArray(int[] nums, int k) {
        // write your code here
        int n=nums.length;
        for(int i=0;i<(k%n)+n;i++){
            rotate(nums,n);
        }




    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        rotateArray(arr, k);

        for(int num : arr){
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
