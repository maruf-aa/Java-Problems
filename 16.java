 //Print if a number is prime or not (Input n from the user).

import java.util.*;
public class Firstclass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1)
        {
            System.out.println("Nither prime number not composite");
            return;
        }
        for (int i = 2; i <= a / 2; i++) 
        {
            if (a % i == 0) 
            {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
        sc.close();
    }
}
