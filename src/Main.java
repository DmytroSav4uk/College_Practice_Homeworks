//public class Main {
//    public static void main(String[] args) {
//        int[][] twoD = new int[5] [2];
//        int i, j, k = 0;
//        System.out.println("2 task:");
//        for(i=0;i <5; i++)
//        for (j=0;j <2; j++){
//            twoD[i] [j] = k < 25? k+10: k;
//
//            k++;
//            if (twoD [i] [j] < 3){
//                System.out.println(twoD[i] [j] + " ");
//            }
//        }
//        System.out.println("3 task:");
//        for(i=0; i<5; i++) {
//            for (j=0; j<2; j++)
//            System.out.print( twoD[i] [j] +" ");
//            System.out. println();
//        }
//    }
//}


public class Main {
    public static void main(String[] args) {


        double p, u = 15, x =42;
        p = pValue(u, x);

        double do1= p/ 2*Math.sin(x) ;
        double do2=p/2*Math.cos(x) ;
        double z = do1 - do2;
        System.out.println("result is:"+z);

    }
    private static double pValue(double u, double x){
        return Math.pow(Math.log(u * x - 1), 2);
    }
}