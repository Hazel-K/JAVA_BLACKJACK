package blog.hyojin4588.cafe;

import java.util.Scanner;

public class Customer {

//	public Customer() {
//		init();
//		showBill();
//	}

	public MenuItem order(Menu i) {
		System.out.println("메뉴를 번호로 선택해주세요.(0번 종료)");
		Scanner scan = new Scanner(System.in);
		int iTemp = 0;
		while (true) {
			iTemp = orderMenu(scan);
			if (iTemp == 0) {
				break;
			} else if (iTemp < 0 || iTemp > 4) {
				System.out.println("잘못 입력하셨습니다. 번호를 다시 입력하세요.");
				continue;
			}
		}
		scan.close();
		return i.choose(iTemp - 1);
	}
	
	private int orderMenu(Scanner i) {
		String temp = i.next();
		try {
			return Integer.parseInt(temp);
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다. 번호를 다시 입력해주세요.");
			return orderMenu(i);
		}
	}
	
//	private void showBill() {
//		int iTemp = 0;
//		for(int i = 0; i < bill.size(); i++) {
//			iTemp += bill.get(i).getPrice();
//		}
//		myOrder();
//		System.out.printf("합계금액 : %,d원", iTemp);
//	}
	
//	private void myOrder() {
//		System.out.print("------------::주문::------------\n\n");
//		for (int i = 0; i < bill.size(); i++) {
//			System.out.printf("%d. %s\n", i + 1, bill.get(i));
//		}
//		System.out.print("\n-------------------------------\n");
//	}
	
//	public List<MenuItem> order(Menu i) {
//		i.showMenus();
//		init();
//		showBill();
//		return bill;
//	}

}
