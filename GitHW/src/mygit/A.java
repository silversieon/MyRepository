package mygit;

public class A {
	
	private Integer age;
	private String name;

	public A(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		A person = new A(3, "sieon");
		System.out.println("age: "+ person.age + "name: "+ person.name);
	}

}
