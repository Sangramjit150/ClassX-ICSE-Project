package ProjectCode;

import java.util.Scanner;

public class BinarySearch {
    public static boolean binarySearch(char arr[],char tar){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar)
                return true;
            else if(arr[mid]>tar){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
       char arr[]={'A','H','N','P','S','U','W','Y','Z','b','d'};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character to be searched");
        char tar=sc.next().charAt(0);
        boolean flag=binarySearch(arr,tar);
        if(flag==true)
            System.out.println("Search Successfull");
        else
            System.out.println("Search Unsuccessfull");
    }

}
