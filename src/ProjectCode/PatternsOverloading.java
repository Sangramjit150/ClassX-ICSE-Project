package ProjectCode;

import java.util.Scanner;

public class PatternsOverloading {
    public void format(){
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public int format(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'\0';
            sum+=val;
        }
        return sum;
    }
    public void format(int n){
        int sum=(n*(n+1))/2;
        System.out.println("The sum "+sum);
        return;
    }
    public static void main(String[] args) {
        PatternsOverloading patt1=new PatternsOverloading();
        patt1.format();
        PatternsOverloading patt2=new PatternsOverloading();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        int ans=patt2.format(str);
        System.out.println(ans);
        PatternsOverloading patt3=new PatternsOverloading();
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        patt3.format(n);
    }

}
