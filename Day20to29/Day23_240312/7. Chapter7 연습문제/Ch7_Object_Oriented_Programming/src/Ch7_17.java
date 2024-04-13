//// 아래 세 개의 클래스로부터 공통부분을 뽑아서 이라는 클래스를
//// 만들고 이 Unit , 클래스를 상속받도록 코드를 변경하시오.
//
//class Marine // 보병
//{
//    int x, y; // 현재 위치
//    void move(int x, int y)  /*지정된 위치로 이동 */
//    {
//
//    }
//    void stop() /*현재 위치에 정지 */
//    {
//
//    }
//    void stimPack() /* 스팀팩을 사용한다*/
//    {
//
//    }
//}
//class Tank // 탱크
//{
//    int x, y; // 현재 위치
//    void move(int x, int y)     /*지정된 위치로 이동 */
//    {
//
//    }
//    void stop() /*현재 위치에 정지*/
//    {
//
//    }
//    void changeMode() /* 공격모드를 변환한다*/
//    {
//
//    }
//}
//class Dropship  // 수송선
//{
//    int x, y; // 현재 위치
//
//    void move(int x, int y) /*    지정된 위치로 이동*/
//    {
//
//    }
//
//
//
//    void stop() /*    현재 위치에 정지*/
//    {
//
//    }
//
//
//
//    void load() /*    선택된 대상을 태운다*/
//    {
//
//    }
//
//
//    void unload()   /*    선택된 대상을 내린다*/
//    {
//
//    }
//
//}

////////////////////////////////////////////////////////////////////////

//class Unit
//{
//    private int x, y; // 현재 위치
//
//    void move(int x, int y)  /*지정된 위치로 이동 */
//    {
//
//    }
//    void stop() /*현재 위치에 정지 */
//    {
//
//    }
//}
//
//class Marine extends Unit // 보병
//{
//    void stimPack() /* 스팀팩을 사용한다*/
//    {
//
//    }
//}
//class Tank extends Unit// 탱크
//{
//    void changeMode() /* 공격모드를 변환한다*/
//    {
//
//    }
//}
//class Dropship  extends Unit// 수송선
//{
//
//    void load() /*    선택된 대상을 태운다*/
//    {
//
//    }
//
//
//    void unload()   /*    선택된 대상을 내린다*/
//    {
//
//    }
//
//}

abstract class Unit // 추상 메서드가 하나라도 있으면 추상클래스
{
    private int x, y; // 현재 위치

    abstract void move(int x, int y);  //추상 메서드 /*지정된 위치로 이동 */

    void stop() /*현재 위치에 정지 */
    {

    }
}

class Marine extends Unit // 보병
{
    @Override
    void move(int x, int y)  /*지정된 위치로 이동 */
    {

    }

    void stimPack() /* 스팀팩을 사용한다*/
    {

    }
}
class Tank extends Unit// 탱크
{
    @Override
    void move(int x, int y)  /*지정된 위치로 이동 */
    {

    }

    void changeMode() /* 공격모드를 변환한다*/
    {

    }
}
class Dropship  extends Unit// 수송선
{
    @Override
    void move(int x, int y)  /*지정된 위치로 이동 */
    {

    }

    void load() /*    선택된 대상을 태운다*/
    {

    }


    void unload()   /*    선택된 대상을 내린다*/
    {

    }

}