package OOPS_Inheritance;

import java.util.Scanner;

public class Assign5no10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.next();
		System.out.println("Enter the n-value : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		System.out.print(s.substring(n-1,s.length()));
	}
}
/* OUTPUT :
Enter the String : 
Wipro
Enter the n-value : 
3
propropro
*/