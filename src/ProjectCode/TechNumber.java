package ProjectCode;

import java.util.Scanner;

public class TechNumber {
    public static boolean checkTech(int n){
        int temp=n;
        int cnt=0;
        while (temp>0){
            int d=temp%10;
            cnt++;
            temp=temp/10;
        }
        int power=cnt/2;
        int sum=0;
        temp=n;
        while (temp>0){
            double d=temp%Math.pow(10,power);
            int t=(int)d;
            sum+=t;
            double d1=temp/Math.pow(10,power);
            temp=(int)d1;
        }
        int sq=sum*sum;
        if(sq==n && cnt%2==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean flag=checkTech(n);
        if(flag==true)
            System.out.println("It is a tech number");
        else
            System.out.println("It is not a tech number");
    }

}
