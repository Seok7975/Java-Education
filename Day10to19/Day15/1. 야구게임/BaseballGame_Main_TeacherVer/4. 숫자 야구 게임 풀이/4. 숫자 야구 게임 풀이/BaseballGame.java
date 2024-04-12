public class BaseballGame {
	
	private Baseball computer;

	public BaseballGame(int numberOfDigits) {
		this.computer = new Baseball(numberOfDigits);
	}
	
	private boolean attack(int num)
	{
		return computer.setINum(num);
	}
	
	public boolean playBaseballGame(int num)
	{
		boolean result = false;
		if(attack(num))
		{
			computer.playGame();
			result = computer.showResult();			
		}
		else
			System.out.println("���ڴ� " + computer.START_NUM + "�̻� " + computer.END_NUM + " ������ ��ġ�� �ʴ� ���ڿ��� �մϴ�.");
		return result;
	}
}