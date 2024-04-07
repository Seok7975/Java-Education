interface UpperCasePrintable
{
	// 비어 있음
}
/*
UpperCasePrintable 인터페이스가 갖는 의미는 무엇인가?
"다른 클래스와의 구별을 위한 특별한 표시의 목적으로 사용되었다."

이렇듯 인터페이스는 클래스의 정의에, 약속된 형태의 특별한 표시를 위한 용도로도 사용이 된다. 그리고
이러한 경우에는 위 예제에서 보이듯이 아무것도 채워지지 않은 형태로 인터페이스가 정의되기도 한다.
*/
/*
아무 메서드도 담고 있지 않고, 단지 자신을 구현하는 클래스가 특정 속성을 가짐을 표시해주는 인터페이스를 마커 인터페이스(marker interface)라 한다.
*/
class ClassPrinter 
{
	public static void print(Object obj)
	{
		String org=obj.toString();
		if(obj instanceof UpperCasePrintable)
		{
			org=org.toUpperCase();
		}
		
		System.out.println(org);
	}
}

class PointOne implements UpperCasePrintable
{
	private int xPos, yPos;
	
	PointOne(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	
	public String toString()
	{
		String posInfo="[x pos:"+xPos + ", y pos:"+yPos+"]";
		return posInfo;
	}
}

class PointTwo
{
	private int xPos, yPos;
	
	PointTwo(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	
	public String toString()
	{
		String posInfo="[x pos:"+xPos + ", y pos:"+yPos+"]";
		return posInfo;
	}
}

class InterfaceMark
{
	public static void main(String[] args)
	{
		PointOne pos1=new PointOne(1, 1);
		PointTwo pos2=new PointTwo(2, 2);
		PointOne pos3=new PointOne(3, 3);
		PointTwo pos4=new PointTwo(4, 4);
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		ClassPrinter.print(pos3);
		ClassPrinter.print(pos4);
	}
}