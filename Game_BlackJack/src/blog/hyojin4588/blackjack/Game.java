package blog.hyojin4588.blackjack;

public class Game {

	public static void main(String[] args) {
		Deck setDeck = new Deck();
		System.out.println(setDeck);
		Card c = setDeck.getCard();
	}

}