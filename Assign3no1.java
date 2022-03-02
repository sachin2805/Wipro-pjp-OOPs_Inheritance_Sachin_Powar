package OOPS_Inheritance;

class Animal {
	
	public void eat () {
		System.out.println("eat method in Animal");
	}
	
	public void sleep () {
		System.out.println("sleep method in Animal");
	}
}

class Bird extends Animal {

	@Override
	public void eat () {
		System.out.println("eat method in Bird");
	}
	
	@Override
	public void sleep () {
		System.out.println("sleep method in Bird");
	}
	
	public void fly () {
		System.out.println("fly method in Bird");
	}
}

public class Assign3no1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}

}
/* OUTPUT :

eat method in Animal
sleep method in Animal
eat method in Bird
sleep method in Bird
fly method in Bird
*/
