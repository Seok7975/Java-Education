import java.util.*;

public class MyVector2 extends MyVector implements Iterator {
	int cursor  = 0;
	int lastRet = -1;
	
	public MyVector2(int capacity) {
		super(capacity);		
	}
	
	public MyVector2() {
		this(10);		
	}

	public String toString() {
		String tmp = "";
		Iterator it = iterator();

		for(int i=0; it.hasNext();i++) {
			if(i!=0) tmp+=", ";
			tmp += it.next(); 	// tmp += next().toString();
		}

		return "["+ tmp +"]";		
	}

	public Iterator iterator() {
		cursor=0;		// cursor�� lastRet�� �ʱ�ȭ �Ѵ�.
		lastRet = -1;
		return this;		
	}	
	
	public boolean hasNext() {
	    return cursor != size();
	}
	
    public Object next(){
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
    }
	
	public void remove() {
         // ���̻� ������ ���� ������ IllegalStateException�� �߻���Ų��.
		if(lastRet==-1) {  
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--;           // ���� �Ŀ� cursor�� ��ġ�� ���ҽ�Ų��.
			lastRet = -1;		// lastRet�� ���� �ʱ�ȭ �Ѵ�.	
		}
	}		
} // class

/*
cursor�� ������ �о� �� ����� ��ġ�� �����ϴµ� ���ǰ�, lastRet�� ����������
�о� �� ����� ��ġ(index)�� �����ϴµ� ���ȴ�.
 �׷��� lastRet�� cursor���� �׻� 1�� ���� ���� ����ǰ� remove()�� ȣ���ϸ�
�̹� next()�� ���ؼ� ���� ��ġ�� ���, �� lastRet�� ����� ���� ��ġ�� �ִ� ��Ҹ�
�����ϰ� lastRet�� ���� -1�� �ʱ�ȭ �Ѵ�.
 ���� next()�� ȣ������ �ʰ� remove()�� ȣ���ϸ� lastRet�� ���� -1�� �Ǿ�
IllegalStateException�� �߻��Ѵ�. remove()�� next()�� �о� �� ��ü�� �����ϴ� ���̱�
������ remove()�� ȣ���ϱ� ������ �ݵ�� next()�� ȣ��� �����̾�� �Ѵ�.

	public void remove() {
         // ���̻� ������ ���� ������ IllegalStateException�� �߻���Ų��.
		if(lastRet==-1) {  
			throw new IllegalStateException();
		} else {
			remove(lastRet);		// �ֱٿ� �о�� ��Ҹ� �����Ѵ�.
			cursor--;          		// cursor�� ��ġ�� 1 ���ҽ�Ų��.
			lastRet = -1;			// �о�� ��Ұ� �����Ǿ����Ƿ� �ʱ�ȭ �Ѵ�.	
		}
	}

���� �ڵ忡�� ���� remove(lastRet)�� ȣ���Ͽ� lastRet�� ��ġ�� �ִ� ��ü�� ������
������ cursor�� ���� ���ҽ�Ų��. �׸��� lastRet�� ���� �ʱ�ȭ(-1)�Ѵ�.
 �� ������ remove�޼��带 ȣ���ؼ� ��ü�� �����ϰ� ����, ������ ��ġ ������ ��ü����
�� ������ ä��� ���� �ڵ������� �̵��Ǳ� ������ cursor�� ��ġ�� ���� �̵�
�����־�� �Ѵ�. �׸��� �о�� ��Ұ� �����Ǿ����Ƿ� �о�� ����� ��ġ�� �����ϴ�
lastRet�� ���� -1�� �ʱ�ȭ�ؾ� �Ѵ�. lastRet�� ���� -1�̶�� ���� �о�� ���� ���ٴ�
���� �ǹ��Ѵ�.
[����] lastRet�� ���� -1�̶�� ���� �о� �� ���� ���ٴ� �ǹ��̴�. remove()�� �о�� ����
�־�� ȣ��� �� ������ �������.
*/