
public class MenuException extends Exception {
	private int wrongMenu;

	public MenuException(int wrongMenu) {
		super(wrongMenu + "�� ���� �޴��Դϴ�.");
		this.wrongMenu = wrongMenu;
	}
}