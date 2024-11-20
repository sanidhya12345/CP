package abstraction;

abstract class Animal {
	
	//abstract method having no implementation details.
	
	public abstract void sound();
	
	//method which we have implementation details.
	
	public void eat() {
		System.out.println("this animal eats food!!!");
	}
}

class Dog extends Animal{
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("the dog barks");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("the cat meows");
	}
}
