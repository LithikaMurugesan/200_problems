import java.util.*;

public class Tcs200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = arr[i];

            // For minimum
            if (val < min) {
                secondMin = min;
                min = val;
            } else if (val > min && val < secondMin) {
                secondMin = val;
            }

            // For maximum
            if (val > max) {
                secondMax = max;
                max = val;
            } else if (val < max && val > secondMax) {
                secondMax = val;
            }
        }

        if (secondMin == Integer.MAX_VALUE || secondMax == Integer.MIN_VALUE) {
            System.out.println("Second min or second max does not exist");
        } else {
            System.out.println("Second Min: " + secondMin);
            System.out.println("Second Max: " + secondMax);
        }
    }
}
