package MyDsaJourneyAtAccio.ArrayProblems;

import java.util.Scanner;

public class arraySubtracting {
    static int[] subtractNormal(int a[],int b[]){
        int n=a.length;
        int m=b.length;
        int sz=Math.max(n,m);
        int ans[]=new int[sz];

        int i=n-1;
        int j=m-1;
        int k=sz-1;

        int borrow=0;

        while(i>=0&&j>=0){

            a[i]=a[i]-borrow;
            if(a[i]<b[j]){
                a[i]+=10;
                borrow=1;

            }
            else borrow=0;
            int currDiff=a[i]-b[j];
            ans[k]=currDiff;
            i--;
            j--;
            k--;
        }
        while(i>=0){

            a[i]=a[i]-borrow;
            borrow=0;
            int currDiff=a[i];
            ans[k]=currDiff;
            i--;
            j--;
            k--;
        }
        return ans;
    }


    static int[] subtract(int[] n1, int[] n2) {
        // your code here


        long value1=0;
        long value2=0;
        for (int i = 0; i < n1.length; i++) {
            value1 = value1 * 10 + n1[i];
        }
        for (int i = 0; i < n2.length; i++) {
            value2 = value2 * 10 + n2[i];
        }
        if(value1>=value2&&n1.length>=n2.length){
            return subtractNormal(n1,n2);
        }
        else{
            System.out.print("-");
            return subtractNormal(n2,n1);
        }
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

        int[] res = subtract(arr1, arr2);
        for (int i : res) System.out.println(i);
    }
}
