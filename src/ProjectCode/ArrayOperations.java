package ProjectCode;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        float arr[]=new float[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(int i=0;i<6;i++){
            arr[i]=sc.nextFloat();
        }
        float sum=0;
        //sum of alternate numbers
        for(int i=0;i<arr.length-1;i=i+2){
            sum=sum+arr[i];
        }
        float pro=1;
        //product of even numbers
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                pro=pro*arr[i];
        }
        float avg=0.0f;
        //average of the numbers lesser than 20;
        int count=0;
        float sum2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<20.0){
                count++;
                sum2=sum2+arr[i];
            }
        }
        avg=sum2/count;
        //Second largest number
        float max=-99;
        float secMax=-99;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
        }
        System.out.println("Sum of alternate numbers "+sum);
        System.out.println("Product if even numbers "+pro);
        System.out.println("Average of numbers less than 20.0 "+avg);
        System.out.println("Second Largest number "+secMax);
        System.out.println("Rounded off elements");
        for(int i=0;i<arr.length;i++){
            int num=Math.round(arr[i]);
            System.out.print(num+" ");
        }
    }

}
