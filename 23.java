 //Write a function to multiply 2 numbers.

import java.util.*;
public class Firstclass {
    
    public static int multiply(int a,int b)
    {
        return a * b;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(multiply(a, b));
    }
}
