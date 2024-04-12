class Car	// 기본 연료 자동차
{
	int gasolineGauge;
	Car(int gasolineGauge)
	{
		this.gasolineGauge = gasolineGauge;
	}
}

class HybridCar extends Car	// 하이브리드 자동차
{
	int electricGauge;
	HybridCar(int gasolineGauge, int electricGauge)
	{
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
	
}

class HybridWaterCar extends HybridCar		// 하이브리드 워터카
{
	int waterGauge;
	HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge)
	{
		super(gasolineGauge, electricGauge);
		this.waterGauge = waterGauge;
	}

	public void showCurrentGauge()
	{
		System.out.println("잔여 가솔린 : " + gasolineGauge);
		System.out.println("잔여 전기량 : " + electricGauge);
		System.out.println("잔여 워터량 : " + waterGauge);
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