/* Print Pascal’s Triangle.
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 
  */

import java.util.*;
public class Firstclass {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= (n - i); j++) 
            {
                System.out.print(" ");
            }

            int num = 1;
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num + " ");
                num = num * (i - j) / j; // num = num * (i - j)/(j + 1) for 0 based indexing
            }

            System.out.println();
        }
    }
}
