package blog.hyojin4588.cafe;

public class MenuItem {
	
	private String menu;
	private int price;
	
	public MenuItem(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
	public String getMenu() {
		return this.menu;
	}
	
	public int getPrice() {
		return this.price;
	}

}
