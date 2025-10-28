public class WaterBottles { 
public static void main(String[] args) { 
int full = 9, exchange = 3, total = 0; 
while (full >= exchange) { 
total += exchange; 
full = full - exchange + 1; 
} 
total += full; 
System.out.println("Total bottles drunk: " + total); // Output: 13 
} 
}
