import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] nums = new int[n];
        
        // for(int i = 0; i < n; i++) {
        //     int rand = (int)(Math.random()*100)+1;
        //     nums[i] = rand;
        // }
        
        // // for(int i = 0; i < nums.length; i++) {
        //     //     System.out.println(nums[i]);
        //     // }
            
        //     // int temp;
        //     //1트 >> 틀림
        // // for(int j = 0; j < nums.length-1; j++) {
        // //     if(nums[j] > nums[j+1]) {
        // //         temp = nums[j+1];
        // //         nums[j+1] = nums[j];
        // //         nums[j] = temp;
        // //     }
        // // }

        // //2트 >> 틀림
        // for(int j = 0; j < nums.length-1; j++) {
        //     for(int k = 0; k < nums[j]; k++) {
        //         if(nums[j] > nums[k]){
        //             int temp = nums[k];
        //             nums[k] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

        // for(int k = 0; k < nums.length; k++) {
        //     System.out.println(nums[k]);
        // }


        //최종 코드
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] nums = new int[n];
        
        // for(int i = 0; i < n; i++) {
        //     nums[i] = sc.nextInt();
        // }
        
        // for(int j = 0; j < n-1; j++) {
        //     for(int k = j+1; k < n; k++) {
        //         if(nums[j] > nums[k]){
        //             int temp = nums[k];
        //             nums[k] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

        // for(int k = 0; k < nums.length; k++) {
        //     System.out.println(nums[k]);
        // }

        //============================================================================
        //11720번문제
        
        //1트 >> 런타임 에러 (InputMismatch) >> 문제이해를 잘못했다!! 두번째줄에 입력되는 숫자들은 띄어쓰기없이 제공된다. >> 숫자배열이 아니라 문자열을 사용해야한다.
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int[] nums = new int[num];

        // for(int i = 0; i < num; i++) {
        //     nums[i] = sc.nextInt();
        // }
        // int sum = 0;
        
        // for(int j = 0; j < nums.length; j++) {
        //     sum+=nums[j];
        // }

        // System.out.print(sum);

        //2트
        // String nums = sc.next();
        
        // for(int i = 0; i < num; i++) {
        //     sum += nums.charAt(i)-'0';  //아스키코드'0'=48
        // }
        // System.out.println(sum);



        //============================================================================
        //2023-04-19
        //1546번 문제
        
    }
}