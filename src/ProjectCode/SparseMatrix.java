package ProjectCode;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        int sparse[][]=new int[n][m];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sparse[i][j]= sc.nextInt();
            }
        }
        int cntZeros=0;
        int cntNonZero=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(sparse[i][j]==0)
                    cntZeros++;
                else
                    cntNonZero++;
            }
        }
        if(cntZeros>cntNonZero)
            System.out.println("It is a Sparse Matrix");
        else
            System.out.println("It is not a Sparse Matrix");
    }

}
