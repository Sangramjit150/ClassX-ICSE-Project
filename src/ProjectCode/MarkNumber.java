package ProjectCode;

import java.util.Scanner;

public class MarkNumber {
    public static boolean checkMark(int n){
        int temp=n;
        int sum=0;
        while (temp>0){
            int d=temp%10;
            sum=sum+d*d;
            temp=temp/10;
        }
        int lastDigit=0;
        lastDigit=sum%10;
        temp=n;
        int last=temp%10;
        if(sum%2==0 && last==lastDigit)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean flag=checkMark(n);
        if(flag==true)
            System.out.println("It is a mark number");
        else
            System.out.println("It is not a mark number");
    }

}
