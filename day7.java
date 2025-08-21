import java.util.Scanner;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take size input
        System.out.print("Enter number of bars: ");
        int n = sc.nextInt();

        // take height input
        int[] height = new int[n];
        System.out.println("Enter the heights of the bars:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        // calculate and display result
        int result = trap(height);
        System.out.println("Trapped Water: " + result);

        sc.close();
    }
}
