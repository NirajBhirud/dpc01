import java.util.*;

public class ZeroSumSubarrays {

    // Function to find all zero-sum subarrays
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    result.add(new int[]{i, j});
                }
            }
        }
        return result;
    }

    // Function to print result
    public static void printResult(List<int[]> result) {
        System.out.print("[");
        for (int k = 0; k < result.size(); k++) {
            int[] p = result.get(k);
            System.out.print("(" + p[0] + ", " + p[1] + ")");
            if (k < result.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Main function with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find subarrays
        List<int[]> result = findZeroSumSubarrays(arr);

        // Print result
        printResult(result);

        sc.close();
    }
}
