//Make a function to check if a given number n is even or not.

import java.util.*;
public class Firstclass {

    public static void Checkeven(int a)
    {
        if (a % 2 == 0) 
        {
            System.out.println(a + " is an even number.");
        }
        else
        {
            System.out.println(a + " is an odd number.");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Checkeven(a);
    }
}
