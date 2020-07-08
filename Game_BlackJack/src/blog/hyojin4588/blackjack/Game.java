package blog.hyojin4588.blackjack;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Deck setDeck = new Deck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		Scanner scan = new Scanner(System.in);

		while (true) {
			dealer.moreCards(setDeck);
			if (dealer.sumPoint() > 21) {
				dealer.openCard();
				System.out.println("딜러 버스트! 플레이어 승리!");
				break;
			} else if (dealer.sumPoint() == 21) {
				dealer.openCard();
				System.out.println("딜러 블랙잭! 딜러 승리!");
				break;
			}

			gamer.receiveCard(setDeck.getCard());
			gamer.receiveCard(setDeck.getCard());

			System.out.println("::::::::::::딜러의 카드:::::::::::::");
			dealer.showDealerCard();	

			System.out.println("\n:::::::::::::나의 카드:::::::::::::");
			gamer.openCard();

			while (true) {
				System.out.println("히트하시려면 ㄱ를 눌러주세요.");
				String temp = scan.next();
				if (!("ㄱ".equals(temp) || "r".equals(temp) || "R".equals(temp))) {
					break;
				}
				gamer.receiveCard(setDeck.getCard());
				if (gamer.sumPoint() > 21) {
					break;
				} else if (gamer.sumPoint() == 21) {
					break;
				}
				System.out.println("나의 카드 - ");
				gamer.openCard();
			}

			System.out.printf("\n\n%10s::결과 공개::%10s\n", " ", " ");
			System.out.println("::::::::::::딜러의 카드:::::::::::::");
			dealer.openCard();
			System.out.println("\n:::::::::::::나의 카드:::::::::::::");
			gamer.openCard();
			Rule.whoIsWin(gamer, dealer);
			break;
		}
		scan.close();
	}

}
