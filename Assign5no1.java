package OOPS_Inheritance;

import java.util.Scanner;

public class Assign5no1 {

	public static void main(String[] args) {
	    String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Palindrome Test of String\nEnter the string :");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }

	}

}
/* OUTPUT :
Palindrome Test of String
Enter the string :SOS
The string is palindrome.
 ------------- OR ------------

Palindrome Test of String
Enter the string :Ind
The string is not palindrome.

 */
    
   
