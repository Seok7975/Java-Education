class Car	// �⺻ ���� �ڵ���
{
	int gasolineGauge;
	Car(int gasolineGauge)
	{
		this.gasolineGauge = gasolineGauge;
	}
}

class HybridCar extends Car	// ���̺긮�� �ڵ���
{
	int electricGauge;
	HybridCar(int gasolineGauge, int electricGauge)
	{
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
	
}

class HybridWaterCar extends HybridCar		// ���̺긮�� ����ī
{
	int waterGauge;
	HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge)
	{
		super(gasolineGauge, electricGauge);
		this.waterGauge = waterGauge;
	}

	public void showCurrentGauge()
	{
		System.out.println("�ܿ� ���ָ� : " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ : " + electricGauge);
		System.out.println("�ܿ� ���ͷ� : " + waterGauge);
	}
}

class CarMain
{
	public static void main(String[] args)
	{
		HybridWaterCar hwCar = new HybridWaterCar(100, 200, 300);
		hwCar.showCurrentGauge();
	}
}