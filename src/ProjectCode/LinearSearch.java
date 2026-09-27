package ProjectCode;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        double arr[]=new double[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<20;i++){
            arr[i]=sc.nextDouble();
        }
        System.out.println("Enter the element to be searched");
        double tar=sc.nextDouble();
        int idx=-1;
        for(int i=0;i<20;i++){
            if(arr[i]==tar)
                idx=i;
        }
        if(idx!=-1)
            System.out.println("The element is present at "+idx);
        else
            System.out.println("The element is absent");
    }

}
