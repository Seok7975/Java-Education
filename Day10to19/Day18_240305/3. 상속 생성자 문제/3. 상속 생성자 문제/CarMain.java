
class Car	// �⺻ ���� �ڵ���
{
	int gasolineGauge;
}

class HybridCar extends Car	// ���̺긮�� �ڵ���
{
	int electricGauge;
}

class HybridWaterCar extends HybridCar		// ���̺긮�� ����ī
{
	int waterGauge;

	public void showCurrentGauge()
	{
		System.out.println("�ܿ� ���ָ� : " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ : " + electricGauge);
		System.out.println("�ܿ� ���ͷ� : " + waterGauge);
	}
}