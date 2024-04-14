
//1. 메인메소드가 있는 클래스를 만들고, 거기서 객체 복사를 해보자.
class Person implements Cloneable
{
    private String name;
    private int age;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void show()
    {
        System.out.println(name + " " + age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
        //return (Person)super.clone(); //공변반환
    }
}

class PersonMain
{
    public static void main(String[] args)
    {
        Person person = new Person("홍길동", 20);
        try
        {
            Person copyPerson = (Person)person.clone();
            //Person copyPerson = person.clone(); //공변반환
            person.show();
            copyPerson.show();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

    }

}