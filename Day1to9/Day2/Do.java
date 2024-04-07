class Do
{
	public static void main(String[] args)
	{
		int i =0, sum=0, cnt=0;

		/*for(i=0; i<3; i++)
				
			System.out.println("Hi");  // 괄호를 안하면 그다음 하나만 반복
			System.out.println("Bye");
		*/
		
	
		/*while(i<3)
		{
			System.out.println(i);
			i++;
		}
		*/



		do          //do, while문은 조건에 맞든 안맞든 무조건 한 번 실행
		{
			++i;
			sum+=i;
		}
		while(i<100);
		System.out.println(sum);	
		System.out.println("");
		System.out.println("");		

		i = 0;
		sum=0;
		do
		{
			i=i+2;
			sum+=i;
		}while(i<100);
		System.out.println(sum);
		System.out.println("");
		System.out.println("");

		i = 0;
		sum=0;
		cnt=0;
		do
		{
			i+=4;
			sum+=i;
			cnt++;
		}while(i<100);
		System.out.println(cnt);
		System.out.println("");
		System.out.println("");


		i = 0;
		sum=0;
		cnt=0;
		do
		{
			i+=7;
			sum+=i;
			cnt++;
		}while(sum<=1000);
		System.out.println(sum+"   "+cnt);
		System.out.println("");
		System.out.println("");


		i = 0;
		sum=1;
		cnt=0;
		do
		{
			i++;
			sum*=i;
			cnt++;
		}while(i<5);
		System.out.println(sum);
		System.out.println("");
		System.out.println("");


		i= 0;
		sum=0;
		cnt=0;
		do
		{
			i++;
			if(i%7 ==0)
			{							
				sum+=i;
				cnt++;
			}
		}while(sum<1000);
		System.out.println(sum+ "   " + cnt);
		System.out.println("");
		System.out.println("");

	}

                                                                                                                              

}