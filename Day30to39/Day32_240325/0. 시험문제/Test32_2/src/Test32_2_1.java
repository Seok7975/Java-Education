//2_1. "Box", "Toy", "Box", "Toy"로 초기화 된 리스트를 만들고, 중복된 요소를 제거하시오.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class ConvertCollection
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Box", "Toy", "Box", "Toy");
        ArrayList<String> list2 = new ArrayList<>(list);
        ArrayList<String> list3 = (ArrayList<String>)list2.clone();

        for(String s2 : list2)
        {
            System.out.print(s2.toString() + '\t');
        }
        System.out.println();

        for(String s3 : list3)
        {
            System.out.print(s3.toString() + '\t');
        }
        System.out.println();

        HashSet<String> set = new HashSet<>(list2);
        list2 = new ArrayList<>(set);

        for(String s2 : list2)
        {
            System.out.print(s2.toString() + '\t');
        }
        System.out.println();
    }
}