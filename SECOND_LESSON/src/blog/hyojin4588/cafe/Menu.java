package blog.hyojin4588.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	protected List<MenuItem> menuList = new ArrayList<MenuItem>();

	public Menu() {
		init();
	}

	private void init() {
		menuAdd("아메리카노", 1500);
		menuAdd("카푸치노", 2000);
		menuAdd("자바칩프라페", 4500);
		menuAdd("녹차라떼", 3800);
	}
	
	public void menuAdd(String i, int j) {
		MenuItem temp = new MenuItem(i, j);
		menuList.add(temp);
	}

	@Override
	public String toString() {
		String temp = "";
		temp += "------------::메뉴::------------\n";
		for (int i = 0; i < menuList.size(); i++) {
			temp += String.format("%s\n", menuList.get(i));
		}
		temp += "-------------------------------\n";
		return temp;
	}

	public void showMenus() {
		System.out.print("------------::메뉴::------------\n\n");
		for (int i = 0; i < menuList.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, menuList.get(i));
		}
		System.out.print("\n-------------------------------\n");
	}
	
	public MenuItem choose(int i) {
		return menuList.get(i);
	}

}
