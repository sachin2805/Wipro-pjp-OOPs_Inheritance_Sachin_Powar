package OOPS_Inheritance;

class Box {
	  double width;
	  double height;
	  double depth;
	 
	  // This is the constructor for Box.
	  Box(double w, double h, double d) {
	    width = w;
	    height = h;
	    depth = d;
	  }
	 
	  double volume() {
	    return width * height * depth;
	  }
	}
public class Assign1no1 {

	public static void main(String[] args) {
		Box b=new Box(10,20,30);
		
		System.out.println("Volume of box where height is = "+b.volume());
	}

}
/* OUTPUT :
Volume of box where height is = 6000.0
*/
