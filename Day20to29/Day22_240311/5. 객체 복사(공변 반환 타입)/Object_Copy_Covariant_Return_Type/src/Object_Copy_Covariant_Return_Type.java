///////굥변 반환 타입

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
    public Person clone() throws CloneNotSupportedException
    {
        return (Person)super.clone();
    }
}


class PersonMain
{

    public static void main(String[] args)
    {
        Person person = new Person("홍길동", 20);
        try
        {
            Person cpyPerson = person.clone();
            person.show();
            cpyPerson.show();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}