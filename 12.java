/*Print the patterns
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
  */

import java.util.*;
public class Firstclass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++)
        {
            
            for(int j = 1; j <= (5 - i); j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }      

           
    }
}
