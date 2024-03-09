//비트연산자

/*1. 16 7		20 5		9 4		11 6
&
|
^
~
*/

//System.out.println("16&7 = " + (16&7) + " 16|7 = " + (16|7) + " 16^7 = " + (16^7) + " ~16 = " + (~16) + " ~7 = " +  (~7));


/*class Yunsan
{
	public static void main(String[] args)
	{
		System.out.println(16&7);	//0
		System.out.println(16|7);	//23
		System.out.println(16^7);	//23
		System.out.println(~16);	//-17
		System.out.println(~7);		//-8
		System.out.print("\n" + "\n");

		System.out.println(20&5);	//4
		System.out.println(20|5);	//21
		System.out.println(20^5);	//17
		System.out.println(~20);	//-21
		System.out.println(~5);		//-6
		System.out.print("\n" + "\n");

		System.out.println(9&4);	//0
		System.out.println(9|4);	//13
		System.out.println(9^4);	//13
		System.out.println(~9);		//-10
		System.out.println(~4);		//-5
		System.out.print("\n" + "\n");

		System.out.println(11&6);	//2
		System.out.println(11|6);	//15
		System.out.println(11^6);	//13
		System.out.println(~11);	//-21
		System.out.println(~6);		//-7
		System.out.print("\n" + "\n");

	}
}*/


//int형 정수 15678 오른쪽 끝에서 3번째비트 5번째비트를 구하여 출력
class Yunsan
{
    public static void main(String[] args)
    {
        System.out.println("15678의 오른쪽 끝에서 3번째 비트는 " + (15678 >> 2 & 1));	// 2칸을 땡겨 AND 1을 하여 0인지 1인지 확인, 1
        System.out.println("15678의 오른쪽 끝에서 5번째 비트는 " + (15678 >> 4 & 1));	// 1
    }

}
