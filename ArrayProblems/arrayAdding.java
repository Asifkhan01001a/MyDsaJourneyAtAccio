package MyDsaJourneyAtAccio.ArrayProblems;

import java.util.Scanner;

public class arrayAdding {
    static int[] calSum(int a[], int b[], int n, int m) {
        // your code here
        int carry=0;
        int i=n-1;
        int j=m-1;
        int k=Math.max(m,n);
        int ans[]=new int[k] ;
        int h=k-1;

        while(i>=0||j>=0){
            int sum=0;
            if(i>=0){
                sum+=a[i];
                i--;
            }
            if(j>=0){
                sum+=b[j];
                j--;
            }
            sum+=carry;
            ans[h]=sum%10;
            carry=sum/10;
            h--;
        }
        if(carry>0){

            int newArr[]=new int[k+1];
            int y=0;
            newArr[0]=carry;
            for(int x=1;x<newArr.length;x++){
                newArr[x]=ans[y];
                y++;
            }

            return newArr;
        }
        return ans;

    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();

        int[] res = calSum(arr1, arr2, n1, n2);
        for (int i : res) System.out.println(i);
    }
}
