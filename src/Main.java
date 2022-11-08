import java.util.Arrays;
public class Main {
    public static void main(String[] args)  {
        int[] intArr = {1, 10, 800, -4, 1,2,8,6,7,9,4,2,3,8,5};
        String[] strArr = {"M", "Y","T","R","O"};
        Arrays.sort(intArr);
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));
    }
}