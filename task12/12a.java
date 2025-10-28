public class StockProfit { 
public static void main(String[] args) { 
int[] prices = {1,3,2,8,4,9}; 
int fee = 2, hold = -prices[0], cash = 0; 
for (int i = 1; i < prices.length; i++) { 
cash = Math.max(cash, hold + prices[i] - fee); 
hold = Math.max(hold, cash - prices[i]); 
} 
System.out.println("Max Profit: " + cash); // Output: 8 
} 
}
