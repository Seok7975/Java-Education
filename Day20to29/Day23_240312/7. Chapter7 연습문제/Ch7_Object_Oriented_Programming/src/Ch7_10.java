/*
MyTv2 isPowerOn, channel, volume 클래스의 멤버변수 을 클래스 외부에서 접근할
수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
getter setter .
*/


class Ch7_10_MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

/*    public ch7_11_MyTv2(boolean isPowerOn, int channel, int volume) {
        this.isPowerOn = isPowerOn;
        this.channel = channel;
        this.voulme = volume;
    }*/
    public void setChannel(int channel)
    {
        this.channel = channel;
    }

    public int getChannel()
    {
        return channel;
    }


    public void setVolume(int volume)
    {
        this.volume = volume;
    }
    public int getVolume()
    {
        return volume;
    }


}

class Ch7_10
{
    public static void main(String args[])
    {
        Ch7_10_MyTv2 t = new Ch7_10_MyTv2();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
    }
}

