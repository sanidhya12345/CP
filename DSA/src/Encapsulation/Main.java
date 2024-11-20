package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		
		person.setName("sanidhya");
		person.setAge(22);
		
		System.out.println("Name of the person: "+person.getName());
		System.out.println("Age of the person: "+person.getAge());
	}
}
