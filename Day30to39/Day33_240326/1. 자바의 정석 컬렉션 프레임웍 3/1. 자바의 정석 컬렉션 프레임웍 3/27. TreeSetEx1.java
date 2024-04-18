import java.util.*;

class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();

		String from = "b";
		String to	= "d";

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");

		System.out.println(set);
		System.out.println("range search : from " + from  +" to "+ to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
	}
}
/*
[Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
range search : from b to d
result1 : [bat, car]
result2 : [bat, car, dZZZZ, dance, disc]
*/

/*
subSet()을 이용해서 범위검색(range search)할 때 시작범위는 포함되지만 끝 범위는
포함되지 않으므로 result1에는 c로 시작하는 단어까지만 검색결과에 포함되어 있다.
 만일 끝 범위인 d로 시작하는 단어까지 포함시키고자 한다면, 아래와 같이 끝 범위에
'zzz'와 같은 문자열을 붙이면 된다.

	System.out.println("result2 : " + set.subSet(from, to + "zzz"));

d로 시작하는 단어 중에서 'dzzz' 다음에 오는 단어는 없을 것이 때문에 d로 시작하는
모든 단어들이 포함될 것이다.
 결과를 보면 'abc'보다 'Car'가 앞에 있고 'dZZZZ'가 'dance'보다 앞에 정렬되어
있는 것을 알 수 있다. 대문자가 소문자보다 우선하기 때문에 대소문자가 섞여 있는
경우 의도한 것과는 다른 범위검색결과를 얻을 수 있다.
 그래서 가능하면 대문자 또는 소문자로 통일해서 저장하는 것이 좋다.

[참고] 반드시 대소문자가 섞여 있어야 하거나 다른 방식으로 정렬해야 하는 경우
Comparator를 이용하면 된다.

문자열의 경우 정렬순서는 문자의 코드값이 기준이 되므로, 오름차순 정렬의 경우
코드값의 크기가 작은 순서에서 큰 순서, 즉 공백, 숫자, 대문자, 소문자 순으로
정렬되고 내림차순의 경우 그 반대가 된다.
*/