public class Main {
    public static void main(String[] args) {

        double f, a = 10.0, b = 3.0, c = 4.0, temp=0, largest =0;
        f = findGreater(a, b, c, temp,largest);
        System.out.println(f);
    }

    private static double findGreater(double a, double b, double c,double temp, double largest) {
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        return largest;
    }
}
