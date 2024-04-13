
public class MenuException extends Exception {
	private int wrongMenu;

	public MenuException(int wrongMenu) {
		super(wrongMenu + "은 없는 메뉴입니다.");
		this.wrongMenu = wrongMenu;
	}
}