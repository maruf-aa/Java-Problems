//Make a function to print the table of a given number n.

import java.util.*;
public class Firstclass {

    public static void printTable(int a)
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    } 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);
    }
}
