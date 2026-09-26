package ProjectCode;

import java.util.Scanner;

public class MethodOverloading {
    public double volume(double rad){
        double vol=(4/3)*(22/7)*Math.pow(rad,3);
        return vol;
    }
    public double volume(double r,double h){
        double vol=(22/7)*Math.pow(r,2)*h;
        return vol;
    }
    public double volume(double l,double h,double b){
        double vol=l*b*h;
        return vol;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");
        double rad=sc.nextDouble();
        MethodOverloading sphere=new MethodOverloading();
        double volumeOfSphere=sphere.volume(rad);
        System.out.println("Volume of Sphere "+volumeOfSphere);
        System.out.println("Enter the radius of the cylinder");
        double rad1=sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double hei=sc.nextDouble();
        MethodOverloading cylinder=new MethodOverloading();
        double volumeOfcylinder=cylinder.volume(rad1,hei);
        System.out.println("Volume of the cylinder "+volumeOfcylinder);
        System.out.println("Enter the length,bradth and height of the cuboid");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        MethodOverloading cuboid=new MethodOverloading();
        double volumeOfCuboid= cuboid.volume(l,b,h);
        System.out.println("Volume of the cuboid "+volumeOfCuboid);
    }

}
