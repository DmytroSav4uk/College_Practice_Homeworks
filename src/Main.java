//13 Дмитро Савчук

public class Main {
    public static void main(String[] args) {
        double a, b, step, xk, x;
        int counter = 0;
        a = 0.9;
        b = 0.66;
        step = 0.55;
        x = 13;
        xk = 8.9;
        for (double xn = 2.3; xn <= xk; xn = xn + step) {
            counter++;
            double ydo1 = Math.pow(Math.log(a + Math.sqrt(x)), 2);
            double ydo2 = 1 +Math.cos(b*x);
            double y = ydo1 / ydo2;
            System.out.println("x=" + xn + "|y =" + y);
        }
        System.out.println("_______________________");
        System.out.println("number of function values is" + counter);
    }
}



//public class Main {
//    public static void main(String[] args) {
//        double a, b,y=0,step,step1,k;
//        int counter = 0;
//        k=10;
//        a = 0.1;
//        b = 1;
//        step1 = (b-a);
//        step = step1/k;
//        for (double x = 0.1; x <= b; x = x + step) {
//            counter++;
//            y = 0.5 * Math.log(x);
//            System.out.println("x=" + x + "|y =" + y);
//
//
//
//    }
//        System.out.println("_______________________");
//        System.out.println("number of function values is: " + counter);
//        double lastDigit = y % 10;
//        int digits = (int)Math.log10(y);
//        int firstDigit = (int)(y / Math.pow(10, digits));
//        System.out.println("product of first and last number:"+lastDigit * firstDigit) ;
//}}
