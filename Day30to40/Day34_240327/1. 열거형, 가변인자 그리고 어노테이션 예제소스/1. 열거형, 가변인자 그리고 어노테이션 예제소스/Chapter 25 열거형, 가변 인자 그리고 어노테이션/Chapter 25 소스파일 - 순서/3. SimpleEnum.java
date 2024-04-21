enum Scale {
   DO, RE, MI, FA, SO, RA, TI
}

class SimpleEnum {
    public static void main(String[] args) {
        Scale sc = Scale.DO;
        System.out.println(sc);

        switch(sc) {
        case DO:
            System.out.println("��~ ");
            break;
        case RE:
            System.out.println("��~ ");
            break;
        case MI:
            System.out.println("��~ ");
            break;
        case FA:
            System.out.println("��~ ");
            break;
        default:
            System.out.println("��~ ��~ ��~ ");
        }
    }
}

/*
	�ռ� ���� �������� �ذ��� ���ؼ� �ڹ� 5���� �������� �Ұ��Ǿ���.
	
	enum Scale {
	   DO, RE, MI, FA, SO, RA, TI
	}
	
	�̴� ������ Scale�� �����̴�. �׸��� �� �ȿ� ��ġ�� �̸�����
	������ '������ ��'�̶� �Ѵ�.(��Ȯ�� ��Ī�� 'Enumerated Values'
	�̴�.)
	�������� Ŭ������ ������ �����ϴ�. ���� ������ ���� ����������
	���� �����ϴ�. �� �̷��� ����� ���������� �ش� ������ ���� �����
	'������ ��'�� ������ �����ϴ�.
	
	Scale sc = Scale.DO;
	
	�⺻������ '������ ��'�� Scale.DO�� ���� ǥ��������, case��������
	ǥ���� �������� ���� Do�� ���� '������ ��'�� �̸��� ����ϱ�� ��ӵǾ�
	�ִ�.
*/