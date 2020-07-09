package blog.hyojin4588.cafe;

public class Cafe {
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		// menu.showMenus();
		System.out.println();
		System.out.println();
		
		// MenuSelect sel = new MenuSelect();
		Customer son1 = new Customer();
		son1.order(menu);
	}

}
