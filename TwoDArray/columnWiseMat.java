package MyDsaJourneyAtAccio.TwoDArray;

import java.util.Scanner;

public class columnWiseMat {
    public void printMatrixColumnwise(int[][] mat, int n, int m) {
        // Write code here and print output
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(mat[i][j]+" ");
            } // }System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            int n;
            int m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    matrix[i][j] = sc.nextInt();
            columnWiseMat Obj = new columnWiseMat();
            Obj.printMatrixColumnwise(matrix, n, m);
            System.out.println();
            t--;
        }
        sc.close();
    }
}
