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

	@Override
	public boolean equals(Object obj) {
		Point other = (Point)obj;
		return this.xPos == other.xPos && this.yPos == other.yPos;
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
		System.out.println("직사각형 위치정보...");
		System.out.print("좌 상단 : ");
		upperLeft.showPosition();
		System.out.println("");
		System.out.print("우 하단 : ");
		lowerRight.showPosition();
		System.out.println("\n");
	}
	@Override
	public boolean equals(Object obj) {
		Rectangle other = (Rectangle)obj;
		return this.upperLeft.equals(other.upperLeft) && this.lowerRight.equals(other.lowerRight);
	}
	
}

public class RectangleMain
{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1, 1, 2, 2);
		Rectangle r2 = new Rectangle(1, 1, 2, 2);
		Rectangle r3 = new Rectangle(1, 1, 3, 3);
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
	}
}