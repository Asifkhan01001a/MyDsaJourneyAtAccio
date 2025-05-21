package MyDsaJourneyAtAccio.ArrayProblems;

import java.util.Scanner;

public class sumOfArrayExceptSelf {
    public static int[] SumArrayExpectSelf(int[] nums, int n) {
        //Write code here
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum+nums[j];
            }
            int store=sum-nums[i];
            for(int k=0;k<n;k++){
                ans[i]=store;
            }

        }return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] Ans = SumArrayExpectSelf(nums, n);

        for(int a : Ans)
            System.out.print(a + " ");
    }
}
