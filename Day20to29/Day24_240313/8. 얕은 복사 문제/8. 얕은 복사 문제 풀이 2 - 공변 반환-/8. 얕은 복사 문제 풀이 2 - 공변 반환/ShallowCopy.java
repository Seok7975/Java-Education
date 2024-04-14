//깊은복사-공변반환-

class Point implements Cloneable
{
	private int xPos;
	private int yPos;
	
	public Point(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	public void showPosition()
	{
		System.out.printf("[%d, %d]", xPos, yPos);
	}
	public void changePos(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	public Point clone() throws CloneNotSupportedException
	{
		return (Point)super.clone();
	}
}

class Rectangle implements Cloneable
{
	Point upperLeft, lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2)
	{
		upperLeft=new Point(x1, y1);
		lowerRight=new Point(x2, y2);
	}
	public void showPosition()
	{
		System.out.println("직사각형 위치정보...");
		System.out.print("좌 상단: ");
		upperLeft.showPosition();
		System.out.println("");	
		System.out.print("우 하단: ");
		lowerRight.showPosition();	
		System.out.println("\n");
	}
	public void changePos(int x1, int y1, int x2, int y2)
	{
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	public Rectangle clone() throws CloneNotSupportedException
	{
		Rectangle cpy = (Rectangle)super.clone();
		cpy.upperLeft = this.upperLeft.clone();
		cpy.lowerRight = this.lowerRight.clone();
		return cpy;
	}
}

class ShallowCopy
{	
	public static void main(String[] args)
	{
		Rectangle org=new Rectangle(1, 1, 9, 9);
		Rectangle cpy;
		
		try
		{
			cpy=org.clone();
			org.changePos(2, 2, 7, 7);
			org.showPosition();		
			cpy.showPosition();		
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}