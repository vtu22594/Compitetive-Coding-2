import java.util.*; 
public class MinTaps { 
public static void main(String[] args) { 
int n = 5; int[] ranges = {3,4,1,1,0,0}; 
int[] dp = new int[n + 1]; 
Arrays.fill(dp, n + 2); 
dp[0] = 0; 
for (int i = 0; i <= n; i++) { 
int l = Math.max(0, i - ranges[i]), r = Math.min(n, i + ranges[i]); 
for (int j = l; j <= r; j++) 
dp[r] = Math.min(dp[r], dp[l] + 1); 
} 
System.out.println("Min Taps: " + (dp[n] >= n + 2 ? -1 : dp[n])); 
} 
}
