//Write a function to calculate the factorial of a number.

import java.util.*;
public class Firstclass {
    
    public static int factorial(int a)
    {
        int result = 1;
        for (int i = a; i >= 1; i--) 
        {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));
    }
}
