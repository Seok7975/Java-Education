class Point
{
	int xPos, yPos;

	public Point(int x, int y)
	{
		xPos = x;
		yPos = y;
	}

	public void showPosition()
	{
		System.out.printf("[%d, %d]", xPos, yPos);
	}
}

class Rectangle
{
	Point upperLeft, lowerRight;

	public Rectangle(int x1, int y1, int x2, int y2)
	{
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	public void showPosition()
	{
		System.out.println("���簢�� ��ġ����...");
		System.out.print("�� ��� : ");
		upperLeft.showPosition();
		System.out.println("");
		System.out.print("�� �ϴ� : ");
		lowerRight.showPosition();
		System.out.println("\n");
	}
}