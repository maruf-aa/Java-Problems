//Make a function to check if a number is prime or not.

import java.util.*;
public class Firstclass {

    public static boolean Checkprime(int a)
    {
        if (a <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) 
        {
            if (a % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (Checkprime(a)) 
        {
            System.out.println(a + " is a prime number.");
        } 
        else 
        {
            System.out.println(a + " is not a prime number.");
        }
    }
}
