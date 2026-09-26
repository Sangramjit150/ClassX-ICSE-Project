package ProjectCode;

import java.util.Scanner;

public class AreaUsingMenuDriven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu Driven Program");
        System.out.println("Enter the choice");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Calculate Area of circle");
                System.out.println("Enter the radius");
                double r=sc.nextDouble();
                double areaCircle=(22/7)*r*r;
                System.out.println("The area of the circle: "+areaCircle);
                break;

            case 2:
                System.out.println("Calculate area of a rectangle");
                System.out.println("Eneter the length");
                int len=sc.nextInt();
                System.out.println("Enter the breadth");
                int bre=sc.nextInt();
                int areaOfrec=len*bre;
                System.out.println("Area of rectangle "+areaOfrec);
                break;

            case 3:
                System.out.println("Calculate area of a triangle");
                System.out.println("Eneter the base");
                int base=sc.nextInt();
                System.out.println("Enter the height");
                int hei=sc.nextInt();
                int areaOftri=base*hei;
                System.out.println("Area of triangle "+areaOftri);
                break;
            case 4:
                System.out.println("Calculate Area of square");
                System.out.println("Enter the side");
                double side=sc.nextDouble();
                double areaSquare=Math.pow(side,2);
                System.out.println("The area of the square: "+areaSquare);
                break;
            default:
                System.out.println("Invalid case");
        }
    }

}
