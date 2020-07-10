package blog.hyojin4588.cafe;

public class Cafe {
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		Customer buyer = new Customer();
		Barista barista = new Barista();
		
		MenuItem choiceMenu = buyer.order(menu);
		Coffee coffee = barista.makeCoffee(choiceMenu);
		buyer.drinkCoffee(coffee);
	}

}
