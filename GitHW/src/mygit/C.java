package mygit;

public class C {
	
	private Integer price;
	private String address;
	private Integer count;

	public C(String address, Integer price, Integer count) {
		this.price = price;
		this.address = address;
		this.count = count;
	}

	public static void main(String[] args) {
		C order = new C("서울시 성북구", 15000, 3);
		System.out.println("order1: " + order.address + ", " + order.price + ", " + order.count);
	}

}
