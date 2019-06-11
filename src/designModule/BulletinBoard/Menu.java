package designModule.BulletinBoard;

import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> menuList = new ArrayList<MenuItem>(); 

	public void addMenu(MenuItem menuItem) {
		menuList.add(menuItem);
	}
	
	public void removeMenu(MenuItem menuItem) {
		menuList.remove(menuItem);
	}
}
