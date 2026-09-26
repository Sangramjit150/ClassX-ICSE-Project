package ProjectCode;

import java.util.Scanner;

public class SeriesOverloading {
    public void series(int x,int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=x*i;
        }
        System.out.println("The sum of the series1 is "+sum);
    }
    public void series(int p){
        for(int i=1;i<=p;i++){
            double val=Math.pow(i,3)-1;
            System.out.print(val+" ");
        }
    }
    public void series(){
        double sum=0;
        int m=2;
        for(int i=1;i<10;i++){
            sum=sum+i/m;
            m++;
        }
        System.out.println("The sum of series3 "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=sc.nextInt();
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        SeriesOverloading series1=new SeriesOverloading();
        series1.series(x,n);
        System.out.println("Enter the value of p");
        int p=sc.nextInt();
        SeriesOverloading series2=new SeriesOverloading();
        series2.series(p);
        SeriesOverloading series3=new SeriesOverloading();
        series3.series();
    }

}
