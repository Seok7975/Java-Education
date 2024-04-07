/*
문제.txt
﻿문제 폴더에 있는 소스를 가지고 다음과 같은 출력 결과를 나오게 하자.
class Point x좌표와 y좌표를 나타낸다.
class Circle 중심좌표(x좌표와 y좌표)와 반지름의 값을 갖는다.
class Ring 안쪽원(Circle)과 바깥쪽원(Circle)로 이루어져 있다.

출력 결과

Inner Circle Info...
radius : 4
[1, 1]
Outer Circle Info...
radius : 9
[2, 2]
*/



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
		System.out.println("radius : " + this.radius);
		center.showPointInfo();
	}
}

class Ring
{
	private Circle ic;
	private Circle oc;
	Ring(int iXPos, int iYPos, int iRadius, int oXPos, int oYPos, int oRadius)
	{
		ic = new Circle(iXPos, iYPos,  iRadius);
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


class PointMain
{
	public static void main(String[] args)
	{
		Ring ring = new Ring(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}
}