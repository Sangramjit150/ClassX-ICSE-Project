package ProjectCode;

import java.util.Scanner;

public class CapitaliseFirstLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sen=sc.nextLine();
        sen=sen.toLowerCase();
        String arr[]=sen.split(" ");

        String ans="";
        for(int i=0;i<arr.length;i++) {
            String word = arr[i];
            char ch=word.charAt(0);
            ch=Character.toUpperCase(ch);
            word=ch+word.substring(1,word.length());
            ans=ans+word+" ";
        }
        System.out.println("The result "+ans);
    }

}
