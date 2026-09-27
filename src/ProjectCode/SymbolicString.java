package ProjectCode;

import java.util.Scanner;

public class SymbolicString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s.toUpperCase();
        String ans="";
        String voweles="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                voweles=voweles+s.charAt(i);
            }
            else {
                ans=s.substring(i,s.length());
                break;
            }
        }
        ans=ans+voweles+"TR";
        System.out.println("The Symbolic String "+ans);
    }

}
