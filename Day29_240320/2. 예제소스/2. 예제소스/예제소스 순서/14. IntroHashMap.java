//key -> �б� �л��� ��ȣ. ���� �ߺ� �Ұ�
//Hash -> ���� �˻�

import java.util.HashMap;

class IntroHashMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();

		//hMap.put(key, value)
		hMap.put(Integer.valueOf(3), "�����");		
		hMap.put(5, "������");	//5 ����ڽ�
		hMap.put(8, "���ȹ�");	//8 ����ڽ�
		
		System.out.println("6�г� 3�� 8�� �л�: "+hMap.get(Integer.valueOf(8)));	//�ڽ�
		System.out.println("6�г� 3�� 5�� �л�: "+hMap.get(5));	//������ //����ڽ�
		System.out.println("6�г� 3�� 3�� �л�: "+hMap.get(3));	//����� //����ڽ�
		
		hMap.remove(5);		/* 5�� �л� ���� �� */
		System.out.println("6�г� 3�� 5�� �л�: "+hMap.get(5));		//null
	}
}