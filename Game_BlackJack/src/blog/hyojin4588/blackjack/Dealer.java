package blog.hyojin4588.blackjack;

public class Dealer extends Gamer {

	@Override
	public void moreCards(Deck i) {
		int stopPoint = 17;
		while (true) {
			if (sumPoint() >= stopPoint) {
				break;
			}
			receiveCard(i.getCard());
		}
	}
	
	public void showDealerCard() {
		String temp1 = "";
		for (int i = 0; i < playerArr.size(); i++) {
			if (i == 0) {
				temp1 += "[비공개 카드]\n";
				continue;
			}
			temp1 += playerArr.get(i) + "\n";
		}
		System.out.printf("%3s", temp1);
	}

}
