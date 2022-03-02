package OOPS_Inheritance;
import java.util.Scanner;

public class Assign5no6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String : ");
		String s1=sc.next();
		System.out.println("Enter the 2nd String : ");
		String s2=sc.next();
		
		if(s1.length()>s2.length())
			System.out.println(s2+s1+s2);
		else
			System.out.println(s1+s2+s1);

	}

}
/* OUTPUT :
Enter the 1st String : 
Hi
Enter the 2nd String : 
Hello
HiHelloHi
*/