package lesson1;

public class Person {
    static int a;

    private String name;
    private int age;

    public Person(String _name, int age) {
        name = _name;
        this.age = age;
        a = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
