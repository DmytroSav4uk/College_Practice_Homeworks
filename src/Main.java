//13 Дмитро Савчук

import java.util.Scanner;


//class SetValues {
//
//    double x, y, z;
//    public void Scan(){
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter X value");
//        x = scn.nextDouble();
//        System.out.println("Enter Y value");
//        y = scn.nextDouble();
//        System.out.println("Enter Z value");
//        z = scn.nextDouble();
//    }
//}
//
//public class Main{
//    public static void main (String[] args) {
//        double f ;
//        SetValues value = new SetValues();
//        value.Scan();
//        if (value.x >= value.z){
//            f = Math.sqrt(1 + Math.pow(value.x-2,2));
//            System.out.println("x >= z");
//            System.out.println("f = "+ f);
//        }
//
//         if (value.x < value.z){
//            f= Math.pow(Math.tan(value.z),2) + 1 ;
//            System.out.println("x < z");
//            System.out.println("f = "+ f);
//        }
//    }
//}


class SetValues {

    int a, b, c, d;

    public void Scan() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of A");
        a = scn.nextInt();
        System.out.println("Enter value of B");
        b = scn.nextInt();
        System.out.println("Enter value of C");
        c = scn.nextInt();
        System.out.println("Enter value of D");
        d = scn.nextInt();
    }
}


public class Main {

    public static void main(String[] args) {
        int y, z;

        SetValues value = new SetValues();
        value.Scan();
        y = value.a * value.b - value.c * value.d;
        switch (y) {
            case (3) -> {
                z = 2 * value.a;
                System.out.println("y = " + y + "|z =" + z);
            }
            case (5) -> {
                z = 7 - value.b;
                System.out.println("y = " + y + "|z =" + z);
            }
            case (7) -> {
                z = 8 + value.c;
                System.out.println("y = " + y + "|z =" + z);
            }
            case (19) -> {
                z = 10 + value.d * value.a;
                System.out.println("y = " + y + "|z =" + z);
            }
            default -> System.out.println("Y is not equal 3,5,7 or 19");
        }
    }
}