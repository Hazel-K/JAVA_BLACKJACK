package blog.hyojin4588.cafe;

import java.util.ArrayList;
import java.util.List;

public class Customer extends MenuSelect {
	
	List<MenuItem> bill = new ArrayList<MenuItem>();

//	public Customer() {
//		init();
//		showBill();
//	}

	private void init() {
		System.out.println("메뉴를 번호로 선택해주세요.(0번 종료)");
		int iTemp = 0;
		while (true) {
			iTemp = orderMenu();
			if (iTemp == 0) {
				break;
			} else if (iTemp < 0 || iTemp > 4) {
				System.out.println("잘못 입력하셨습니다. 번호를 다시 입력하세요.");
				continue;
			} else {
				bill.add(menuList.get(iTemp - 1));
				System.out.println(menuList.get(iTemp - 1));
			}
		}
	}
	
	private void showBill() {
		int iTemp = 0;
		for(int i = 0; i < bill.size(); i++) {
			iTemp += bill.get(i).getPrice();
		}
		myOrder();
		System.out.printf("합계금액 : %,d원", iTemp);
	}
	
	private void myOrder() {
		System.out.print("------------::주문::------------\n\n");
		for (int i = 0; i < bill.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, bill.get(i));
		}
		System.out.print("\n-------------------------------\n");
	}
	
	public void order(Menu i) {
		i.showMenus();
		init();
		showBill();
	}

}
