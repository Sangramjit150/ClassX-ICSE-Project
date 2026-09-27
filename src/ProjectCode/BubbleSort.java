package ProjectCode;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(char arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of characters");
        int n=sc.nextInt();
        char arr[]=new char[n];
        System.out.println("Enter the characters");
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        bubbleSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
