package OOPS_Inheritance;

class Shape
{
	void draw()
	{
		System.out.println("Draw Method");
	}
	void erase()
	{
		System.out.println("Erase Method");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}

public class Assign4no2 {

	public static void main(String[] args) {
		Shape c=new Circle();
		c.draw();
		c.erase();
		Shape t=new Triangle();
		t.draw();
		t.erase();
		Shape s=new Square();
		s.draw();
		s.erase();
	}
}
/* OUTPUT :
Drawing Circle
Erasing Circle
Drawing Triangle
Erasing Triangle
Drawing Square
Erasing Square
*/