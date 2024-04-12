import java.util.Random;
import java.util.Arrays;

class Lotto_step3
{
    private int[][] lotto;
    private Random random;
    private final int MAX = 6;
    private int numOfLotto ;
    //private boolean checkNum = true;

    Lotto_step3(int numOfLotto)
    {
        this.numOfLotto = numOfLotto;
        lotto = new int[numOfLotto][MAX];
        random = new Random();
    }

    public void executeLotto()
    {
        makeLottos();
        printLottos();
    }
    public void makeLotto(int [] lotto)  //로또 한줄 생성 매소드
    {
        for(int i=0; i<MAX; i++)
        {
            lotto[i] = random.nextInt(45)+1;
            if(! checkNum(i, lotto))
            {
                i--;
            }
        }
    }

    public void makeLottos()
    {
        for(int i=0; i<numOfLotto; i++)
        {
            makeLotto(lotto[i]);
        }
    }

    public boolean checkNum(int index, int[] lotto)
    {
        for(int i=0; i<index; i++)
        {
            if(lotto[index] == lotto[i])
            {
                return false;
            }
        }
        return true;
    }

    public void printLotto(int[] lotto)    //로또 한 줄 출력
    {
        System.out.println(Arrays.toString(lotto));
    }

    public void printLottos()
    {
        for (int i = 0; i < numOfLotto; i++)
        {
            printLotto(lotto[i]);
            //System.out.println(Arrays.toString(lotto[i]));
        }
    }
}


class Lotto_Step3_Main
{
    public static void main(String[] args)
    {
        Lotto_step3 lotto = new Lotto_step3(5);
        lotto.executeLotto();
    }
}

/*
import java.util.Random;
import java.util.Arrays;

class Lotto_step3
{
    private int[][] lotto;
    private Random random;
    private final int MAX = 6;
    private final int numOfLotto =5;
    //private boolean checkNum = true;

    Lotto_step3()
    {
        //this.numOfLotto = numOfLotto;
        lotto = new int[numOfLotto][MAX];
        random = new Random();
    }

    public void executeLotto()
    {
        makeLottos();
        printLottos();
    }
    public void makeLotto(int [] lotto)  //로또 한줄 생성 매소드
    {
        for(int i=0; i<MAX; i++)
        {
            lotto[i] = random.nextInt(45)+1;
            if(! checkNum(i, lotto))
            {
                i--;
            }
        }
    }

    public void makeLottos()
    {
        for(int i=0; i<numOfLotto; i++)
        {
            makeLotto(lotto[i]);
        }
    }

    public boolean checkNum(int index, int[] lotto)
    {
        for(int i=0; i<index; i++)
        {
            if(lotto[index] == lotto[i])
            {
                return false;
            }
        }
        return true;
    }

    public void printLotto(int[] lotto)    //로또 한 줄 출력
    {
        System.out.println(Arrays.toString(lotto));
    }

    public void printLottos()
    {
        for (int i = 0; i < numOfLotto; i++)
        {
            System.out.println(Arrays.toString(lotto[i]));
        }
    }
}


class Lotto_Step3_Main
{
    public static void main(String[] args)
    {
        Lotto_step3 lotto = new Lotto_step3();
        lotto.executeLotto();
    }
}*/