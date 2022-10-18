
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < 55; i++) {
            counter++;
            sum+=i;
        }
        int res = sum/counter;
        System.out.println(res);
    }
}


//public class Main {
//    public static void main(String[] args) {
//
//        double res = 1;
//        for (int k = 5; k <= 30 ; k++) {
//            res =res* k/k+7;
//        }
//        System.out.println(Math.pow(res,2));
//    }
//}