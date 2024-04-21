/*
이전 프로젝트에서 수정된 사항
PhoneBook.java

추가된 메소드

loadData
saveData

수정된 메소드

PhoneBook()
quitProgram()
 */

import java.util.Scanner;

public class PhoneMain{
	
	public static void main(String[] args) {
		
		int menu=0;		
		PhoneBookUI pbUI = new PhoneBookUI();
		Scanner sc = PhoneBookUI.sc;
		
		while(true)
		{
			pbUI.printMenu();			
			try
			{
				menu = sc.nextInt();
				sc.nextLine();
				
				if(menu<Menu.INSERT_PHONE_INFO || menu > Menu.QUIT_PHONE_INFO)
				{
					throw new MenuChoiceException(menu);
				}
				switch(menu)
				{
				case Menu.INSERT_PHONE_INFO:
					pbUI.inputMenu();
					menu = sc.nextInt();
					sc.nextLine();
					if(menu<1 || menu > 3)
					{
						throw new MenuChoiceException(menu);
					}
					pbUI.inputPhoneInfo(menu);
					break;
				case Menu.SEARCH_PHONE_INFO:
					pbUI.searchPhoneInfoByName();
					break;
				case Menu.DELETE_PHONE_INFO:
					pbUI.deletePhoneInfoByPhoneNumber();
					break;
				case Menu.SHOW_ALL_PHONE_INFO:
					pbUI.printAllPhoneInfo();
					break;
				case Menu.QUIT_PHONE_INFO:
					pbUI.quitProgram();
					return;				
				}				
			}
			catch(MenuChoiceException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}