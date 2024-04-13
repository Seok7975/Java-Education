/*문제 에서 작성한 클래스에 이전 채널 로 이동하는 7-10 MyTv2 (previous channel)
기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
        [Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.*/


class Ch7_11_MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int beforeTheChannel;
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
        beforeTheChannel = this.channel;
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

    public void gotoPrevChannel() //채널 스와핑
    {
        int temp = channel;
        channel = beforeTheChannel;
        beforeTheChannel = temp;
    }

}

class Ch7_11
{
    public static void main(String args[])
    {
        Ch7_11_MyTv2 t = new Ch7_11_MyTv2();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());   //10
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());   //20
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());

    }
}