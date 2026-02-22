public class Sample {
    static long[] dp = new long[100]; // using long to avoid overflow

    public static void main(String[] args) {
        System.out.println(fibonacci(99));
    }

    public static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return dp[n];
    }
}
