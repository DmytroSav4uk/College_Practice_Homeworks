public class Main {
    public static void main(String[] args) {

//        int  x, y;
//        double f;
//
//        y = 12;
//        x = 12;
//
//        if (x >= y){
//            f=1+Math.pow(x,2)+Math.sqrt(Math.abs(y/3));
//            System.out.println("1'st F =" + f);
//        }
//
//        if (x<y){
//            f =x*Math.tan(y);
//            System.out.println("2'nd F =" + f);
//        }


int[] arr = {1,2,3,4,5,6,7,8,9};

        int max=0;
        int min =1;
        int imax = 0;
        int imin = 1;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                imax=i;
            }
            if(arr[i]<min){
                min=arr[i];
                imin = i;
            }
        }
        arr[imin] =max; arr[imax] = min;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
        System.out.println(max);
        System.out.println(min);


    }
}

