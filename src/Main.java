//Скласти програму обчислення функцій, використовуючи оператори керування.


public class Main {
    public static void main(String[] args) {

        double x,y,z;

        y = 15;
        x = 11;
        z = 34;



        if (x >= z){
           double f = Math.cos(y+3);
           System.out.println("x >=z| f ="+f);
        }

        else {
            double f = x+ Math.atan(Math.pow(Math.sqrt(z),3));
            System.out.println("x < z| f ="+f);
        }


    }
}


 class Task2 {
    public static void main(String[] args) {

     double arr[] = {-1,-2,-3,1,2,3,4,5,6};

     int sum = 0;
     int product = 1;

        for (double arrElement : arr) {

            if (arrElement<0){
                sum += Math.abs(arrElement);
            }

            if (arrElement>0){
                product*=arrElement;
            }
        }
        int res = product - sum;
        System.out.println("result of second task is: "+ res);
    }
}
