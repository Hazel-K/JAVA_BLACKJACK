package blog.hyojin4588.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	// 멤버 필드
	private List<Card> arr = new ArrayList<Card>();
	// 멤버 필드

	// 생성자
	public Deck() {
		init();
		// shuffle();
	}
	// 생성자
		
	// 게터
	// 게터

	// 객체 메소드
	void init() {
		for (int i = 0; i < Card.PATTERNS.length; i++) {
			for (int j = 1; j <= 13; j++) {
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(j);
				Card cTemp = new Card(pattern, deno, j > 10 ? 10 : j);
				arr.add(cTemp);
				// arr.add(new Card(Card.PATTERNS[i], getDeno(j)));
			}
		}
	}
	/*
	private void shuffle() {
		Collections.shuffle(arr);
	}
	*/
	private String getDeno(int i) {
		switch(i) {
		case 1: return "A";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default: return String.valueOf(i);
		}
	}
		
	@Override
	public String toString() {
		String temp = "";
		for (Card card : arr) {
			temp += (card + "\n");
		}
		return temp;
	}
	/*
	public Card getCard() {
		return arr.remove(arr.size() - 1);
	}
	*/
	public Card getCard() {
		return arr.remove((int)(Math.random() * arr.size()));
		/*
		Card temp;
		int iTemp = (int)(Math.random() * arr.size());
		temp = arr.get(iTemp);
		arr.remove(iTemp);
		return temp;
		*/
	}
	// 객체 메소드

}
