//Print all even numbers till n.

import java.util.*;
public class Firstclass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            if (i % 2 == 0) 
            {
                System.out.print(i + " ");
            }
            
        }      
        System.out.println();
           
    }
}
