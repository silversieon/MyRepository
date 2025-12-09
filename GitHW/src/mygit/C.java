package mygit;

public class C {
	

	private String address;
	private Integer orderCount;
	private Integer productPrice;


	public C(String address, Integer count, Integer price) {
		this.address = address;
		this.orderCount = count;
		this.productPrice = price;
	}
	public static void main(String[] args) {
		C order2 = new C("서울시 성북구 정릉동", 30, 20000);
	}

}
