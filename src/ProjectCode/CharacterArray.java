package ProjectCode;

import java.util.Scanner;

public class CharacterArray {
    public static boolean checkPalindrome(char arr[]){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if(arr[i]!=arr[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of characters");
        int n=Integer.parseInt(sc.nextLine());
        char arr[]=new char[n];
        System.out.println("Enter the characters");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine().charAt(0);
        }
        //Check palindrome
        boolean flag=checkPalindrome(arr);
        if(flag==true)
            System.out.println("It forms a palindrome");
        else
            System.out.println("It doesnot form palindrome");

        //Arrange the elements in descending order
        for(int i=0;i<arr.length-1;i++){
            int maxIdx=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[maxIdx]<arr[j]){
                    char temp=arr[maxIdx];
                    arr[maxIdx]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements in descending order");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int lowerCount=0;
        for(int i=0;i<n;i++){
            char ch=arr[i];
            if(Character.isLowerCase(ch)==true)
                lowerCount++;
        }
        System.out.println("Number of lowerCase elements "+lowerCount);
        System.out.print("UpperCase Characters ");
        for(int i=0;i<n;i++){
            char ch=arr[i];
            if(Character.isUpperCase(ch))
                System.out.print(ch+" ");
        }
        System.out.println();
        int countSpaces=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' ')
                countSpaces++;
        }
        System.out.println("Number of Spaces "+countSpaces);
        int special=0;
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(Character.isDigit(ch) || Character.isEmoji(ch))
                special++;
        }
        System.out.println("Number of digits or special characters "+special);
        int countb=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='b' || arr[i]=='B')
                countb++;
        }
        System.out.println("Number of b's "+countb);
    }

}
