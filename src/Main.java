public class Main {
    public static void main(String[] args) {
        int[][] twoD = new int[2] [5];
        int i, j, k = 0;
        System.out.println("2 task: ");
        for(i=0; i<2; i++)
            for (j=0; j<5; j++){
                twoD[i] [j] = k < 25? k*10: k;

                k++;

                if (twoD [i] [j] < 3){
                    System.out.println(twoD[i] [j] + " ");
                }
            }
        System.out.println("3 task: " );
        for(i=0; i<2; i++) {
            for (j=0; j<5; j++)
                System.out.print( twoD[i] [j] +" ");
            System.out. println();
        }
    }
}