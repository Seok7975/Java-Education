/*
13(4_2). 9(4_1)번문제를 동기화가 가능한 상태로 수정하자.
        (독자 두명 생성. 실행)

*/


class NewsPaper
{
    String todayNews;
    boolean isTodayNews = false;

    public void setTodayNews(String news)
    {
        todayNews = news;
        isTodayNews = true;

        synchronized(this)
        {
            notifyAll();
        }
    }

    public String getTodayNews()
    {
        if(isTodayNews == false)
        {
            try
            {
                synchronized (this)
                {
                    wait();
                }
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        return todayNews;
    }
}

class NewsWriter extends Thread //신문작가(쓰레드)는 신문을 쓰고
{
    NewsPaper paper;

    public NewsWriter(NewsPaper paper)
    {
        this.paper = paper;
    }

    public void run()
    {
        paper.setTodayNews("자바의 열기가 뜨겁습니다!");
    }
}

class NewsReader extends Thread //독자(쓰레드)는 신문을 읽는다.
{
    NewsPaper paper;

    public NewsReader(NewsPaper paper)
    {
        this.paper = paper;
    }

    public void run()
    {
        System.out.println("오늘의 뉴스 : " + paper.getTodayNews());
    }
}

class SyncNewsPaperStory
{
    public static void main(String[] args)
    {
        NewsPaper paper = new NewsPaper();
        NewsReader reader1 = new NewsReader(paper);
        NewsReader reader2 = new NewsReader(paper);
        NewsWriter writer = new NewsWriter(paper);

        try
        {
            reader1.start();
            reader2.start();

            Thread.sleep(1000);
            writer.start();

            reader1.join();
            reader2.join();
            writer.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        //writer.run();
        //reader1.run();
        //reader2.run();
    }
}