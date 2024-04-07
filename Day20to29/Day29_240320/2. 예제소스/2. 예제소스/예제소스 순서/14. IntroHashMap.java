//key -> 학급 학생의 번호. 따라서 중복 불가
//Hash -> 빠른 검색

import java.util.HashMap;

class IntroHashMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();

		//hMap.put(key, value)
		hMap.put(Integer.valueOf(3), "나삼번");		
		hMap.put(5, "윤오번");	//5 오토박싱
		hMap.put(8, "박팔번");	//8 오토박싱
		
		System.out.println("6학년 3반 8번 학생: "+hMap.get(Integer.valueOf(8)));	//박싱
		System.out.println("6학년 3반 5번 학생: "+hMap.get(5));	//윤오번 //오토박싱
		System.out.println("6학년 3반 3번 학생: "+hMap.get(3));	//나삼번 //오토박싱
		
		hMap.remove(5);		/* 5번 학생 전학 감 */
		System.out.println("6학년 3반 5번 학생: "+hMap.get(5));		//null
	}
}