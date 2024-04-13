import java.util.Arrays;
import java.util.Scanner;

class BinarySearch
{
    public static void main(String[] args) {
        //////////////////////////////////랜덤 난수 중복없이 생성
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 20) + 1;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) i--;
            }
        }
        System.out.println("num");
        System.out.println(Arrays.toString(num));


        ////////////////////////////////////////이진정렬을 하려면 오름 차순 정렬을 해야함
        System.out.println("\n");
        System.out.println("num을 오름차순으로 정리해보자");

        for (int i=0; i<num.length-1; i++)
        {
            for(int j=i+1; j<num.length; j++)
            {
                if(num[i] > num[j])
                {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));

        /////////////////////////////////////////////////////이진 정렬 본격적으로

        int first = 0;
        int last = num.length-1;
        int mid = (first+last)/2;

        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int cnt = 0;

        System.out.println("찾고자 하는 숫자를 입력 : ");
        inputNum = sc.nextInt();

        while(first<=last)
        {

            cnt++;
            if(inputNum>num[mid]) first = mid + 1;
            else if(inputNum < num[mid]) last = mid - 1;
            else{
                System.out.println("정답 : " + (mid + 1) + "번째 있음");
                System.out.println("찾은 횟수 : " + cnt);
                break;
            }
            mid = (first+last)/2;
        }
        if(first>last)
        {
            System.out.println("검색결과가 없습니다.");
            System.out.println("찾은 횟수 : " + cnt);
        }
        sc.close();
    }
}