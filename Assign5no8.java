package OOPS_Inheritance;

import java.util.Scanner;

public class Assign5no8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.next();
	
			int x=s.indexOf('*');
		
		System.out.println(s.substring(0,x-1)+s.substring(x+2,s.length()));
	}
}
/* OUTPUT :

Enter the String : 
ab*cd
ad

*/