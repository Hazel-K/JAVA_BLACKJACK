package blog.hyojin4588.blackjack;

public class Game {

	public static void main(String[] args) {
		Deck setDeck = new Deck();
		
		Gamer gamer = new Gamer();
		
		gamer.receiveCard(setDeck.getCard());
		gamer.receiveCard(setDeck.getCard());
		gamer.openCard();
	}

}
