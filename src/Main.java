//13 Дмитро Савчук

import java.util.Scanner;
import java.lang.Math;

class SetValues {

    double x, y, z;
    public void Scan(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter X value");
        x = scn.nextDouble();
        System.out.println("Enter Y value");
        y = scn.nextDouble();
        System.out.println("Enter Z value");
        z = scn.nextDouble();
    }
}

public class Main{
    public static void main (String[] args) {
        double f ;
        SetValues value = new SetValues();
        value.Scan();
        if (value.x >= value.z){
            f = Math.sqrt(1 + Math.pow(value.x-2,2));
            System.out.println("x >= z");
            System.out.println("f = "+ f);
        }

         if (value.x < value.z){
            f= Math.pow(Math.tan(value.z),2) + 1 ;
            System.out.println("x < z");
            System.out.println("f = "+ f);
        }
    }
}