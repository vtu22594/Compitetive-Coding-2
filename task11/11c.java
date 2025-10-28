import java.util.*; 
public class MinTravelCost { 
public static void main(String[] args) { 
int[] days = {1,4,6,7,8,20}, cost = {2,7,15}; 
int last = days[days.length - 1]; 
int[] dp = new int[last + 1]; 
Set<Integer> travel = new HashSet<>(); 
for (int d : days) travel.add(d); 
for (int i = 1; i <= last; i++) { 
if (!travel.contains(i)) dp[i] = dp[i - 1]; 
else dp[i] = Math.min(dp[Math.max(0, i - 1)] + cost[0], 
Math.min(dp[Math.max(0, i - 7)] + cost[1], 
dp[Math.max(0, i - 30)] + cost[2])); 
} 
System.out.println("Min Travel Cost: " + dp[last]); // Output: 11 
} 
} 

