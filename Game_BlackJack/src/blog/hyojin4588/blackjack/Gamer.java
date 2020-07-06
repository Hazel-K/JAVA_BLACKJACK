package blog.hyojin4588.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {

	private List<Card> playerArr = new ArrayList<Card>();

	public void receiveCard(Card i) {
		playerArr.add(i);
	}

	public void openCard() {
		String temp1 = "";
		for (Card card : playerArr) {
			temp1 += card + "\n";
		}
		System.out.printf("%3sTotal : %2d", temp1, sumPoint());
	}

	private int sumPoint() {
		int iSum = 0;
		for (Card card : playerArr) {
			iSum += card.getPoint();
		}
		return iSum;
	}

	@Override
	public String toString() {
		return playerArr.toString();
	}

}
