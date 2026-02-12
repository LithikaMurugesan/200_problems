
import java.util.*;
public class Tcs200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i =0;i<arr.length;i++){
             arr[i] =  sc.nextInt();
         }
         int sum =0;
         double avg ;
         for(int i=0;i<arr.length;i++){
             sum +=arr[i];
         }
         avg = (double)  sum/n;
        System.out.println(avg);
    }
}