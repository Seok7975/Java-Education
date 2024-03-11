
class Point
{
	private int xPos, yPos;

	public Point(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	public void showPointInfo()
	{
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}
class Circle
{
	private Point center;
	private int radius;
	Circle(int xPos, int yPos, int radius)
	{
		center = new Point(xPos, yPos);
		this.radius = radius;
	}
	public void showCircleInfo()
	{
		System.out.println("radius : " + radius);
		center.showPointInfo();
	}
}

class Ring
{
	private Circle ic;
	private Circle oc;
	Ring(int iXPos, int iYPos, int iRadius, int oXPos, int oYPos, int oRadius)
	{
		ic = new Circle(iXPos, iYPos, iRadius);
		oc = new Circle(oXPos, oYPos, oRadius);
	}
	public void showRingInfo()
	{
		System.out.println("Inner Circle Info...");
		ic.showCircleInfo();
		System.out.println("Outer Circle Info...");
		oc.showCircleInfo();
	}
}
class ppoint
{
	public static void main(String[] args)
	{
		Ring ring = new Ring(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}
}










