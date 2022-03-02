package OOPS_Inheritance;

import java.util.Scanner;
class fruit
{    

  protected char name, taste, size  ;
 Scanner sc = new Scanner(System.in);
public void eat ()
 {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the name of fruit");
		name=sc.next().charAt(name);
		System.out.println("Enter the taste of the fruit");
		taste=sc.next().charAt(name);
		System.out.println("Name of fruit : "+name);
		System.out.println("Taste of fruit : "+taste);
    }

}

class apple extends fruit

{

  public void eat() // overriding method
  {

	  System.out.println("Name of the fruit is Apple");
      System.out.println("Taste of the fruit is sweet");
  	}  
}

class orange extends fruit
{
	public void eat ( ) // overriding method
	{
		System.out.println("Name of the fruit is Orange");
		System.out.println("aste of the fruit is sour");
	}

}
public class Assign4no1 {

	public static void main(String[] args) {
		//fruit f=new fruit();
		//f.eat();
		apple A = new apple ( ) ;
		A.eat();
		orange O = new orange ( ) ;
	    O.eat();
	}
}
/* OUTPUT :
Name of the fruit is Apple
Taste of the fruit is sweet
Name of the fruit is Orange
aste of the fruit is sour
*/
