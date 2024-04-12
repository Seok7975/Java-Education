import java.util.Arrays;
import java.util.Random;

class Lotto_Step2 //1차원배열 + 셔플
{
    private int[] lotto; //로또배열
    private int[] number; //난수받을 temp배열
    private Random random;
    private final int MAX = 6;
    private final int RANGE = 45;

    Lotto_Step2() // 초기화하는 매소드
    {
        this.lotto = new int[MAX];
        this.random = new Random();
        this.number = new int[RANGE];

    }

    public void execute()
    {
        makeLotto();
        shuffle();
        printLotto();
    }

    public void makeLotto() //로또를 45번까지 죽 만드는 매소드
    {
        for (int i=0; i<number.length; i++)
        {
            number[i] = i+1;
        }

    }

    public void shuffle() //셔플 매소드
    {
        for(int  i =0; i<RANGE; i++)
        {
            for(int j=0; j<10; j++)
            {
                int k = random.nextInt(45); //난수받을 임시변수
                int temp = 0;
                temp = number[i];
                number[i] = number[k];
                number[k] = temp;
            }
        }
        System.arraycopy(number, 0, lotto, 0, MAX); // 로또배열에 다시 복사
        //System.arraycopy(src, srcPos, dest, destPos, length);
        //  src : 원본 배열
        //  srcPos : 복사할 배열
        //  dest : 복사할 배열
        //  destPos : 복사할 배열의 복사 시작위치
        //  length : 복사할 요소의 개수

    }

    public void printLotto()
    {
        System.out.println(Arrays.toString(lotto));
    }
}

class Lotto_Step2_Main
{
    public static void main(String[] args)
    {
        Lotto_Step2 lotto = new Lotto_Step2();
        for(int i=0; i<5; i++)
        {
            lotto.execute();
        }
    }
}