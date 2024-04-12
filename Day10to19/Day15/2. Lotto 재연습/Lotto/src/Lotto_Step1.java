import java.util.Arrays;
import java.util.Random;

class Lotto_Step1 //로또를 만들자-> 1차원배열 5행, 6개씩(중복금지)
{
    private int[] lotto;//로또를 담을 배열
    private Random random;//랜덤 매소드 참조할 변수
    private final int MAX = 6;

    Lotto_Step1()  //(default) Lotto_Step1()
    {
        this.lotto = new int [MAX];
        this.random = new Random();
    }

    public void executeLotto() //한번에 만들고 출력하는 메소드
    {
        makeLotto();
        printLotto();
    }

    public void makeLotto()//로또 1줄을 만들자
    {
        for(int i=0; i<lotto.length; i++)
        {
            lotto[i] = random.nextInt(45)+1;
            //근데 여기서 중복되는 숫자가 없어야대자나
            if(!checkNum(i)) //먼가 필요하겠네 조건이?
                //중복이 되면 false, 안되면 true로 만들어볼까?
            {
                i--;
            }
        }
    }

    public boolean checkNum(int index) //중복 체크 메소드
    {
        for(int i=0; i<index; i++)
        {
            if(lotto[index]==lotto[i])
            {
                return false; // 겹치는게 있음 실패!
            }
        }
        return true; // 겹치는게 없음 트루!
    }

    public void printLotto() // 로또를 출력하는 메소드
    {
        System.out.println(Arrays.toString(lotto));
        /*
        for(int i : lotto)
           System.out.print(i + " ");

        */
        /*
        for(int i=0;i<lotto.length;i++)
            System.out.print(lotto[i] + " ");
        System.out.println();
        */

    }
}

class Lotto_Step1_Main
{
    public static void main(String[] args)
    {
        Lotto_Step1 lotto = new Lotto_Step1();
        for(int i=0; i<5; i++)
        {
            lotto.executeLotto();
        }
    }
}