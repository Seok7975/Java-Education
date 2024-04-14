//class Point implements Cloneable
//{
//	public int x;
//
//	public Point(int x) {
//		this.x = x;
//	}
//
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
//	
//	public void showInfo()
//	{
//		System.out.println("x = " + x);
//	}
//}
//public class CloneTest {
//	public static void main(String[] args) {
//		Point p1 = new Point(10);
//		try {
//			Point cpy = (Point)p1.clone();
//			cpy.x = 20;
//			p1.showInfo();
//			cpy.showInfo();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//	}
//}


///////////////////////////////////////////////////////////////////////////

//class Point implements Cloneable
//{
//	public int x;
//
//	public Point(int x) {
//		this.x = x;
//	}
//
//	@Override
//	public Point clone() throws CloneNotSupportedException {
//		return (Point)super.clone();
//	}
//	
//	public void showInfo()
//	{
//		System.out.println("x = " + x);
//	}
//}
//public class CloneTest {
//	public static void main(String[] args) {
//		Point p1 = new Point(10);
//		try {
//			Point cpy = p1.clone();
//			cpy.x = 20;
//			p1.showInfo();
//			cpy.showInfo();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//	}
//}

//////////////////////////////////////////////////////////////////////

class Point implements Cloneable
{
	public int x;

	public Point(int x) {
		this.x = x;
	}

	@Override
	public Point clone() throws CloneNotSupportedException {
		return (Point)super.clone();
	}
	
	public void showInfo()
	{
		System.out.println("x = " + x);
	}
}

class Circle implements Cloneable
{
	public Point center;
	public int radius;
	public Circle(int x, int radius) {
		this.center = new Point(x);
		this.radius = radius;
	}
	@Override
	public Circle clone() throws CloneNotSupportedException {
		Circle cpy = (Circle)super.clone();
		cpy.center = center.clone();
		return cpy;
	}
	public void showInfo()
	{
		center.showInfo();
		System.out.println("radius : " + radius);
	}
}

public class CloneTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(10, 20);
		try {
			Circle cpy = c1.clone();
			cpy.center.x = 100;
			cpy.radius = 200;
			c1.showInfo();
			cpy.showInfo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}