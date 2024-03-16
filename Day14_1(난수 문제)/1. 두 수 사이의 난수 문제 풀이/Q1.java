import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int start = 0, end = 0;
		start = sc.nextInt();
		end = sc.nextInt();
		
		for(int i=0;i<10;i++)
			System.out.println(rand.nextInt(end-start+1)+start);
		for(int i=0;i<10;i++)
			System.out.println((int)(Math.random()*(end-start+1))+start);

	}
}