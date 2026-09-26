package ProjectCode;

import java.util.Scanner;

public class StepTracker {
    String name;
    int sw;
    double cb;
    double km;


    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user name: ");
        name = sc.nextLine();
        System.out.print("Enter total steps walked: ");
        sw = sc.nextInt();
    }
    void calculate() {
        cb = sw * 0.04;
        km = (double) sw / 1300;
    }


    void display() {
        System.out.println("\n--- Step Tracker Summary ---");
        System.out.println("User Name: " + name);
        System.out.println("Steps Walked: " + sw);
        System.out.println("Estimated Calories Burned: " + cb + " kcal");
        System.out.println("Estimated Distance Walked: " + km + " km");
    }

    public static void main(String[] args) {


            StepTracker tracker = new StepTracker();


            tracker.accept();
            tracker.calculate();
            tracker.display();
    }

}
