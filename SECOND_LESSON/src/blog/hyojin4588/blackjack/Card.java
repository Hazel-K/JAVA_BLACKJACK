package blog.hyojin4588.blackjack;

public class Card {

	// 멤버 필드
	public static final String[] PATTERNS = { "♠", "♣", "◆", "♥" };
	private final String pattern;
	private final String denomination;
	private final int point;
	// 멤버 필드

	// 생성자
	public Card(String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	// 생성자

	// 게터
	public String getPattern() {
		return pattern;
	}

	public String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {
		return point;
	}
	// 게터

	// 객체 메소드
	@Override
	public String toString() {
		return String.format("%s %s", pattern, denomination);
	}
	// 객체 메소드

}
