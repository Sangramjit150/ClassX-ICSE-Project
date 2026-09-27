package ProjectCode;

import java.util.Scanner;

public class StudentsMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = Integer.parseInt(sc.nextLine());
        String names[]=new String[n];
        int marks[]=new int[n];
        double deviation[]=new double[n];
        System.out.println("Enter the names");
        for(int i=0;i<n;i++){
            names[i]=sc.nextLine();
        }
        System.out.println("Enter the marks");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        int totalMarks=0;
        for(int i=0;i<n;i++){
            totalMarks+=marks[i];
        }
        double avg=totalMarks/n;
        for(int i=0;i<n;i++){
            deviation[i]=marks[i]-avg;
        }
        for(int i=0;i<n;i++){
            System.out.println(names[i]+" "+marks[i]+" "+deviation[i]);
        }
    }

}
