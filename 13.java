/*Print the patterns
    1
   212
  32123
 4321234
543212345 
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

            for (int j = i; j >= 1; j--) 
            {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) 
            {
                System.out.print(j);
            }
            System.out.println();
        }      

           
    }
}
