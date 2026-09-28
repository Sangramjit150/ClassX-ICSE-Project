package ProjectCode;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        char arr[]=s.toCharArray(); //library function to convert a String into a character array
        //Using two pointers we will reverse the array
        int i=0,j=arr.length-1;
        while (i<=j){
            //swap the elements
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

}
