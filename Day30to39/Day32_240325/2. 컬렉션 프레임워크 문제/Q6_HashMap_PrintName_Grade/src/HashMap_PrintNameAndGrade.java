//6. HashMap에 각각 key와 value를
//"김자바", 90
//"김자바", 100
//"이자바", 100
//"강자바", 80
//"안자바", 90
//을 입력하고
//각각의 이름과 점수를 출력하자.
//
//그리고 총점, 평균, 최고점, 최저점을 출력하자.

import java.util.*;

class HashMap_PrintNameAndGrade
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> gradeCard = new HashMap<>();

        gradeCard.put("김자바", 90);
        gradeCard.put("김자바", Integer.valueOf(100));
        gradeCard.put("이자바", 100);
        gradeCard.put("강자바", Integer.valueOf(80));
        gradeCard.put("안자바", 90);

        Set<Map.Entry<String, Integer>> set = gradeCard.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();

        while(it.hasNext())
        {
            Map.Entry<String, Integer> e = it.next();
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        Set<String> kset = gradeCard.keySet();
        System.out.println("참가자 명단 : " + kset);

        Collection<Integer> values = gradeCard.values();
        Iterator<Integer> vit = values.iterator();

        int total = 0;

        while(vit.hasNext())
        {
            Integer i = vit.next();
            total += i.intValue();
        }


        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));

    }
}

/*
HaspMap의 기본적인 메서드를 이용해서 데이터를 저장하고 읽어오는 예제이다.
entrySet()을
이용해서 키와 값을 함께 읽어 올 수도 있고 keySet()이나 values()를 이용해서
키와 값을 따로 읽어 올 수 있다.
*/