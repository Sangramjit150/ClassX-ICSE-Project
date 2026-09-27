package ProjectCode;

import java.util.Scanner;

public class CountWordsWithA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sen=sc.nextLine();
        sen=sen.toUpperCase();
        String arr[]=sen.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            if(word.charAt(0)=='A'){
                count++;
            }
        }
        System.out.println("Number of words starting with A "+count);

    }

}
