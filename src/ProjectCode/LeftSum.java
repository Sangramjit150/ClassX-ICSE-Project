package ProjectCode;

import java.util.Scanner;

public class LeftSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mat[][]=new int[3][3];
        System.out.println("Enter the elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int leftSum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    leftSum=leftSum+mat[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal elements "+leftSum);
    }

}
