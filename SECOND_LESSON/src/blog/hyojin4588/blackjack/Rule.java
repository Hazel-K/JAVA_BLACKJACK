package blog.hyojin4588.blackjack;

public class Rule {

	public static void whoIsWin(Gamer i, Dealer j) {
		int gamer = i.sumPoint();
		int dealer = j.sumPoint();
		if (gamer == dealer) {
			System.out.println("비겼습니다.");
		} else if (gamer > dealer) {
			if (gamer > 21) {
				System.out.println("게이머 버스트! 졌습니다.");
			} else {
				if (gamer == 21) {
					System.out.print("게이머 블랙잭! ");
				}
				System.out.println("이겼습니다.");
			}
		} else {
			System.out.println("졌습니다.");
		}
	}

}
