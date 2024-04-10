import java.util.Scanner;

class WhyNeedArray
{
	public static void main(String[] args)
	{
		int fstHighScore=0;		// 1등 점수
		int sndHighScore=0;		// 2등 점수

		Scanner sc=new Scanner(System.in);

		System.out.print("점수 입력: ");		
		int score1=sc.nextInt();

		if(score1>=fstHighScore)
		{
			sndHighScore=fstHighScore;
			fstHighScore=score1;
		}
		else if(score1<fstHighScore && score1>sndHighScore)
		{
			sndHighScore=score1;
		}

		System.out.print("점수 입력: ");		
		int score2=sc.nextInt();

		if(score2>=fstHighScore)
		{
			sndHighScore=fstHighScore;
			fstHighScore=score2;
		}
		else if(score2<fstHighScore && score2>sndHighScore)
		{
			sndHighScore=score2;
		}

		System.out.print("점수 입력: ");		
		int score3=sc.nextInt();

		if(score3>=fstHighScore)
		{
			sndHighScore=fstHighScore;
			fstHighScore=score3;
		}
		else if(score3<fstHighScore && score3>sndHighScore)
		{
			sndHighScore=score3;
		}
		
		System.out.printf("A 학점은 %d점 이상입니다. \n", sndHighScore);
	}
}