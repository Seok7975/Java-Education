class Car	// �⺻ ���� �ڵ���
{
	private int gasolineGauge;
	Car(int gasolineGauge)
	{
		this.gasolineGauge = gasolineGauge;
	}
	public int getGasolineGauge(){
		return gasolineGauge;
	}	
}

class HybridCar extends Car	// ���̺긮�� �ڵ���
{
	private int electricGauge;
	HybridCar(int gasolineGauge, int electricGauge)
	{
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
	public int getElectricGauge(){
		return electricGauge;
	}	
}

class HybridWaterCar extends HybridCar		// ���̺긮�� ����ī
{
	private int waterGauge;
	HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge)
	{
		super(gasolineGauge, electricGauge);
		this.waterGauge = waterGauge;
	}

	public void showCurrentGauge()
	{
		System.out.println("�ܿ� ���ָ� : " + getGasolineGauge());
		System.out.println("�ܿ� ���ⷮ : " + getElectricGauge());
		System.out.println("�ܿ� ���ͷ� : " + waterGauge);
	}
}

class CarMain3
{
	public static void main(String[] args)
	{
		HybridWaterCar hwCar = new HybridWaterCar(100, 200, 300);
		hwCar.showCurrentGauge();
	}
}