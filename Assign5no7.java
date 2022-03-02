package OOPS_Inheritance;
import java.util.Scanner;

public class Assign5no7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.next();
		char a=s.charAt(0);
		char b=s.charAt(s.length()-1);
		
		if(a=='x' && b=='x')
		{
			System.out.println(s.substring(1,s.length()-1));
		}
		else
		{
			System.out.println(s);
		}

	}
}
/* OUTPUT :
Enter the String : 
xHix
Hi
*/