package OOPS_Inheritance;

class Calculator
{
	
	static void powerInt(int n1,int n2)
	{
		System.out.println("Power of int "+Math.pow(n1, n2));
	}
	static void powerDouble(double n1,double n2)
	{
		System.out.println("Power of double "+Math.pow(n1, n2));
	}
}
public class Assign1no2 {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.powerInt(3, 4);
		c.powerDouble(3,4);
	}

}
/* OUTPUT :
Power of int 81.0
Power of double 81.0
*/