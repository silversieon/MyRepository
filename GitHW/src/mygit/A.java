package mygit;

public class A {
	
	private String name;
	private Integer age;
	private Boolean isMale;

	public A(String name, Integer age, Boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public static void main(String[] args) {
		A person2 = new A("금시언", 24, true);
	}

}
