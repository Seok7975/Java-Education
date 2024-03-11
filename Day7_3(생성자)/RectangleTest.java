/*
먼저 다음 코드를 보고 문제가 될만한 소지가 있는 부분을 찾아보기 바란다.

class Rectangle
{
	int ulx, uly;		// 좌 상단 x, y 좌표
	int lrx, lry;		// 우 하단 x, y 좌표

	public void showArea()
	{
		int xLen = lrx-ulx;
		int yLen = lry-uly;
		System.out.println("넓이 : " + (xLen*yLen));
	}
}

class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle();
		rec.ulx=22;
		rec.uly=22;
		rec.lrx=10;
		rec.lry=10;
		rec.showArea();
	}
}

* x좌표는 0이상 100이하의 범위를 갖는다. 오른쪽으로 이동할수록 값은 증가한다.
* y좌표는 0이상 100이하의 범위를 갖는다. 아래로 이동할수록 값은 증가한다.
* 우 하단의 x, y좌표 값이 좌 상단의 x, y 좌표값보다 작아서는 안된다.

*/

class Rectangle
{
	private int ulx, uly;		// 좌 상단 x, y 좌표
	private int lrx, lry;		// 우 하단 x, y 좌표

	private boolean isProperRange(int pos)
	{
		if(0<=pos && pos <= 100)
			return true;
		else
			return false;
	}
	public void setRectanglePoint(int lx, int ly, int rx, int ry)
	{
		if(lx>=rx || ly>=ry)
		{
			System.out.println("좌표 지정이 잘못되었습니다.");
			return;
		}
		if( !isProperRange(lx) || !isProperRange(ly) )
		{
			System.out.println("좌 상단 좌표의 범위가 잘못되었습니다.");
			return;
		}
		if( !isProperRange(rx) || !isProperRange(ry) )
		{
			System.out.println("우 하단 좌표의 범위가 잘못되었습니다.");
			return;
		}

		ulx = lx;
		uly = ly;
		lrx = rx;
		lry = ry;
	}

	public void showArea()
	{
		int xLen = lrx - ulx;
		int yLen = lry - uly;
		System.out.println("넓이 : " + (xLen*yLen) );
	}
}

class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle();
		rec.setRectanglePoint(1, 1, 9, 8);
		rec.showArea();

		rec.setRectanglePoint(2, 2, 8, 8);
		rec.showArea();
	}
}