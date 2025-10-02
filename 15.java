/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.*/

import java.util.*;
public class Firstclass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        do 
        {
            int markes = sc.nextInt();
            if (markes >= 90) 
            {
                System.out.println("This is Good");
            } 
            else if (markes <= 89 && markes >= 60) 
            {
                System.out.println("This is also Good");
            } 
            else if (markes <= 59 && markes >= 0) 
            {
                System.out.println("This is Good as well");
            } 
            a = sc.nextInt();
        } 
        while (a == 1);

        sc.close();
    }
}

