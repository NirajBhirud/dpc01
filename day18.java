import java.util.Scanner;

public class DivisorCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        
        int count = 0;
        
        // Efficient approach: loop till sqrt(n)
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // If divisors are equal, count only once
                if (i * i == n) {
                    count++;
                } else {
                    count += 2; // count both i and n/i
                }
            }
        }
        
        // Output result
        System.out.println("Total number of divisors: " + count);
        
        sc.close();
    }
}
