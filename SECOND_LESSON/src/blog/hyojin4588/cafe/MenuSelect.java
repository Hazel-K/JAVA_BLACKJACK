package blog.hyojin4588.cafe;

import java.util.Scanner;

public class MenuSelect extends Menu{
	
	public MenuSelect() {
		init();
	}
	
	private void init() {
		System.out.println("메뉴를 번호로 선택해주세요.(0번 종료)");
	}
	
	public int orderMenu() {
		Scanner scan = new Scanner(System.in);
		try {
			return Integer.parseInt(scan.next());			
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 번호를 다시 입력해주세요.");
			return orderMenu();
		}
	}
	
	public void menuChoose(int i) {
		Menu temp = new Menu();
		menuList.add(temp.choose(i));
	}
	
}
