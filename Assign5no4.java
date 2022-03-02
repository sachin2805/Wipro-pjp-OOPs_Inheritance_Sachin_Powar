package OOPS_Inheritance;
import java.util.Scanner;

public class Assign5no4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.next();
		
		if(s.length()%2==0)
		{
			System.out.println(s.substring(0,s.length()/2));
		}
		else
		{
			System.out.println("Null");
		}
	}
}
/* OUTPUT :
Enter the String : 
TomCat
Tom
---------- OR ----------
Enter the String : 
Apron
Null

*/
