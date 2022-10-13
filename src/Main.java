//14 Дмитро Савчук


public class Main {
    public static void main(String[] args) {

        double f, x = 3.981, y = -1.625; //task1 numbers
        f = task1(x, y);
        System.out.println("TASK1");
        System.out.println("F= " + f);
        System.out.println("_______________");

        double x2, p, b, a; // task2 numbers
        x2 = 11;
        p = 2.6;
        a = Math.log(Math.abs(x2));
        b = x2 * Math.pow(p, 3);

        y = task2(x2, b, a);
        System.out.println("TASK2");
        System.out.println("Y= " + y);
        System.out.println("_______________");

        double a3, p3, b3, y3, e, x3; //task3 numbers
        e = 14;
        a3 = -4;
        p3 = 3;
        b3 = Math.abs(a3) + Math.sqrt(a3 + Math.pow(p3, 2));
        x3 = Math.pow(e, b3);

        y3 = task3(a3, x3);
        System.out.println("TASK3");
        System.out.println("Y= " + y3);
        System.out.println("_______________");

    }


    private static double task1(double x, double y) {
        return Math.pow(2, -x) * x + Math.abs(Math.pow(Math.sqrt(y), 3));
    }


    private static double task2(double x2, double b, double a) {
        return Math.sqrt(a) * Math.sin(15) + Math.sqrt(b) * Math.cos(x2);
    }


    private static double task3(double a3, double x3) {
        return Math.pow(Math.cos(x3), 3) + Math.abs(a3);
    }

}