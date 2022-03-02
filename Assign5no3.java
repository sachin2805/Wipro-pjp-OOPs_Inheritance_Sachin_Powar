package OOPS_Inheritance;

import java.util.Scanner;

public class Assign5no3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.substring(0,2));
		}

	}

}
/* OUTPUT :
Enter the String : 
Wipro
WiWiWiWiWi
 */