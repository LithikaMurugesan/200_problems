import java.util.*;
public class Tcs200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i =0;i<n;i++){

        }
        System.out.println("small: "+arr[0]);
        System.out.println("large: "+arr[n-1]);
    }
}