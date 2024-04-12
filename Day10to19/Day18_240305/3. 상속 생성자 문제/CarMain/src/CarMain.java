/*
class CarMain
{
    public static void main(String[] args)
    {
        HybridWaterCar hwCar = new HybridWaterCar(100,200,300);
        hwCar.showCurrentGauge();
    }
}

class Car	// 기본 연료 자동차
{
    private int gasolineGauge;
    Car(int gasolineGauge)
    {
        this.gasolineGauge = gasolineGauge;
    }

    public int getGasolineGauge()
    {
        return gasolineGauge;
    }
}

class HybridCar extends Car	// 하이브리드 자동차
{
    private int electricGauge;
    HybridCar(int gasolineGauge, int electricGauge)
    {
        super(gasolineGauge);
        this.electricGauge = electricGauge;
    }

    public int getElectricGauge()
    {
        return electricGauge;
    }
}

class HybridWaterCar extends HybridCar		// 하이브리드 워터카
{
    private int waterGauge;
    HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge)
    {
        super(gasolineGauge, electricGauge);
        this.waterGauge = waterGauge;
    }
    public void showCurrentGauge()
    {
        System.out.println("잔여 가솔린 : " + getGasolineGauge());
        System.out.println("잔여 전기량 : " + getElectricGauge());
        System.out.println("잔여 워터량 : " + waterGauge);
    }
}
*/


class CarMain  /// 오버라이딩 방법
{
    public static void main(String[] args)
    {
        HybridWaterCar hwCar = new HybridWaterCar(100,200,300);
        hwCar.showCurrentGauge();
    }
}

class Car	// 기본 연료 자동차
{
    private int gasolineGauge;
    Car(int gasolineGauge)
    {
        this.gasolineGauge = gasolineGauge;
    }

    public void showCurrentGauge()
    {
        System.out.println("잔여 가솔린 : " + gasolineGauge);
    }
}

class HybridCar extends Car	// 하이브리드 자동차
{
    private int electricGauge;
    HybridCar(int gasolineGauge, int electricGauge)
    {
        super(gasolineGauge);
        this.electricGauge = electricGauge;
    }

    public void showCurrentGauge()
    {
        super.showCurrentGauge();
        System.out.println("잔여 전기량 : " + electricGauge);
    }
}

class HybridWaterCar extends HybridCar		// 하이브리드 워터카
{
    private int waterGauge;
    HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge)
    {
        super(gasolineGauge, electricGauge);
        this.waterGauge = waterGauge;
    }
    public void showCurrentGauge()
    {
        super.showCurrentGauge();
        System.out.println("잔여 워터량 : " + waterGauge);
    }
}
