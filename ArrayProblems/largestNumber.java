package MyDsaJourneyAtAccio.ArrayProblems;

import java.util.Scanner;

public class largestNumber {

    //Largest Number At Least Twice of Others
    //Input
    //4
    //3 6 1 0
    //Output
    //1

    public int LargestElement(int[] nums, int n) {
        // Write your code here
        int max = nums[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }
        return index;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        largestNumber Obj = new largestNumber();
        System.out.println(Obj.LargestElement(nums, n));
    }
}
