/*Print the patterns
  *****
  *   *
  *   *
  *****
  */

import java.util.*;
public class Firstclass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if (i == 0 || i == 3)
                {
                    System.out.print("*");
                } 
                else if ((i > 0 && i < 3) && (j == 0 || j == 4)) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }      
    }
}


