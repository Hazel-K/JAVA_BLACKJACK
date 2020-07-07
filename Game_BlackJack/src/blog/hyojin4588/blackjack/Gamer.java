package blog.hyojin4588.blackjack;

import java.util.LinkedList;
import java.util.List;

public class Gamer {

	protected List<Card> playerArr = new LinkedList<Card>();

	public void receiveCard(Card i) {
		playerArr.add(i);
	}

	public void openCard() {
		String temp1 = "";
		for (Card card : playerArr) {
			temp1 += card + "\n";
		}
		System.out.printf("%3s계: %2d\n", temp1, sumPoint());
	}

	protected int sumPoint() {
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
