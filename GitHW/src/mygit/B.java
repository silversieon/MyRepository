package mygit;

public class B {
	
	private String title;
	private String description;
	private Integer price;

	public B(String title, String description, Integer price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}

	public static void main(String[] args) {
		B book = new B("소프트웨어공학 10판", "재미있는 소프트웨어공학을 한 권의 책으로..", 35000);
	}

}
