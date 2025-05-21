package MyDsaJourneyAtAccio.ArrayProblems;

import java.util.Scanner;

public class maxDifferenceArray {
//    Maximum difference between two elements in an Array
//    Input
//    4
//    16 24 89 35
//    Output
//    73

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        ArrayProblem(arr);
    }

    public static void ArrayProblem(int []arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int min=arr[0];
        for(int j=0;j<arr.length;j++){
            min=Math.min(min,arr[j]);
        }
        int ans=max-min;
        if(ans>=0){
            System.out.println(ans);
        }
    }
}
