package ProjectCode;

import java.util.Scanner;

public class PronicNumber {
    public static boolean checkPronic(int n){
        int temp=n;
        for(int i=1;i<n;i++){
            int pro=1;
            pro=i*(i+1);
            if(pro==temp)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean flag=checkPronic(n);
        if(flag==true)
            System.out.println("It is a pronic number");
        else
            System.out.println("It is not a pronic number");
    }

}
