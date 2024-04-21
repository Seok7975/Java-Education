/*
9. 문자열이 있는 신문 클래스
신문작가(쓰레드)는 신문을 쓰고
독자(쓰레드)는 신문을 읽는다.

독자 실행.
작가 실행.
 */

class NewsPaper
{
    String todayNews;

    public void setTodayNews(String news)
    {
        todayNews = news;
    }

    public String getTodayNews()
    {
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

class NewsPaperStory
{
    public static void main(String[] args)
    {
        NewsPaper paper = new NewsPaper();
        NewsReader reader = new NewsReader(paper);
        NewsWriter writer = new NewsWriter(paper);

        try
        {
            reader.join();
            writer.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        writer.run();
        reader.run();
    }
}