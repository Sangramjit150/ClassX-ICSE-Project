package ProjectCode;

import java.util.Scanner;

public class ShowRoom {
    String name;
    long mobNo;
    double cost;
    double dis;
    double amt;
    ShowRoom(){

    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of the instance variables");
        name=sc.nextLine();
        mobNo=sc.nextLong();
        cost=sc.nextDouble();
    }
    void calculate(){
        if(cost<=10000){
            dis=0.05*cost;
            amt=cost-dis;
        } else if (cost>10000 && cost<=20000) {
            dis=0.10*cost;
            amt=cost-dis;
        }
        else if (cost>20000 && cost<=35000) {
            dis=0.15*cost;
            amt=cost-dis;
        }
        else {
            dis=0.20*cost;
            amt=cost-dis;
        }
    }

    void display(){
        System.out.println("Name of the customer "+name);
        System.out.println("Mobile number "+mobNo);
        System.out.println("Amount to be paid after discount "+amt);
    }
    public static void main(String[] args) {
        ShowRoom showRoom=new ShowRoom();
        showRoom.input();
        showRoom.calculate();
        showRoom.display();
    }

}
