
class Car	// 기본 연료 자동차
{
	int gasolineGauge;
}

class HybridCar extends Car	// 하이브리드 자동차
{
	int electricGauge;
}

class HybridWaterCar extends HybridCar		// 하이브리드 워터카
{
	int waterGauge;

	public void showCurrentGauge()
	{
		System.out.println("잔여 가솔린 : " + gasolineGauge);
		System.out.println("잔여 전기량 : " + electricGauge);
		System.out.println("잔여 워터량 : " + waterGauge);
	}
}