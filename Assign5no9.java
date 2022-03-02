package OOPS_Inheritance;

import java.util.Scanner;

public class Assign5no9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String : ");
		String s1=sc.next();
		System.out.println("Enter the 2nd String : ");
		String s2=sc.next();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			sb.append(s1.charAt(i)).append(s2.charAt(i));
		} 

		System.out.println(sb);
	}
}
/* OUTPUT :
Enter the 1st String : 
Hello
Enter the 2nd String : 
World
HWeolrllod
*/