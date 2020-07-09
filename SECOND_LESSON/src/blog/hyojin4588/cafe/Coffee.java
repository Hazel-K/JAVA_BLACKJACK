package blog.hyojin4588.cafe;

public class Coffee {
	
	private String name;
	private int price;
	
	public Coffee(MenuItem i) {
		name = i.getName();
		price = i.getPrice();
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}

}
