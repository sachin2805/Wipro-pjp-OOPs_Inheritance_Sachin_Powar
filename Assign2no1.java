package OOPS_Inheritance;

class Author{
	String name;
	String email;
	char gender;
	
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
}
class Book{
	private String name;
	private Author au;
	private double price;
	private int qtyInStock;
	
	Book(String name,Author au, double price, int qtyInStock)
	{
		this.name=name;
		this.au=au;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAu() {
		return au;
	}
	public void setAu(Author au) {
		this.au = au;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	void show()
	{
		  System.out.println("Book Details:");
		  System.out.println("Book Name: "+name);
		  System.out.println("Price :"+price+"\nqtyInStock :"+qtyInStock);
			
		  System.out.println("Author Details :\nName : "+au.name+"\nEmail : "+au.email+"\nGender : "+au.gender);

		   }

	
}
public class Assign2no1 {

	public static void main(String[] args) {
		 Author a = new Author("Sachin", "dev@gmail.com", 'm');
		    Book b = new Book("Shyar", a, 299.99, 200);

		    b.show();
	}
}
/* OUTPUT :
Book Details:
Book Name: Shyar
Price :299.99
qtyInStock :200
Author Details :
Name : Sachin
Email : dev@gmail.com
Gender : m
*/
