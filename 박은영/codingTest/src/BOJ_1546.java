import java.util.Scanner;
import java.util.Arrays;

public class BOJ_1546 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        // int[] arr = new int[num];
        double[] arr = new double[num];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        double result = 0;
        
        for (int i = 0; i < arr.length; i++) {
            result += ((arr[i]/arr[arr.length - 1])*100);
        }
        System.out.println(result/num);
    }
}