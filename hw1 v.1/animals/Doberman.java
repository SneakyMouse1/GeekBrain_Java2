package lesson1;

public class Doberman extends Dog {
//    public Doberman(String name) {
//        super(name);
//    }

    String name;
    int age;

    public Doberman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Doberman run");
    }
//    Animal -> Dog -> Doberman
}
