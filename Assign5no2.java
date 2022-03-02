package OOPS_Inheritance;

import java.util.Scanner;

public class Assign5no2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String : ");
		String s1=sc.next();
		s1.toLowerCase();
		System.out.println("Enter the 2nd String : ");
		String s2=sc.next();
		s2.toLowerCase();
		
		System.out.println(s1+" "+s2);

	}
}
/* OUTPUT :
Enter the 1st String : 
Sachin
Enter the 2nd String : 
Powar
Sachin Powar
*/