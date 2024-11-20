package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c =new Calculator();
		
		System.out.println(c.add(1, 2));
		System.out.println(c.add(2, 3,4));
		System.out.println(c.add(2.5, 4.5));
	}
}
