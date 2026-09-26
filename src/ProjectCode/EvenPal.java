package ProjectCode;

import java.util.Scanner;

public class EvenPal {
    public static boolean checkEvenPal(int n){
        int rev=0;
        int temp=n;
        while (temp>0){
            int d=temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }

        temp=n;
        int sumOfDigits=0;
        while (temp>0){
            int d=temp%10;
            sumOfDigits+=d;
            temp=temp/10;
        }

        if(sumOfDigits%2==0 && rev==n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean flag=checkEvenPal(n);
        if(flag==true){
            System.out.println("It is an evenPal number");
        }
        else
            System.out.println("It is not an evenPal number");
    }

}
