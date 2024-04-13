/*
import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (true) {
			System.out.println("1.메뉴2.메뉴3.메뉴4.메뉴");
			menu = sc.nextInt();
			try {
				if(menu < 1 || menu > 4) throw new MenuException(menu);
				switch (menu) {
				case 1:
					break;
				default:
					break;
				}
			} catch (MenuException e) {
				System.out.println(e.getMessage());
			}			
		}
	}
}
*/

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (true) {
			System.out.println("1.메뉴2.메뉴3.메뉴4.메뉴");
			menu = sc.nextInt();
			try {
				switch (menu) {
				case 1: case 2: case 3: case 4:
					break;
				default:
					throw new MenuException(menu);
				}
			} catch (MenuException e) {
				System.out.println(e.getMessage());
			}			
		}
	}
}