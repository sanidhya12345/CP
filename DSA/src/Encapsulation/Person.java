package Encapsulation;

public class Person {
	
	private String name;
	private int age;
	
	//getter method to get the person name
	public String getName() {
		return name;
	}
	//getter method to get the person age
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
