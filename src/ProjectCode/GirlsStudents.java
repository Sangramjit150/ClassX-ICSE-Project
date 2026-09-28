package ProjectCode;

import java.util.Scanner;

public class GirlsStudents {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of girls in VIII A");
        int eightA = Integer.parseInt(sc.nextLine());

        String namesA[] = new String[eightA];

        System.out.println("Enter the names of VIIIA");
        for (int i = 0; i < eightA; i++) {
            namesA[i] = sc.nextLine();
        }

        System.out.println("Enter the marks of VIIIA");
        int marksA[] = new int[eightA];

        for (int i = 0; i < eightA; i++) {
            marksA[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Enter the number of girls in VIII B");
        int eightB = Integer.parseInt(sc.nextLine());

        String namesB[] = new String[eightB];

        System.out.println("Enter the names of VIIIB");
        for (int i = 0; i < eightB; i++) {
            namesB[i] = sc.nextLine();
        }

        System.out.println("Enter the marks of VIIIB");
        int marksB[] = new int[eightB];

        for (int i = 0; i < eightB; i++) {
            marksB[i] = Integer.parseInt(sc.nextLine());
        }

        // Arrays to store combined data
        String namesC[] = new String[eightA + eightB];
        int marksC[] = new int[eightA + eightB];

        int k = 0;

        // Copy VIII-A students
        int i = 0;
        while (i < eightA) {
            namesC[k] = namesA[i];
            marksC[k] = marksA[i];
            i++;
            k++;
        }

        // Copy VIII-B students
        int j = 0;
        while (j < eightB) {
            namesC[k] = namesB[j];
            marksC[k] = marksB[j];
            k++;
            j++;
        }

        System.out.println("VIII-A Girls");
        for (int a = 0; a < namesA.length; a++) {
            System.out.println(namesA[a]);
        }

        System.out.println("VIII-B Girls");
        for (int a = 0; a < namesB.length; a++) {
            System.out.println(namesB[a]);
        }

        // Sort the combined arrays using Selection Sort
        for (int a = 0; a < marksC.length - 1; a++) {

            int minIdx = a;

            for (int b = a + 1; b < marksC.length; b++) {

                if (marksC[b] < marksC[minIdx]) {
                    minIdx = b;
                }
            }

            // Swap names
            String temp = namesC[minIdx];
            namesC[minIdx] = namesC[a];
            namesC[a] = temp;

            // Swap marks
            int temp1 = marksC[minIdx];
            marksC[minIdx] = marksC[a];
            marksC[a] = temp1;
        }

        // Display sorted result
        System.out.println("Girls sorted according to marks:");

        for (int a = 0; a < marksC.length; a++) {
            System.out.println("NAME: " + namesC[a] + " MARKS: " + marksC[a]);
        }

        sc.close();
    }
}