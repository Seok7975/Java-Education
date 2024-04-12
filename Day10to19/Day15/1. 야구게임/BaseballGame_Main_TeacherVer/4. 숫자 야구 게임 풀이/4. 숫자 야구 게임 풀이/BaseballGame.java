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
			System.out.println("숫자는 " + computer.START_NUM + "이상 " + computer.END_NUM + " 이하의 겹치지 않는 숫자여야 합니다.");
		return result;
	}
}